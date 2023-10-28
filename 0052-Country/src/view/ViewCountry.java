/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bo.ManageEastAsiaCountry;
import constant.countryConstant;
import util.Utility;
import entity.EastAsiaCountry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author quandba
 */
public class ViewCountry {

    ManageEastAsiaCountry bo = new ManageEastAsiaCountry();

    void mockData() {
        bo.addCountry(new EastAsiaCountry("VN", "VIETNAM", 123, "123"));
        bo.addCountry(new EastAsiaCountry("IDN", "Indonesia", 123, "123"));
        bo.addCountry(new EastAsiaCountry("SGP", "Singapore", 123, "123"));
        bo.addCountry(new EastAsiaCountry("TL", "ThaiLan", 123, "123"));

    }

    void inputCountry() {
        //require input information
        String code, name, terrain;
        double area;
        // check valid data
        while (true) {
            code = Utility.getString("Enter code of country:", "Wrong", countryConstant.REGEX_CODE);
            //1.check code is duplicase 
            if (bo.isDuplicaseCode(code)) {
                System.out.println("Duplicase code !!!");
            } else {
                break;
            }
        }
        while (true) {
            name = Utility.getString("Enter name of country:", "Wrong", countryConstant.REGEX_NAME);
            //2.check code is duplicase 
            if (bo.isDuplicaseName(name)) {
                System.out.println("Duplicase name !!!");
            } else {
                break;
            }
        }

        area = Utility.getDouble("Enter total Area:", "Wrong", 1, Double.MAX_VALUE);

        terrain = Utility.getString("Enter name of terrain:", "Wrong", countryConstant.REGEX_TERRAIN);

        // create instance
        EastAsiaCountry country = new EastAsiaCountry(code, name, area, terrain);
        // add to collections

        bo.addCountry(country);
    }

    void displayCountryJustInput() {
        //lấy cái List ra đã
        List<EastAsiaCountry> list = bo.getListCountry();
        // lấy quốc gia ở vị trí cuối (hay mới nhập)
        EastAsiaCountry country = list.get(list.size() - 1);

        // kiểm tra collection có rổng ko
        if (list.isEmpty()) {
            System.out.println("List empty !");
            return;
        }
        System.out.format("%-15s %-15s %-15s %-15s\n", "ID", "Name", "Total Area", "Terrain");
//        for (int i = 0; i < list.size(); i++) {
//            list.get(i).display();
//        }
        country.display();
    }

    void searchCountry() {
        // input name 
        String inputNameSearch = Utility.getString("Enter name want to search", "Wrong !!", countryConstant.REGEX_NAME);

        // search
        List<EastAsiaCountry> list = bo.findCountriesByName(inputNameSearch);// list chứa all dử kiện gần gióng với content tìm

        if (list.isEmpty()) {
            System.out.println("Not Found");
        } else {
            System.out.format("%-15s %-15s %-15s %-15s\n", "ID", "Name", "Total Area", "Terrain");
            for (EastAsiaCountry eastAsiaCountry : list) {
                eastAsiaCountry.display();
            }
        }
    }

    void displayCountryJustInput2() {
        List<EastAsiaCountry> list = bo.getListCountry();
        System.out.format("%-15s %-15s %-15s %-15s\n", "ID", "Name", "Total Area", "Terrain");
        for (EastAsiaCountry eastAsiaCountry : list) {
            eastAsiaCountry.display();
        }
    }

    void sortCountries() {
        List<EastAsiaCountry> listSort = new ArrayList<>();
        listSort.addAll(bo.getListCountry());
        
        // sort về string thì dùng collections.sort
        Collections.sort(listSort, new Comparator<EastAsiaCountry>() {
            @Override
            public int compare(EastAsiaCountry o1, EastAsiaCountry o2) {
                return o1.getCountryName().compareToIgnoreCase(o2.getCountryName());
            }
        });
        // display ra
        for (EastAsiaCountry eastAsiaCountry : listSort) {
            eastAsiaCountry.display();
        }
    }

}
