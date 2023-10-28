package View;

import Controller.QuadraticEquation;
import Controller.SuperlativeEquation;
import Util.Utility;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author quandba
 */
public class Main {
    public static void main(String[] args) {
    QuadraticEquation quadraticEquation = new QuadraticEquation();
    SuperlativeEquation superlativeeEquation = new SuperlativeEquation();
        
        while (true) {
            displayMenu();
            int option = Utility.getInteger("Enter option:", "Wrong", 1, 3);
            switch (option) {
                case 1:
                    superlativeeEquation.handleSetSuperlativeData();
                    break;
                case 2:
                    quadraticEquation.handleSetQuadraticData();
                    break; 
                case 3:
                    System.exit(0);
                    break;    
                default:
                    System.out.println("Enter number true");
            }

        }

    }

    private static void displayMenu() {
        System.out.println("=============Equation Program============\n"
                + "1.Calculate Superlative Equation\n"
                + "2.Calculate Quadratic Equation\n"
                + "3.Exit\n"
                + "Please choice one option:\n");
    }
}
