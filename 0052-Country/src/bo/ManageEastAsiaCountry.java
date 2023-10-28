/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.EastAsiaCountry;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quandba
 */
public class ManageEastAsiaCountry {
    List<EastAsiaCountry>  listCountry ;

    public ManageEastAsiaCountry() {
        listCountry  = new ArrayList<>();
    }

    public List<EastAsiaCountry> getListCountry() {
        return listCountry;
    }

    public void setListCountry(List<EastAsiaCountry> listCountry) {
        this.listCountry = listCountry;
    }
    
    
    

    public boolean isDuplicaseCode(String code) {
        for (EastAsiaCountry eastAsiaCountry : listCountry) {
            if(eastAsiaCountry.getCountryCode().equalsIgnoreCase(code)){
               return  true;
            }
        }
        return false;
    }
    
    public boolean isDuplicaseName(String name) {
        for (EastAsiaCountry eastAsiaCountry : listCountry) {
            if(eastAsiaCountry.getCountryName().equalsIgnoreCase(name)){
               return  true;
            }
        }
        return false;
    }

    public void addCountry(EastAsiaCountry country) {
        listCountry.add(country);
    }

    public List<EastAsiaCountry> findCountriesByName(String inputNameSearch) {
        inputNameSearch = inputNameSearch.toUpperCase();
        List<EastAsiaCountry> listFound = new ArrayList<>();// cái giỏ chứa những thg trùng với từ khoá mk tìm
        for (EastAsiaCountry eastAsiaCountry : listCountry) {
            if(eastAsiaCountry.getCountryName().toUpperCase().contains(inputNameSearch)){
                listFound.add(eastAsiaCountry);
            }
        }
        return listFound;
    }

    
    
    

    
    
    
    
    
}
