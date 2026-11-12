/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package navarez_problem3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String line = input.nextLine();

        // Remove braces and spaces from the input
        line = line.replace("{", "").replace("}", "").replace(" ", "");

        // Separate the numbers using commas
        String[] numbers = line.split(",");

        // Create an array to store the integer values
        int[] values = new int[numbers.length];

        // Convert each string value into an integer
        for (int i = 0; i < numbers.length; i++) {
            values[i] = Integer.parseInt(numbers[i]);
        }

        // Display the sum, largest number, and count of even numbers
        System.out.println();
        System.out.println(arraySum(values, 0) + ", "
                + findMaximum(values, 0) + ", "
                + countEven(values, 0));

        input.close();
    }

    // Finds the sum of all numbers in the array
    public static int arraySum(int[] values, int index) {

        // Stop when all array elements have been checked
        if (index == values.length) {
            return 0;
        }

        // Add the current number to the sum of the remaining elements
        return values[index] + arraySum(values, index + 1);
    }

    // Finds the largest number in the array
    public static int findMaximum(int[] values, int index) {

        // Return the last element when only one element remains
        if (index == values.length - 1) {
            return values[index];
        }

        // Find the largest number among the remaining elements
        int maximum = findMaximum(values, index + 1);

        // Compare the current number with the largest number found
        if (values[index] > maximum) {
            return values[index];
        } else {
            return maximum;
        }
    }

    // Counts the number of even elements in the array
    public static int countEven(int[] values, int index) {

        // Stop when the end of the array is reached
        if (index == values.length) {
            return 0;
        }

        // Check if the current number is divisible by two
        if (values[index] % 2 == 0) {
            return 1 + countEven(values, index + 1);
        } else {
            // Move to the next element without increasing the count
            return countEven(values, index + 1);
        }
    }
}
