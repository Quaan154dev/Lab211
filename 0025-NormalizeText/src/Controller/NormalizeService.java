/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.NormalizeLibrary;
import java.nio.file.Paths;

/**
 *
 * @author quandba
 */
public class NormalizeService {
    NormalizeLibrary library = new NormalizeLibrary();
    String paragraph = "";

    public void handleLoadDataFromFile() {
        String path = Paths.get("").toAbsolutePath().toString();
        paragraph = library.readFromFile("Input.txt");
        System.out.println("DATA LOADED FROM FILE: ");
        System.out.println(paragraph);
    }
    public void handleSaveDataToFile() {
        library.saveDataToFile(paragraph);
    }
    public void handleNormalizeText() {
        System.out.println("DATA AFTER NORMALIZED: ");
        paragraph = library.normalizeParagraph(paragraph);
        System.out.println(paragraph);
    }
}
