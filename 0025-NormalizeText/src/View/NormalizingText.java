/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.NormalizeService;

/**
 *
 * @author quandba
 */
public class NormalizingText {
    NormalizeService normalizeService = new NormalizeService();

    void run() {
        normalizeService.handleLoadDataFromFile();
//        normalizeService.handleNormalizeText();
//        normalizeService.handleSaveDataToFile();
    }

    public static void main(String[] args) {
        NormalizingText normalizingText = new NormalizingText();
        normalizingText.run();
    }
}
