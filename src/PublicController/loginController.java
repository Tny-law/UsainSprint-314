/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PublicController;

import javax.swing.JOptionPane;
import model.Account;
/**
 *
 * @author TonyL
 */
public class loginController {
    public String AccName;
    public String AccPassword;
    public String validate()
    {
       Account acc =new Account();
        String userRole=""; 
        acc.LoginAccount(AccName, AccPassword);
        
        if(acc.getAccName() == null|| acc.getAccPassword().isEmpty()){
            JOptionPane.showMessageDialog(null, "<html><b>Incorrect Username or Password</b></html>","Message",JOptionPane.ERROR_MESSAGE);
            }
           else{
            if(acc.getStatus().equals("Close")){
                JOptionPane.showMessageDialog(null, "<html><b>Account is suspended</b></html>","Message",JOptionPane.INFORMATION_MESSAGE);   
        }  
            if(acc.getStatus().equals("Open")){
                userRole=acc.getAccRole();
            }
           }
        return userRole; 
    } 
}
