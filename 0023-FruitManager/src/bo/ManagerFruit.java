/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import Model.Fruit;
import Utility.Utility;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quandba
 */
public class ManagerFruit {
    Utility utility = new Utility();
    
    List<Fruit>  listFruit;
    
    public ManagerFruit() {
        listFruit  = new ArrayList<>();
    }

    public List<Fruit> getListFruit() {
        return listFruit;
    }

    public void setListFruit(List<Fruit> listFruit) {
        this.listFruit = listFruit;
    }
    
    public void addFruit(Fruit fruit) {
        listFruit.add(fruit);
    }

    public boolean isDuplicaseID(String id) {
        for (Fruit fruit : listFruit) {
            if(fruit.getFruitId().equalsIgnoreCase(id)){
              return  true;
            }
        }
        return false;
    }
    
    
    
    
    
    
}
