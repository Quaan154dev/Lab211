/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Common.Utility;

/**
 *
 * @author quandba
 */
public class Main {

    public static void main(String[] args) {
        ViewDoctor viewDoctor = new ViewDoctor();
        while (true) {
            displayMenu();
            int option = Utility.getInteger("Enter option:", "Wrong", 1, 6);
            switch (option) {
                case 1:
                    viewDoctor.addDoctor();
                    break;
                case 2:
                     viewDoctor.updateDocter();
                    break;
                case 3:
                     viewDoctor.deleteDocter();                                           
                    break;
                case 4:
                     viewDoctor.searchDocter();  
                    break;
                case 5:
                     System.exit(0);
                    break;
                case 6:
                     viewDoctor.showData();
                    break;     
                default:
                    System.out.println("Enter number true");
            }

        }
    }

    private static void displayMenu() {
        System.out.println("================Doctor Management================\n"
                + "1.Add Doctor\n"
                + "2.Update Doctor\n"
                + "3.Delete Doctor\n"
                + "4.Search Doctor\n"
                + "5.Exit\n"
        );
    }
}
