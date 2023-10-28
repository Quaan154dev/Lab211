/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.FunctionLibrary;
import Common.Utility;
import Constant.soccerPlayerConstant;
import Model.SoccerPlayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$|^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})[ ]?(x|ext)\\.? (\\d+)$
 *
 * @author quandba
 */
public class ContactManagement {

    Utility utility = new Utility();
    soccerPlayerConstant spc = new soccerPlayerConstant();

    FunctionLibrary fl = new FunctionLibrary();
    Scanner scanner = new Scanner(System.in);
    String choice;
    List<SoccerPlayer> listContacts = fl.getListSoccerPlayer();

    public void addSoccer() {
        do {
            String contactFullName, contactGroup, contactAddress, contactPhone;
            contactFullName = Utility.getString("Enter contact full name: ", "Wrong !", "^[a-zA-Z]{1,}(?: [a-zA-Z]+){0,3}$");
            contactGroup = Utility.getString("Enter contact group :", "wrong !", soccerPlayerConstant.REGEX_NAME);
            contactAddress = Utility.getString("Enter contact address: ", "Wrong !", soccerPlayerConstant.REGEX_NAME);
            contactPhone = Utility.getString("Enter contact phone number: ", "Wrong!",
                    soccerPlayerConstant.REGEX_PHONE);
            SoccerPlayer soccer = new SoccerPlayer(contactFullName, contactGroup, contactAddress, contactPhone);
            fl.addSoccer(soccer);
            System.out.println("Do you want to continue?");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("Y"));
    }

    public void displayContacts() {
        if (listContacts.isEmpty()) {
            System.out.println("EMPTY LIST! CANNOT DISPLAY!");
        } else {
            System.out.println("--------------------------------Display all contacts----------------------------\n");
            System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s\n", "ID", "Name", "First Name", "Last Name", "Group", "Address", "Phone");
            for (SoccerPlayer listContact : listContacts) {
                listContact.display();
            }
        }
    }

    public void handleRemoveContact() {
        if (listContacts.isEmpty()) {
            System.out.println("EMPTY LIST! CANNOT IMPLEMENT THIS FUNCTION");
        } else {
            deleteContact((ArrayList<SoccerPlayer>) listContacts);
            displayListOfCotact(listContacts,
            "--------------------------------------UPDATED CONTACT LIST--------------------------------------");
        }
    }

    public void deleteContact(ArrayList<SoccerPlayer> listContacts) {
        SoccerPlayer soccer = null;
        Integer removeId = null;

        if (listContacts.isEmpty()) {
            System.out.println("LIST OF CONTACT IS EMPTY!");
        } else {
            removeId = utility.setIntegerValue("Enter contact ID to remove: ");
            soccer = search(removeId, listContacts);
            if (soccer == null) {
                System.out.println("Contact " + removeId + " doesn't exist!");
            } else {
                listContacts.remove(soccer);
                System.out.println("Remove successfully!");
                for (int i = 0; i < listContacts.size(); i++) {
                    listContacts.get(i).setID(i + 1);
                }
            }
        }
    }

    public SoccerPlayer search(Integer searchId, ArrayList<SoccerPlayer> soccerList) {
        for (SoccerPlayer soccer : soccerList) {
            if (soccer.getID() == searchId) {
                return soccer;
            }
        }
        return null;
    }

    public void displayListOfCotact(List<SoccerPlayer> contactList, String msg) {
        if (contactList.isEmpty()) {
            System.out.println("CONTACT LIST IS EMPTY! PLEASE INPUT COUNTRY TO SHOW!");
        } else {
            System.out.println("\n" + msg);
            System.out.println(
                    "\n------------------------------------------------------------------------------------------------------");
            System.out.format("| %5s | %20s | %10s | %10s | %10s | %10s | %15s |", "ID", "FULLNAME",
                    "FIRST NAME", "LAST NAME", "GROUP", "ADDRESS", "PHONE");
            System.out.println(
                    "\n------------------------------------------------------------------------------------------------------");
            for (SoccerPlayer contact : contactList) {
                System.out.format("| %5d | %20s | %10s | %10s | %10s | %10s | %15s |", contact.getID(),
                        contact.getFullName(), contact.getFirstname(), contact.getLastName(),
                        contact.getGroup(), contact.getAddress(), contact.getPhone());
                System.out.println(
                        "\n------------------------------------------------------------------------------------------------------");
            }
        }
    }

}
