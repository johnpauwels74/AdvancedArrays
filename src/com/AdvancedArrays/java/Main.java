package com.AdvancedArrays.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // project to demonstrate the use of an array
        //set up arrays and declare variables
        String[] HotDogStandSupplyArray = {"1. hot dogs", "2. buns", "3. ketchup", "4. mustard", "5. pickles", "6. onions", "7. tomato", "8. salt", "9. pepper"};
        int[] SupplyQuantityArray = {34, 23, 53, 35, 32, 12, 5, 17, 9};
        boolean end = false;
        Scanner sc = new Scanner(System.in);
        int NumberEntered;
        int QuantityChange;
        int OriginalNumber;
        String Input;
        String Output = "";

        //being main while loop
        while (end == false) {
            //loop through items and quantities
            for (int i = 0; i < HotDogStandSupplyArray.length; i++) {
                System.out.println(HotDogStandSupplyArray[i] + " - Quantity: " + SupplyQuantityArray[i]);
            }
                //prompt user to select an item to change
                System.out.println("Select the number of the item you would like to modify the quantity for, or enter 10 to exit: ");
                Input = sc.nextLine();
                NumberEntered = Integer.parseInt(Input);
                //subtract 1 from entered number since array starts at 0. makes more sense to start at 1 for user
                NumberEntered--;
                //make sure that the entered number is in a valid range
                if (NumberEntered < 0 || NumberEntered > 9) {
                    Output = "Invalid entry. Please enter a number between 1 and 10.";
                //if user entered 10, exit while loop
                } else if (NumberEntered == 9){
                    Output = "Exiting...";
                    end = true;
                }
                //continue with change if user entered a valid number
                else {
                    //prompt user for quantity to change
                    System.out.println("Selected: " + HotDogStandSupplyArray[NumberEntered] + " - Quantity: " + SupplyQuantityArray[NumberEntered]);
                    System.out.println("Enter a number to add or subtract from the quantity, use - to subtract(example, -5): ");
                    Input = sc.nextLine();
                    QuantityChange = Integer.parseInt(Input);
                    OriginalNumber = SupplyQuantityArray[NumberEntered];
                    //modify quantity
                    SupplyQuantityArray[NumberEntered] = SupplyQuantityArray[NumberEntered] + QuantityChange;
                    //if the new quantity is less than 0, notify the user with an error message
                    //change new quantity to 0 since a negative quantity is not valid
                    if (SupplyQuantityArray[NumberEntered] < 0) {
                        SupplyQuantityArray[NumberEntered] = 0;
                        System.out.println("Error: New quantity would be less than 0. New quantity has been changed to 0.");
                    }
                    //concatenate output message
                    Output = HotDogStandSupplyArray[NumberEntered] + ", Original Quantity: " + OriginalNumber + ", Added: " + QuantityChange + ", New Quantity: " + SupplyQuantityArray[NumberEntered];
                }
                //display output message
                System.out.println(Output);
            }
    }
}
