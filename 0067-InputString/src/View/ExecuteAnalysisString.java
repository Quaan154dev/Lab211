/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Controller.AnalysicStringController;

/**
 *
 * @author quandba
 */
public class ExecuteAnalysisString {
    private final AnalysicStringController analysicStringController = new AnalysicStringController();
    public void run() {
        analysicStringController.inputString();
        analysicStringController.handleAnalyzeData();
        analysicStringController.handleShowData();
    }
}
