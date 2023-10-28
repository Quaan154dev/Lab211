/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author quandba
 */
public class Invoice {

    private String customer;
    private ArrayList<Fruit> listFruitOrder = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(String customer, ArrayList<Fruit> listFruitOrder) {
        this.customer = customer;
        this.listFruitOrder = listFruitOrder;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public ArrayList<Fruit> getListFruitOrder() {
        return listFruitOrder;
    }

    public void setListFruitOrder(ArrayList<Fruit> listFruitOrder) {
        this.listFruitOrder = listFruitOrder;
    }

    @Override
    public String toString() {
        return "Invoice{" + "customer=" + customer + ", listFruitOrder=" + listFruitOrder + '}';
    }
    // thêm trái cây vào list sẻ mua
    public void addFruit(Fruit fruit) {
        Fruit fruitInlist = getFruitById(fruit.getFruitId());// trái cây mua thêm 
        if (fruitInlist == null) {
            listFruitOrder.add(fruit);
        } else {
            fruitInlist.setQuantity(fruitInlist.getQuantity() + fruit.getQuantity());// sẳn có + thêm vào
        }
    }
   // check xem đã từng mua chưa
    private Fruit getFruitById(String fruitId) {
        for (Fruit fruit : listFruitOrder) {
            if (fruit.getFruitId().equalsIgnoreCase(fruitId)) {
                return fruit;
            }
        }
        return null;
    }

    public double getTotal() {
        double total = 0;
        for (Fruit fruit : listFruitOrder) {
            total += fruit.getPrice() * fruit.getQuantity();
        }
        return total;
    }

}
