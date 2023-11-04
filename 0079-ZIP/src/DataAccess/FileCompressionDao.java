/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;
import Common.Validate;
import java.io.IOException;
import java.util.Scanner;
import Model.FileCompressionModel;
/**
 *
 * @author quandba
 */
public class FileCompressionDao {
    private FileCompressionModel model;
    private Validate vl;

    public FileCompressionDao() {
        this.model = model;
        this.vl = vl;
    }

    private static FileCompressionDao instance = null;

    public static FileCompressionDao instance() {
        if (instance == null) {
            synchronized (FileCompressionDao.class) {
                if (instance == null) {
                    instance = new FileCompressionDao();
                }
            }
        }
        return instance;
    }
    
     public void zipFile() {
         Scanner in = new Scanner(System.in);
        System.out.print("Enter Source Folder: ");
        String pathSrc = vl.checkString();
        System.out.print("Enter Destination Folder: ");
        String pathCompress = vl.checkString();
        System.out.print("Enter Name: ");
        String fileZipName = in.nextLine();
        try {
            boolean check = model.compressTo(pathSrc, fileZipName, pathCompress);
            if (check==true) {
                System.out.println("Successfully");
            } else {
                System.out.println("Fail");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void unzipFile() {
        System.out.print("Enter Source file: ");
        String pathZipFile = vl.checkString();
        System.out.print("Enter Destination Folder: ");
        String pathExtract = vl.checkString();
        try {
            boolean check = model.extractTo(pathZipFile, pathExtract);
            if (check) {
                System.out.println("Successfully");
            } else {
                System.out.println("Fail");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}