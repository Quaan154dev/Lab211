/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Common.Utility;
import Controller.WorkerManager;
import Controller.ConstWorker;
import Model.History;
import Model.Worker;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quandba
 */
public class ViewWorker {

    WorkerManager workerManager = new WorkerManager();
    Worker worker = new Worker();
    
    public void addmockdata(){
       workerManager.addWorker(new Worker("de1", "quan", 20, 200, "home"));
       workerManager.addWorker(new Worker("de12", "quandao", 20, 300, "home"));
       workerManager.addWorker(new Worker("de123", "quanba", 20, 400, "home"));
    }

    public void addWorks() {
        System.out.println("--------- Add Worker ----------");
        String id, name, workLocation;
        int age;
        double salary;

        while (true) {
            id = Utility.getString("Enter Worker ID: ", "Code must be a string !", "[a-zA-Z0-9]+");
            //1.check code is duplicase 
            if (workerManager.isDuplicaseCode(id)) {
                System.out.println("Duplicase code !!!");
            } else {
                break;
            }
        }
        age = Utility.getInteger("Enter age : ", "Wrong !", 18, 50);
        name = Utility.getString("Enter name :", "Wrong !", ConstWorker.REGEX_NAME);
        salary = Utility.getDouble("Enter salary:", "Wrong !", 0, Double.MAX_VALUE);
        workLocation = Utility.getString("Enter work Location :", "Wrong !", ConstWorker.REGEX_WORKLOCATION);
        Worker worker = new Worker(id, name, age, salary, workLocation);
        workerManager.addWorker(worker);
//        workerManager.writeToFile();
        System.out.println("add worker success !");
    }
    List<History>  listHistorys = new ArrayList<>();

    public void changeIncreaseSalary() {
//        workerManager.loadData();
        System.out.println("---------------------Up/Down Salary----------------------");
        String codeID = Utility.getString("Enter id :", "Code must be a string", "[a-zA-Z0-9 ]+");
        Worker worker = workerManager.checkData(codeID);
        if (worker == null) {
            System.out.println("code id not existed in DB.!!!");
        } else {
            double salaryCurrent = worker.getSalary();
            double salaryUpdate;
            while (true) {
                salaryUpdate = Utility.getDouble("Enter salary :", "Wrong !", salaryCurrent, Double.MAX_VALUE);
                if (salaryCurrent >= salaryUpdate) {
                    System.err.println("Must be greater than current salary.!!!");
                } else {
                    break;
                }
            }
            worker.setSalary(salaryUpdate);
//            workerManager.writeToFile();
            History history = new History("UP", workerManager.getCurrentDate(), worker.getId(), worker.getName(), 
                    worker.getAge(), salaryUpdate, worker.getWorkLocation());        
            listHistorys.add(history);
            System.err.println("Update salary Success !!");
        }
    }

    public void changeDecreaseSalary() {
//        workerManager.loadData();
        String codeID = Utility.getString("Enter id :", "Code must be a string", "[a-zA-Z0-9 ]+");

        Worker worker = workerManager.checkData(codeID);
        if (worker == null) {
            System.out.println("code id not existed in DB.!!!");
        } else {
            System.out.println("---------------------Up/Down Salary----------------------");
            double salaryCurrent = worker.getSalary();
            double salaryUpdate;
            while (true) {
                salaryUpdate = Utility.getDouble("Enter salary :", "Wrong !", 0, Double.MAX_VALUE);
                if (salaryCurrent <= salaryUpdate) {
                    System.err.println("Must be smaller than current salary.!!!");
                } else {
                    break;
                }
            }
            worker.setSalary(salaryUpdate);
//            workerManager.writeToFile();
            History history = new History("DOWN", workerManager.getCurrentDate(), worker.getId(), worker.getName(), worker.getAge(), worker.getSalary(), worker.getWorkLocation());
            listHistorys.add(history);
            System.err.println("Update salary Success !!");
        }
    }

    public void showData() {
//        workerManager.loadData();
        System.out.println("-------------------------------------Display Information Salary---------------------------------------------");
        System.out.format("%-11s%-11s%-16s%-11s%-10s%-10s\n", "Code", "Name", "Age", "Salary", "Status", "Date");
        for (History h :listHistorys) {
            h.display();
        }

    }

}
