/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Responsitory.FileCompressionRES;
import View.Menu;
/**
 *
 * @author quandba
 */
public class FileCompressController extends Menu {
     private FileCompressionRES fileCompressionRES;
    static String[] option = {"Compression", "Extraction", "Exit"};

    public FileCompressController() {
        super("========= Zipper program =========", option);
        fileCompressionRES = new FileCompressionRES();
    }

    @Override
    public void execute(int choice) {
        switch(choice){
            case 1:
                fileCompressionRES.Zip_file();
                break;
            case 2:
                fileCompressionRES.Unzip_file();
                break;
            case 3:
                System.out.println("Exit!!!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid!!!");
        }
    }
    
}