/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Common.DoctorManager;
import Common.Utility;
import Model.Doctor;
import java.util.List;

/**
 *
 * @author quandba
 */
public class ViewDoctor {

    DoctorManager doctorManager = new DoctorManager();

    void addDoctor() {
        System.out.println("--------- Add Doctor ----------");
        String code, name, specialization;
        int availability;

        while (true) {
            code = Utility.getString("Enter Docter ID: ", "Code must be a string !", "[a-zA-Z0-9 ]+");
            //1.check code is duplicase 
            if (doctorManager.isDuplicaseCode(code)) {
                System.out.println("Duplicase code !!!");
            } else {
                break;
            }
        }

        name = Utility.getString("Enter Doctor name  :", "Wrong !", "[a-zA-Z ]+");
        specialization = Utility.getString("Enter Doctor Specialization  :", "Wrong !", "[a-zA-Z ]+");
        availability = Utility.getInteger("Enter Doctor Availability :", "Wrong !", 1, Integer.MAX_VALUE);
        Doctor doctor = new Doctor(code, name, specialization, availability);
        doctorManager.addDoctor(doctor);

        doctorManager.writeToFile();

    }

    void updateDocter() {
        // load data to file
        doctorManager.loadData();

        // check id exist in file
        String codeUpdate = Utility.getString("Enter code :", "Code must be a string", "[a-zA-Z0-9 ]+");

        Doctor doctor = doctorManager.checkData(codeUpdate);

        if (doctor == null) {
            System.out.println("Not found !!!");
        } else {
            String codeWillUpdate, name, specialization;
            while (true) {
                codeWillUpdate = Utility.getString("Enter Docter ID: ", "Code must be a string !", "[a-zA-Z0-9 ]+");
                //1.check code is duplicase 
                if (doctorManager.isDuplicaseCode(codeWillUpdate)) {
                    System.out.println("Duplicase code !!!");
                } else {
                    break;
                }
            }
            name = Utility.getString("Enter Doctor name  :", "Wrong !", "[a-zA-Z ]+");
            specialization = Utility.getString("Enter Doctor Specialization  :", "Wrong !", "[a-zA-Z ]+");
            int availability = Utility.getInteger("Enter Doctor Availability :", "Wrong !", 1, Integer.MAX_VALUE);
            //update
            doctor.setCode(codeWillUpdate);
            doctor.setName(name);
            doctor.setSpecialization(specialization);
            doctor.setAvailability(availability);

            //write lại file
            doctorManager.writeToFile();
        }

    }

    void showData() {
        doctorManager.loadData();
//        for (Doctor doctor : doctorManager.getListDoctors()) {
//            System.out.println(doctor);
//        }
    }

    void deleteDocter() {
        doctorManager.loadData();
        String codeDelete = Utility.getString("Enter code :", "Code must be a string", "[a-zA-Z0-9 ]+");
        Doctor doctor = doctorManager.checkData(codeDelete);

        if (doctor == null) {
            System.out.println("Not found !!!");
        } else {
            doctorManager.removeDoctor(doctor);
            doctorManager.writeToFile();
        }

    }

    void searchDocter() {
        doctorManager.loadData();
        String text = Utility.getString("Enter code :", "Code must be a string", "[a-zA-Z0-9 ]+");
        List<Doctor> listSearch = doctorManager.findDoctorByText(text);

        if (listSearch.isEmpty()) {
            System.out.println("Not found");
        } else {
            System.out.println("--------- Result ------------");
            System.out.format("%-7s%-12s%-18s%s\n", "Code", "Name", "Specialization", "Availability");           
            for (Doctor doctor : listSearch) {
                System.out.println(doctor);
            }
        }
    }

}
