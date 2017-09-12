package com.AdvancedArrays.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // project to demonstrate the use of an array
        String[] HotDogStandSupplyArray = {"1. hot dogs", "2. buns", "3. ketchup", "4. mustard", "5. pickles", "6. onions", "7. tomato", "8. salt", "9. pepper"};
        int[] SupplyQuantityArray = {34, 23, 53, 35, 32, 12, 5, 17, 9};
        boolean end = false;
        Scanner sc = new Scanner(System.in);
        int NumberEntered;
        int QuantityChange;
        int OriginalNumber;
        String Input;
        String Output = "";


        while (end == false) {
            for (int i = 0; i < HotDogStandSupplyArray.length; i++) {
                System.out.println(HotDogStandSupplyArray[i] + " - Quantity: " + SupplyQuantityArray[i]);
            }
                System.out.println("Select the number of the item you would like to modify the quantity for, or enter 10 to exit: ");
                Input = sc.nextLine();
                NumberEntered = Integer.parseInt(Input);
                NumberEntered--;

                if (NumberEntered < 0 || NumberEntered > 9) {
                    Output = "Invalid entry. Please enter a number between 1 and 10.";
                } else if (NumberEntered == 9){
                    Output = "Exiting...";
                    end = true;
                }
                else {
                    System.out.println("Selected: " + HotDogStandSupplyArray[NumberEntered] + " - Quantity: " + SupplyQuantityArray[NumberEntered]);
                    System.out.println("Enter a number to add or subtract from the quantity, use - to subtract(example, -5): ");
                    Input = sc.nextLine();
                    QuantityChange = Integer.parseInt(Input);
                    OriginalNumber = SupplyQuantityArray[NumberEntered];
                    SupplyQuantityArray[NumberEntered] = SupplyQuantityArray[NumberEntered] + QuantityChange;
                    if (SupplyQuantityArray[NumberEntered] < 0) {
                        SupplyQuantityArray[NumberEntered] = 0;
                        System.out.println("Error: New quantity would be less than 0. New quantity has been changed to 0.");
                    }
                    Output = HotDogStandSupplyArray[NumberEntered] + "Quantity Value: " + OriginalNumber + ", Added: " + QuantityChange + ", New Quantity: " + SupplyQuantityArray[NumberEntered];
                }
                System.out.println(Output);
            }

    }
}
