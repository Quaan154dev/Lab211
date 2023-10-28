/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author quandba
 */
public class Fruit {
    private String FruitId ,FruitName  , Origin;
    private double Price;
    private int Quantity;

    public Fruit() {
    }

    public Fruit(String FruitId, String FruitName, String Origin, double Price, int Quantity) {
        this.FruitId = FruitId;
        this.FruitName = FruitName;
        this.Origin = Origin;
        this.Price = Price;
        this.Quantity = Quantity;
    }

    public String getFruitId() {
        return FruitId;
    }

    public void setFruitId(String FruitId) {
        this.FruitId = FruitId;
    }

    public String getFruitName() {
        return FruitName;
    }

    public void setFruitName(String FruitName) {
        this.FruitName = FruitName;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    
    public double getAmount(){
        return  Quantity * Price;
    }

    @Override
    public String toString() {
        return  String.format("      %-7s %-15s %-20s %-15s %-15s ", FruitId , FruitName, Price +"$", Quantity,Origin);
    }
    
    
    
}
