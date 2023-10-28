/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import Util.FunctionLibrary;

/**
 *
 * @author quandba
 */
public class Superlative {
    private TypeOfNumber typeOfNumber = new TypeOfNumber();
    private Double firstNumber;
    private Double secondNumber;
    private Double result;

    FunctionLibrary functionLibrary = new FunctionLibrary();
    public void setFirstNumber(Double firstNumber) {
        this.firstNumber = firstNumber;
        if(firstNumber %2 == 0) {
            typeOfNumber.setEven(firstNumber);
        } else {
            typeOfNumber.setOdd(firstNumber);
        }
        if(functionLibrary.isPerfectSquareNumber(firstNumber)) {
            typeOfNumber.setPerfect(firstNumber);
        }
    }
    public void setSecondNumber(Double secondNumber) {
        this.secondNumber = secondNumber;
        if(secondNumber %2 == 0) {
            typeOfNumber.setEven(secondNumber);
        } else {
            typeOfNumber.setOdd(secondNumber);
        }
        if(functionLibrary.isPerfectSquareNumber(secondNumber)) {
            typeOfNumber.setPerfect(secondNumber);
        }
    }
    public void setResult(Double result) {
        this.result = result;
    }
    public Double getFirstNumber() {
        return firstNumber;
    }
    public Double getSecondNumber() {
        return secondNumber;
    }
    public Double getResult() {
        return result;
    }
    public TypeOfNumber getTypeOfNumber() {
        return typeOfNumber;
    }
    public Superlative() {
        super();
    }
    public void calculateSuperlativeEquationResult() {
        this.result = (double) Math.round(-this.secondNumber / this.firstNumber * 1000) / 1000;

        if(this.result % 2 == 0) {
            this.typeOfNumber.setEven(this.result);
        } else {
            this.typeOfNumber.setOdd(this.result);
        }
        if(functionLibrary.isPerfectSquareNumber(this.result)) {
            this.typeOfNumber.setPerfect(this.result);
        }
    }
    @Override
    public String toString() {
        return "Solution: x = " + this.result + "\n"
                + this.typeOfNumber;
    }
    
}
