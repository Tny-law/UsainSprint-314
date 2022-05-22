/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.UserAdmin;

import model.Role;

/**
 *
 * @author Eechang
 */
public class CreateUserRoleController {
     
    
    public String Name;
    public String Checknames;
    public void createUserRoleController()
    {
        Role role = new Role();
        role.setRoleName(Name);
        role.add(role);
    }
        public  boolean CheckName()
 {
     boolean C= Role.isUserRoleTaken(Checknames);
     return C;
 }
}
