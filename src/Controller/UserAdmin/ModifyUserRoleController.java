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
public class ModifyUserRoleController {
    public int Rid;
    public String Rname;
    public void modifyUserRoleController()
    {
        Role role = new Role();
        role.setRoleId(Rid);
        role.setRoleName(Rname);
        role.modify(role);
        
    }
}
