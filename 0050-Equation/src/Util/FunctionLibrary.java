/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.util.Scanner;

/**
 *
 * @author quandba
 */


public class FunctionLibrary {
    private final Scanner input = new Scanner(System.in);
    Validation validator = new Validation();

    public Double setNumber(String msg, String regex) {
        Double doubleResult = 0.0;
        boolean passed = true;
        do {
            try {
                System.out.print(msg);
                doubleResult = Double.parseDouble(input.nextLine());
                passed = true;
            } catch (NumberFormatException e) {
                System.out.println("The Input must be a number!");
                passed = false;
            }
        } while (!validator.validatePattern(doubleResult.toString(), regex) || passed == false);
        return doubleResult;
    }
    public Double setNumberCof(String msg, String regex) {
        Double doubleResult = 0.0;
        do {
            try {
                System.out.print(msg);
                doubleResult = Double.parseDouble(input.nextLine());
                if(doubleResult == 0) {
                    System.out.println("Number A is angle coefficient must be other than 0! Please try again!");
                }
            } catch (NumberFormatException e) {
                System.out.println("The Input must be a number!");
            }
        } while (!validator.validatePattern(doubleResult.toString(), regex) || doubleResult == 0);
        return doubleResult;
    }
    public boolean isPerfectSquareNumber(Double number) {
        double sqrt = Math.sqrt(number);
        int roundeSqrt = (int) sqrt;
        return (roundeSqrt * roundeSqrt == number);
    }
}
