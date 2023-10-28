/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import Controller.ConstDoctor;
import Model.Doctor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quandba
 */
public class DoctorManager {

    List<Doctor> listDoctor;

    public DoctorManager() {
        listDoctor = FileProcess.readToFile(ConstDoctor.FILE_NAME);
    }

    public List<Doctor> getListDoctors() {
        return listDoctor;
    }

    public DoctorManager(List<Doctor> listDoctor) {
        this.listDoctor = listDoctor;
    }

    public void addDoctor(Doctor country) {
        listDoctor.add(country);
    }

    public boolean isDuplicaseCode(String code) {
        for (Doctor doctor : listDoctor) {
            if (doctor.getCode().equalsIgnoreCase(code)) {
                return true;
            }
        }
        return false;
    }

    public void writeToFile() {
        FileProcess.writeToFile(ConstDoctor.FILE_NAME, listDoctor);
    }

    public void loadData() {
        listDoctor = FileProcess.readToFile(ConstDoctor.FILE_NAME);
    }

    public Doctor checkData(String codeUpdate) {
        for (Doctor doctor : listDoctor) {
            if (doctor.getCode().contains(codeUpdate)) {
                return doctor;
            }
        }
        return null;
    }

    public void removeDoctor(Doctor doctor) {
        listDoctor.remove(doctor);
    }

    public List<Doctor> findDoctorByText(String text) {
        List<Doctor> listSearch = new ArrayList<>();
        for (Doctor doctor : listDoctor) {
            if (doctor.getCode().contains(text) || (doctor.getAvailability() + "").contains(text)
                    || doctor.getName().contains(text) || doctor.getSpecialization().contains(text)) {
                listSearch.add(doctor);
            }
        }
        return listSearch;
    }
}
