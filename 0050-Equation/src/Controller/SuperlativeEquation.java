/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Entity.Superlative;
import Util.FunctionLibrary;

/**
 *
 * @author quandba
 */
public class SuperlativeEquation {
    Superlative superlativeData;
    FunctionLibrary functionLibrary = new FunctionLibrary();

    public void handleSetSuperlativeData() {
        System.out.println();
        Superlative superlative = new Superlative();
        superlative.setFirstNumber(functionLibrary.setNumberCof("Enter number A: ", "^[-+]?\\d*\\.?\\d+$"));
        superlative.setSecondNumber(functionLibrary.setNumber("Enter number B: ", "^[-+]?\\d*\\.?\\d+$"));
        superlative.calculateSuperlativeEquationResult();
        superlativeData = superlative;
        handleDisplaySuperlativeData();
    }
    public void handleDisplaySuperlativeData() {
        System.out.println(superlativeData + "quan");
    }
}