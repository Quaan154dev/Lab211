/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Utility.Utility;
import bo.ManagerFruit;

/**
 *
 * @author quandba
 */
public class main {

    public static void main(String[] args) {
        Utility utility = new Utility();
        viewFruit vFruit = new viewFruit();    
        ManagerFruit managerFruit = new ManagerFruit();
        vFruit.mockData();
        while (true) {
            displayMenu();
            int option = Utility.getInteger("Please choice one option:", "Wrong !", 1, 4);
            switch (option) {
                case 1:
                    vFruit.createFruit();
                    break;
                case 2:
                    vFruit.viewOrders();
                    break;
                case 3:
                    vFruit.shopping();
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
        System.out.println("FRUIT SHOP SYSTEM\n"
                + "1.	Create Fruit\n"
                + "2.	View orders\n"
                + "3.	Shopping (for buyer)\n"
                + "4.	Exit"
        );
    }
}
