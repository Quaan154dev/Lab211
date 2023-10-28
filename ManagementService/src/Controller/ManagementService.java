/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Validator;
import Model.Candidate;
import Model.Experience;
import Model.Fresher;
import Model.Intern;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 *
 * @author quandba
 */
public class ManagementService {

    private static final Scanner scanner = new Scanner(System.in);
    private final Validator validator = new Validator();
    private final ArrayList<Candidate> candidatesList = new ArrayList<>();

    public List<Candidate> getCandidatesList() {
        return candidatesList;
    }

    public ArrayList<Experience> returnExperienceCandidates() {
        ArrayList<Experience> experiences = new ArrayList<>();
        for (Candidate candidate : candidatesList) {
            if (candidate instanceof Experience) {
                experiences.add((Experience) candidate);
            }
        }
        return experiences;
    }

    public ArrayList<Fresher> returnFresherCandidates() {
        ArrayList<Fresher> freshers = new ArrayList<>();
        for (Candidate candidate : candidatesList) {
            if (candidate instanceof Fresher) {
                freshers.add((Fresher) candidate);
            }
        }
        return freshers;
    }

    public ArrayList<Intern> returnInternCandidates() {
        ArrayList<Intern> interns = new ArrayList<>();
        for (Candidate candidate : candidatesList) {
            if (candidate instanceof Intern) {
                interns.add((Intern) candidate);
            }
        }
        return interns;
    }

    public void displayExperienceCandidates(ArrayList<Experience> list, String msg) {
        System.out.println("===============" + msg + "=================");
        for (Experience candidate : list) {
            System.out.format("%1s", candidate.getFirstName() + " " + candidate.getLastName());
        }
    }

    public void displayFresherCandidates(ArrayList<Fresher> list, String msg) {
        System.out.println("\n===============" + msg + "=================");
        for (Fresher candidate : list) {
            System.out.format(" %1s ", candidate.getFirstName()+" "+ candidate.getLastName());

        }
    }

    public void displayInternCandidates(ArrayList<Intern> list, String msg) {
        System.out.println("\n===============" + msg + "=================");
        for (Intern candidate : list) {
            System.out.format(" %1s", candidate.getFirstName() +" "+ candidate.getLastName());

        }
    }

    public void addExperienceCandidate() {
        String candidateId;
        String firstName;
        String lastName;
        int birthDate;
        String address;
        String phone;
        String email;
        Integer candidateType = 0;
        int explnYear;
        String proSkill;

        String choice;
        do {
            System.out.println("Enter candidate's ID: ");
            candidateId = scanner.nextLine();
            System.out.println("Enter candidate's first name: ");
            firstName = scanner.nextLine();
            System.out.println("Enter candidate's last name: ");
            lastName = scanner.nextLine();
            System.out.println("Enter candidate's date of birth (yyyy): ");
            birthDate = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter candidate's address: ");
            address = scanner.nextLine();
            System.out.println("Enter candidate's phone number: ");
            phone = scanner.nextLine();
            System.out.println("Enter candidate's email address: ");
            email = scanner.nextLine();
            System.out.println("Enter experience years: : ");
            explnYear = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter professional skill ");
            proSkill = scanner.nextLine();

            if (validator.validateDateOfBirth(Integer.toString(birthDate)) && validator.validatePhoneNumber(phone) && validator.validateEmail(email) && validator.validateYearsOfExperience(Integer.toString(explnYear))) {
                System.out.println("Candidate data enters successfully!");
                Experience experience = new Experience(explnYear, proSkill, candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
                candidatesList.add(experience);
            } else {
                System.out.println("Candidate data is invalid.");
            }

            System.out.println("Do you want to continue (Y/N)?");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("Y"));
    }

    public void addFresherCandidate() {
        String candidateId;
        String firstName;
        String lastName;
        int birthDate;
        String address;
        String phone;
        String email;
        Integer candidateType = 1;
        int graduateDate;
        String graduateRank;
        String education;

        String choice;
        do {
            System.out.println("Enter candidate's ID: ");
            candidateId = scanner.nextLine();
            System.out.println("Enter candidate's first name: ");
            firstName = scanner.nextLine();
            System.out.println("Enter candidate's last name: ");
            lastName = scanner.nextLine();
            System.out.println("Enter candidate's date of birth (yyyy): ");
            birthDate = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter candidate's address: ");
            address = scanner.nextLine();
            System.out.println("Enter candidate's phone number: ");
            phone = scanner.nextLine();
            System.out.println("Enter candidate's email address: ");
            email = scanner.nextLine();
            System.out.println("Enter graduate date: ");
            graduateDate = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter enter graduate rank (Excellence, Good, Fair, Poor): ");
            graduateRank = scanner.nextLine();
            System.out.println("Enter Education: ");
            education = scanner.nextLine();

            if (validator.validateDateOfBirth(Integer.toString(birthDate)) && validator.validatePhoneNumber(phone) && validator.validateEmail(email) && validator.validateRankOfGraduation(graduateRank)) {
                System.out.println("Candidate data enters successfully!");
                Fresher fresher = new Fresher(graduateDate, graduateRank, education, candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
                candidatesList.add(fresher);
            } else {
                System.out.println("Candidate data is invalid.");
            }

            System.out.println("Do you want to continue (Y/N)?");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("Y"));
    }

    public void addInternCandidate() {
        String candidateId;
        String firstName;
        String lastName;
        int birthDate;
        String address;
        String phone;
        String email;
        Integer candidateType = 2;
        String major;
        int semester;
        String universityName;
        String choice;
        do {
            System.out.println("Enter candidate's ID: ");
            candidateId = scanner.nextLine();
            System.out.println("Enter candidate's first name: ");
            firstName = scanner.nextLine();
            System.out.println("Enter candidate's last name: ");
            lastName = scanner.nextLine();
            System.out.println("Enter candidate's date of birth (yyyy): ");
            birthDate = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter candidate's address: ");
            address = scanner.nextLine();
            System.out.println("Enter candidate's phone number: ");
            phone = scanner.nextLine();
            System.out.println("Enter candidate's email address: ");
            email = scanner.nextLine();
            System.out.println("Enter candidate major: ");
            major = scanner.nextLine();
            System.out.println("Enter candidate semester(number): ");
            semester = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter candidate university name: ");
            universityName = scanner.nextLine();

            if (validator.validateDateOfBirth(Integer.toString(birthDate)) && validator.validatePhoneNumber(phone)) {
                System.out.println("Candidate data enters successfully!");
                Intern intern = new Intern(major, semester, universityName, candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
                candidatesList.add(intern);
            } else {
                System.out.println("Candidate data is invalid.");
            }

            System.out.println("Do you want to continue (Y/N)?");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("Y"));
    }
     public void displayAll() {
        displayExperienceCandidates(returnExperienceCandidates(), "EXPERIENCE CANDIDATE");
        displayFresherCandidates(returnFresherCandidates(), "FRESHER CANDIDATE");
        displayInternCandidates(returnInternCandidates(), "INTERN CANDIDATE");
    }

    public void searchingCandidate() {   
        displayAll();
        String inputNameSearch;
        System.out.println("Input Candidate name (First name or Last name):");
        inputNameSearch = scanner.nextLine();
        System.out.println("Input type of candidate:");
        int searchType ;
        searchType = Integer.parseInt(scanner.nextLine());
        
        
        List<Candidate> list = findName(inputNameSearch,searchType);
        
        if (list.isEmpty()) {
            System.out.println("Not Found");
        } else {      
            for (Candidate candidate : list) {
                candidate.display();
            }
        }
    }
        
//        temp = search(ls -> (ls.getFirstName().contains(inputNameSearch) ||
//                ls.getLastName().contains(inputNameSearch)) && ls.getCandidateType().toString().equals(searchType));      
//        temp.forEach(c -> System.out.println(c.getFirstName() + c.getLastName() +
//                " | " + c.getBirthDate() + " | " + c.getAddress() + " | " + c.getPhone() + " | " 
//                + c.getEmail() + " | " + c.getCandidateType()));


//    public ArrayList<Candidate> search(Predicate<Candidate> cd) {
//        ArrayList<Candidate> tempList = new ArrayList<>();
//        for (Candidate candidate : candidatesList) {
//            if (cd.test(candidate)) {
//                tempList.add(candidate);
//            }
//        }
//        return tempList;
//    }
    


    public void displayList(ArrayList<Candidate> candidates) {
        for (Candidate candidate : candidates) {
            System.out.format("| %15s | %15d | %20s | %20s | %20s | %5d |", candidate.getFirstName() + " " + candidate.getLastName(), candidate.getBirthDate(), candidate.getAddress(), candidate.getPhone(), candidate.getEmail(), candidate.getCandidateType());
        }
    }

    private List<Candidate> findName (String inputNameSearch, int searchType) {
        inputNameSearch = inputNameSearch.toUpperCase();
        List<Candidate> listFound = new ArrayList<>();
        for (Candidate candidate : candidatesList) {
            if(candidate.getFirstName().toUpperCase().contains(inputNameSearch)
              || candidate.getLastName().toUpperCase().contains(inputNameSearch)
              && candidate.getCandidateType().equals(searchType)){
                listFound.add(candidate);
            }
        }
        return listFound;
    }

}
