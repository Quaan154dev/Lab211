/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Garbage_truck;
import Repository.CollectingGarbageRepository;
import Repository.ICollectingGarbageRepository;
import View.Menu;


public class ManagerMenu extends Menu<String> {

    private ICollectingGarbageRepository garbageRepository;
    static String[] options = {"Input", "Print", "Exit"};
    Garbage_truck g;

    public ManagerMenu() {
        super("===== COLLECTING GARBAGE MANAGEMENT =====", options);
        garbageRepository = new CollectingGarbageRepository();
        g = new Garbage_truck();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                garbageRepository.getInput(g);
            case 2:
                garbageRepository.printTheCost(g);
            case 3:
                System.exit(0);
        }
    }
}
