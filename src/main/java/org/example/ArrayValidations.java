package org.example;

import io.cucumber.java.sl.In;

public class ArrayValidations {
        public static void main(String[] args) {

            treeMethod();
//            int[] numbers = {5, 7, 2, 9, 3, 8}; // Example array
//            int[] numbers = {1,3,2,}; // Example array
//
//
//            // Initialize two variables to track highest and second highest
//            int highest = Integer.MIN_VALUE; // Smallest possible value initially
//            int secondHighest = Integer.MIN_VALUE;
//
//            for (int num : numbers) { // Loop through each number in the array
//                if (num > highest) {
//                    // If current number is greater than the highest, update both
//                    secondHighest = highest;
//                    highest = num;
//                } else if (num > secondHighest && num != highest) {
//                    // If current number is greater than secondHighest and not equal to highest, update secondHighest
//                    secondHighest = num;
//                }
//            }
//
//            if (secondHighest == Integer.MIN_VALUE) {
//                System.out.println("No second highest number found."); // Handle arrays with duplicates
//            } else {
//                System.out.println("Second highest number is: " + secondHighest);
//            }
        }

        private static void treeMethod(){
            int rows = 5;
            for(int i=1;i<rows;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }

        }

    }
