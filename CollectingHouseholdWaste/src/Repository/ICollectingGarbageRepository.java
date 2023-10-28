/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Model.Garbage_truck;

/**
 *
 * @author hieu
 */
public interface ICollectingGarbageRepository {
    void getInput(Garbage_truck g);
    void printTheCost(Garbage_truck g);
}
