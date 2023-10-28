/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author quandba
 */
public class Country {
    protected String countryCode;
    protected String countryName;
    protected double totalArea;

    
    /**
     * Constructors no parameter
     */
    public Country() {
    }
    
    /**
     * Constructors full parameter
     * @param countryCode
     * @param countryName
     * @param totalArea 
     */
    public Country(String countryCode, String countryName, double totalArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.totalArea = totalArea;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }

    public void display(){
        System.out.format("%-15s %-15s %-15s ",countryCode,countryName,totalArea);
    }
    
    
    
}
