/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Common.Utility;
import Controller.ContactManagement;

/**
 *
 * @author quandba
 */
public class Main {
    public static void main(String[] args) { 
        Utility utility = new Utility();
        ContactManagement contactManagement = new ContactManagement();
        while (true) {   
            displayMenu();
            int option =  Common.Utility.getInteger("Enter option:", "Wrong", 1, 4);
            switch (option) {
                case 1:
                    contactManagement.addSoccer();
                    break;
                case 2:
                    contactManagement.displayContacts();
                    break;
                case 3:
                    contactManagement.handleRemoveContact();
                    break;
                case 4:
                    System.exit(0);
                    break;    
                default:
                    System.out.println("Enter number true");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n================= Contact Program ====================\n"
                + "1. Add a Contact\n"
                + "2. Display all contacts\n"
                + "3. Delete a contact\n"
                + "4. Exit\n"
        );
    }
}
