package navarez_problem2;

import java.util.Scanner;

/**
 *
 * @author NAVAREZ_CPE113
 */
public class Navarez_Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    
        // Sets comma and spaces as delimiters
        input.useDelimiter("[,\\s]+");

        // Reads the two numbers
        int a = input.nextInt();
        int b = input.nextInt();

        // Checks if both numbers are zero
        if (a == 0 && b == 0) {
            System.out.println("undefined for 0 and 0");
        } else {

            // Calculates and displays the GCD
            int result = gcd(a, b);
            System.out.println(result);
        }

        input.close();
    }

    // Finds the GCD using recursion
    static int gcd(int a, int b) {

        // Base case: stops when b is 0
        if (b == 0) {
            return a;
        }

        // Recursive case: uses the remainder
        return gcd(b, a % b);
    }
}