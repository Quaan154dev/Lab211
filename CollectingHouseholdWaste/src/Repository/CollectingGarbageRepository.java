/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import DataAccess.CollectingGarbageDao;
import Model.Garbage_truck;

/**
 *
 * @author hieu
 */
public class CollectingGarbageRepository implements ICollectingGarbageRepository{

    @Override
    public void getInput(Garbage_truck g) {
        CollectingGarbageDao.Instance().getInput(g);
    }

    @Override
    public void printTheCost(Garbage_truck g) {
        CollectingGarbageDao.Instance().printTheCost(g);
    }
    
}
