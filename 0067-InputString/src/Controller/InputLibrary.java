/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.Scanner;

/**
 *
 * @author quandba
 */
public class InputLibrary {
    private final Scanner input = new Scanner(System.in);

    public String setStringValue(String msg) {
        String stringValue;
        do {
            System.out.print(msg);
            stringValue = input.nextLine().trim();
        } while (stringValue.length() == 0);
        return stringValue;
    }
}
