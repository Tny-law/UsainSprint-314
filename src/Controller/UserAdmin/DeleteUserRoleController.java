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
public class DeleteUserRoleController {

    public String Rname;

    public void deleteUserRoleController() {

        Role.delete(Rname);

    }

}
