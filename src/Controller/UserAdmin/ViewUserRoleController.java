/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.UserAdmin;

import java.util.ArrayList;
import java.util.Iterator;
import model.Role;

/**
 *
 * @author Eechang
 */
public class ViewUserRoleController {
    
    
    public static Iterator<Role> getdata()
    {
        ArrayList<Role> arrayL = Role.getAllRecords();
        Iterator<Role> itr = arrayL.iterator();
         
        return itr;
    } 
    
}
