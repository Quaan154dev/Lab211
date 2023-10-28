/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Common.Library;
import Model.Garbage_station;
import Model.Garbage_truck;
import java.util.ArrayList;

/**
 *
 * @author hieu
 */
public class CollectingGarbageDao {
    Library l = new Library();
    private static CollectingGarbageDao instance = null;
    public static CollectingGarbageDao Instance() {
        if (instance == null)
            synchronized (CollectingGarbageDao.class) {
                if (instance == null)
                    instance = new CollectingGarbageDao();
            }
        return instance;        
    }
    public void getFakeInput(ArrayList<Garbage_station> garbageStations) {
//1765 2808 952 4206 3102 3902 1292 3985 8324 1928 4426 397 3277
        garbageStations.add(new Garbage_station(1, 1765));
        garbageStations.add(new Garbage_station(2, 2808));
        garbageStations.add(new Garbage_station(3, 952));
        garbageStations.add(new Garbage_station(4, 4206));
        garbageStations.add(new Garbage_station(5, 3102));
        garbageStations.add(new Garbage_station(6, 3902));
        garbageStations.add(new Garbage_station(7, 1292));
        garbageStations.add(new Garbage_station(8, 3985));
        garbageStations.add(new Garbage_station(9, 8324));
        garbageStations.add(new Garbage_station(10, 1928));
        garbageStations.add(new Garbage_station(11, 4426));
        garbageStations.add(new Garbage_station(12, 397));
        garbageStations.add(new Garbage_station(13, 3277));
    }
    public void getInput(Garbage_truck g) {
//        int id = generateId(garbageStations);
//        int amount = l.getInt("Amount: ");
//        garbageStations.add(new Garbage_station(id, amount));
        getFakeInput(g.getGarbageStations());
        System.out.println("Added successfully");
    }
    public void printTheCost(Garbage_truck g) {
        System.out.println(g);
    }

    private int generateId(ArrayList<Garbage_station> garbageStations) {
        return garbageStations.size() + 1;
    }
}
