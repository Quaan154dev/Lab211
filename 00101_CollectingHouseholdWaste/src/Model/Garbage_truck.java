/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;



public class Garbage_truck {
    private int total = 0;
    private int time = 0;
    private final double costLabor = 120000;
    private final double costDump = 57000;
    private int count = 0;
    private ArrayList<Garbage_station> GarbageStations;
    public Garbage_truck() {
        GarbageStations = new ArrayList<>();
    }
    
    public Garbage_truck(int total, int time) {
        this.total = total;
        this.time = time;
    }

    public ArrayList<Garbage_station> getGarbageStations() {
        return GarbageStations;
    }

    public void setGarbageStations(ArrayList<Garbage_station> GarbageStations) {
        this.GarbageStations = GarbageStations;
    }
    
    public void calculate() {
        for (int i = 0; i < GarbageStations.size(); i++) {
            if (total + GarbageStations.get(i).getAmount() > 10000) {
                System.out.println("Dump the garbage.");
                time = time + 30;
                count++;
                total = 0;
            }
            total = total + GarbageStations.get(i).getAmount();
            time = time + 8;
        }
        System.out.println("Dump the garbage.");
        time = time + 30;
        count++;
    }
    public double calculateTheCost() {
        if (GarbageStations.size() != 0)
            calculate();
        double a = (double) time/60;
        return a * costLabor + count * costDump;
    }

    @Override
    public String toString() {
        return "The total cost is: " + calculateTheCost();
    }
}



