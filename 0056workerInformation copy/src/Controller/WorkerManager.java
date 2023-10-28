/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.FileProcess;
import Common.FileProcess;
import Controller.ConstWorker;
import Model.History;
import Model.Worker;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author quandba
 */
public class WorkerManager {

    List<Worker> listWorker;
    List<History> listHistory;
    
    
    public List<History> getListHistorys() {
        return listHistory;
    }
    
    public List<Worker> getListWorkers() {
        return listWorker;
    }
    

//    public WorkerManager() {
//        listWorker = FileProcess.readToFile(ConstWorker.FILE_NAME);
//    }
    public WorkerManager() {
        listWorker  = new ArrayList<>();
    }

    public WorkerManager(List<Worker> listWorker) {
        this.listWorker = listWorker;
    }

    public void addWorker(Worker worker) {
        listWorker.add(worker);
    }
    
    public void addHistory(History history) {
        listHistory.add(history);
    }
    public boolean isDuplicaseCode(String code) {
        for (Worker worker : listWorker) {
            if (worker.getId().equalsIgnoreCase(code)) {
                return true;
            }
        }
        return false;
    }

    public void writeToFile() {
        FileProcess.writeToFile(ConstWorker.FILE_NAME, listWorker);
    }

    public void loadData() {
        listWorker = FileProcess.readToFile(ConstWorker.FILE_NAME);
    }

    public Worker checkData(String codeID) {
        for (Worker worker : listWorker) {
            if (worker.getId().equals(codeID)) {
                return worker;
            }
        }
        return null;
    }
    
   
    public static String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        return dateFormat.format(calendar.getTime());
    }
    
   
    
    

}
