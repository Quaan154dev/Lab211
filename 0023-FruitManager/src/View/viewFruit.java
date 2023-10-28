/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Fruit;
import Model.Invoice;
import Utility.Utility;
import bo.ManagerFruit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author quandba
 */
public class viewFruit {

    private static final Scanner scanner = new Scanner(System.in);
    ManagerFruit manager = new ManagerFruit();
    Utility utility = new Utility();
    ArrayList<Invoice> invoiceOrder = new ArrayList<>();// dánh sách tất cả phiếu order
    List<Fruit> fruitList = manager.getListFruit();

    void mockData() {
        manager.addFruit(new Fruit("1", "Coconut", "Mỹ", 100, 100));
        manager.addFruit(new Fruit("2", "Apple", "Mỹ", 100, 100));
        manager.addFruit(new Fruit("3", "Banana", "Mỹ", 100, 100));
        manager.addFruit(new Fruit("4", "Organe", "VN", 100, 100));
    }

    void createFruit() {
        String id, name, Origin;
        double Price;
        int Quantity;
        String choice;

        do {
            while (true) {
                id = Utility.getString("Enter id Fruit:", "Wrong !", utility.REGEX_STRING);
                if (manager.isDuplicaseID(id)) {
                    System.out.println("Duplicase id !!!");
                } else {
                    break;
                }
            }
            name = Utility.getString("Enter Name Fruit :", "Wrong!", utility.REGEX_STRING);
            Origin = Utility.getString("Enter Origin Fruit :", "Wrong ", utility.REGEX_STRING);
            Price = Utility.getDouble("Enter Prite Fruit :", "Wrong!", 0, Double.MAX_VALUE);
            Quantity = Utility.getInteger("Enter quality Fruit : ", "Must is integer number !", 1, Integer.MAX_VALUE);

            Fruit fruit = new Fruit(Origin, name, Origin, Price, Quantity);
            System.out.println("Create success!!");
            manager.addFruit(fruit);
            System.out.println("Do you want to continue (Y/N)?");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("Y"));
        displayListFruit(fruitList);
    }

    private void displayListFruit(List<Fruit> fruitList) {
        System.out.format("%-4s%-15s%-17s%-17s%-15s\n", "| ++Item++ |", "| ++Name++ |", "| ++Price++ |", "| ++Quantity++ |", "| ++Origin++ |");
        for (Fruit fruit : fruitList) {
            System.out.println(fruit);
        }
    }

    void viewOrders() {
        if (invoiceOrder.isEmpty()) {
            System.out.println("Empty List");
            return;
        } else {
            for (Invoice invoice : invoiceOrder) {
                System.out.println("Customer :" + invoice.getCustomer());
                System.out.format("%-10s %-10s %-10s %-10s\n", "Product |", "Quantity |", "Price |", "Amount");
                for (Fruit fruit : invoice.getListFruitOrder()) {
                    System.out.format("%-10s %-10s %-10s %-10s\n", fruit.getFruitName(),
                            fruit.getQuantity(), fruit.getPrice(), fruit.getAmount());
                }
                System.out.println("Total :" + invoice.getTotal());
            }
        }
    }


    void shopping() {
        if (fruitList.isEmpty()) {
            System.out.println("Empty Fruit !!!");
            return;
        }
        Invoice invoice = new Invoice();
        String choiceWantOrder;
        do {
            displayListFruit(fruitList);
            //enter item and display item
            
            Fruit fruitChoice ;  // trái cây lấy trong kho
            while (true) {
                String item = Utility.getString("Enter item :", "Wrong !", utility.REGEX_STRING);

                fruitChoice = getFruitByID(item);

                if (fruitChoice == null) {
                    System.out.println("Wrong item , choice  again !");
                } else {
                    System.out.println("You seclected :" + fruitChoice.getFruitName());
                    break;
                }
            }
            //enter quatity
            int quatityOrder = Utility.getInteger("Please input quantity :", "Wrong !", 0, fruitChoice.getQuantity());// mua ít hơn số lượng góc có
            // set lại số lg trong kho
            fruitChoice.setQuantity(fruitChoice.getQuantity() - quatityOrder);
            // Xoá hết trái cây nếu mua hết quantity
            if (fruitChoice.getQuantity() == 0) {
                fruitList.remove(fruitChoice);
            }
            Fruit fruitOrder = new Fruit(fruitChoice.getFruitId(), fruitChoice.getFruitName(), fruitChoice.getOrigin(),
                    fruitChoice.getPrice(), quatityOrder);// trái cây sẻ mua (khác nhau về quantity so với cái fruitChoice)

            // add fruitOrder vào hoá đơn mua     
            invoice.addFruit(fruitOrder);
            System.out.println("Do you want to order now (Y/N) ?");
            choiceWantOrder = scanner.nextLine();
        } while (choiceWantOrder.equalsIgnoreCase("N"));
        System.out.format("%-10s %-10s %-10s %-10s\n", "Product", "Quantity ", "Price", "Amount");
        for (Fruit fruit : invoice.getListFruitOrder()) {
            System.out.format("%-10s %-10s %-10s %-10s\n", fruit.getFruitName(),
                    fruit.getQuantity(), fruit.getPrice(), fruit.getAmount());
        }
        System.out.println(invoice.getTotal() + "$");
        String customer = Utility.getString("Enter customer :", "Wrong !", utility.REGEX_STRING);
        invoice.setCustomer(customer);
        invoiceOrder.add(invoice);// bảo vào list mua làm cn2
    }

    private Fruit getFruitByID(String item) {
        for (Fruit fruit : fruitList) {
            if (fruit.getFruitId().equals(item)) {
                return fruit;
            }
        }
        return null;
    }

}
