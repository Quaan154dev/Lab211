/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Entity.Quadratic;
import Util.FunctionLibrary;

/**
 *
 * @author quandba
 */
public class QuadraticEquation {
    Quadratic quadraticData;
    FunctionLibrary functionLibrary = new FunctionLibrary();

    public void handleSetQuadraticData() {
        System.out.println();
        Quadratic quadratic = new Quadratic();
        quadratic.setFirstNumber(functionLibrary.setNumberCof("Enter number A: ", "^[-+]?\\d*\\.?\\d+$"));
        quadratic.setSecondNumber(functionLibrary.setNumber("Enter number B: ", "^[-+]?\\d*\\.?\\d+$"));
        quadratic.setThirdNumber(functionLibrary.setNumber("Enter number C: ", "^[-+]?\\d*\\.?\\d+$"));
        quadratic.calculateQuadraticResult();
        quadraticData = quadratic;
        handleDisplayQuadraticData();
    }
    public void handleDisplayQuadraticData() {
        System.out.println(quadraticData);
    }
}
