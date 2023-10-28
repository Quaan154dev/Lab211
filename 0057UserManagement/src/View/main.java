/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;


import Common.ManageAccount;
import Common.Validation;

/**
 *
 * @author quandba
 */
public class main {

    public static void main(String[] args) {
        ViewUser viewUser = new ViewUser();
        String fileName = "user.dat";
        ManageAccount ma = new ManageAccount();
        while (true) {
            displayMenu();
            int option = Validation.getInt("> Choose: ", "The option must be a decimal number",  1, 3);
            switch (option) {
                case 1:
                    ma.createNewAccount(fileName);
                    break;
                case 2:
                    ma.loginSystem(fileName);
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
        System.out.println("=================== USER MANAGEMENT SYSTEM======================\n"
                + "1.Create a new account\n"
                + "2.Login system\n"
                + "3.Exit\n"
        );
    }
}
