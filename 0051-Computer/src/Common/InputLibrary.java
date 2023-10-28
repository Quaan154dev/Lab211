/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.util.Scanner;

/**
 *
 * @author quandba
 */
public class InputLibrary {
    private final Scanner input = new Scanner(System.in);
    Validation validator = new Validation();
    
    public Double setDoubleValue (String msg, String regex) {
        Double doubleValue = 0.0;
        do {
           try {
                System.out.print(msg);
                doubleValue = Double.parseDouble(input.nextLine());
           } catch (NumberFormatException e) {
                System.out.println("Please enter a number!");
           }
        } while (!validator.validatePattern(doubleValue.toString(), regex) || doubleValue == 0);
        return doubleValue;
    } 

    public String setStringValue(String msg, String regex, String alert) {
        String stringValue;
        do {
            System.out.print(msg);
            stringValue = input.nextLine().trim();
            if(!validator.validatePattern(stringValue, regex)) {
                System.out.println(alert);
            }
        } while (!validator.validatePattern(stringValue, regex) || stringValue.length() == 0);
        return stringValue;
    }
    public String setStringValue(String msg) {
        String stringValue;
        System.out.print(msg);
        stringValue = input.nextLine().trim();
        return stringValue;
    }
}

