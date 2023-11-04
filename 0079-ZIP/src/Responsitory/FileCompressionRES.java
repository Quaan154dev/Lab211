/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitory;
import DataAccess.FileCompressionDao;
/**
 *
 * @author quandba
 */
public class FileCompressionRES implements IFileCompressionRES {

    @Override
    public void Zip_file() {
        FileCompressionDao.instance().zipFile();
    }

    @Override
    public void Unzip_file() {
        FileCompressionDao.instance().unzipFile();
    }
    
}
