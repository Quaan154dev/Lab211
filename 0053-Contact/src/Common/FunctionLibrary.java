/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import Model.SoccerPlayer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quandba
 */
public class FunctionLibrary {
    List<SoccerPlayer> listSoccer;  

    public FunctionLibrary() {
         listSoccer = new ArrayList<>();
    } 
    
     public List<SoccerPlayer> getListSoccerPlayer() {
        return listSoccer;
    }
    
    public FunctionLibrary(List<SoccerPlayer> listSoccer) {
        this.listSoccer = listSoccer;
    }
    
    public void addSoccer(SoccerPlayer soccer) {
        listSoccer.add(soccer);
    }
    
    
}
