/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.UserAdmin;

import model.Account;

/**
 *
 * @author Eechang
 */
public class DeleteUserAccountController {

    public String Name;

    public void deleteAccountController() {

        //Account acc =new Account();
        Account.delete(Name);
    }
}
