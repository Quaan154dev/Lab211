/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import Controller.ManagementService;
import Model.Candidate;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author quandba
 */
public class CandidateManagement extends Menu{
    private static final Scanner input = new Scanner(System.in);
    ManagementService managementService = new ManagementService();
    
    static String[] options = {
            "Experience",
            "Fresher",
            "Intern",
            "Search",
            "Exit"
    };

    public CandidateManagement(){
        super("CANDIDATE MANAGEMENT SYSTEM", options);
    }

    @Override
    public void execute(int number) {
        switch (number) {
            case 1:
                managementService.addExperienceCandidate();
                managementService.displayExperienceCandidates(managementService.returnExperienceCandidates(),  "EXPERIENCE CANDIDATE");
                break;
            case 2:
                managementService.addFresherCandidate();
                managementService.displayFresherCandidates(managementService.returnFresherCandidates(), "FRESHER CANDIDATE");
                break;
            case 3:
                managementService.addInternCandidate();
                managementService.displayInternCandidates(managementService.returnInternCandidates(), "INTERN CANDIDATE");
                break;
            case 4:
                List<Candidate> candidatesList = managementService.getCandidatesList();
                if(candidatesList.isEmpty()){
                    System.out.println("Empty List! Cant execute this function!");
                }else{
                    managementService.searchingCandidate();
                }
                break;
            case 5:
                System.out.println("EXIT PROGRAM!");
                break;    
            default:
                System.exit(0);
        }
    }
   
    
}
