/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main2;

import java.util.Scanner;

/**
 *
 * @author NAVAREZ_CPE113
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("[,\\s]+");
        int a = input.nextInt();
        int b = input.nextInt();
//validate
        if (a == 0 && b == 0) {
            System.out.println("undefined for o and 0");
        } else {
            int result = gcd(a, b);
            System.out.println(result);
        }

    }
//Recursive method find GCD

    static int gcd(int a, int b) {
        //base case
        if (b == 0) {
            return a;
        }
        //recursive case
        return gcd(b, a % b);
    }

}
