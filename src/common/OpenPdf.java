/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import dao.InventoryUtils;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author m senthil nathan
 */
public class OpenPdf {

    public static void OpenById(String id) {
    
    try{
        
        if((new File(InventoryUtils.billPath+id+".pdf")).exists()){
        
            Process p=Runtime.getRuntime().exec("rundll32 url.dll.FileProtocolhandler"+InventoryUtils.billPath+""+id+".pdf");
            
            
        
        }
        
        
        else{
            JOptionPane.showMessageDialog(null,"File is not Exists");
            
        }

       }
    catch(Exception e){


    }
    
    }
    
}
