/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.UserAdmin;
import model.Account;
/**
 *
 * @author TonyL
 */
public class CreateUserAccountController {
      public  String Username ;
      public  String Password;
      public  String Name;
      public  String Email;
      public  String Status;
      public  String Roles;
      public String Phone;
      public String Checknames;
       public void createAccountController()
       {
          
           Account account =new Account();
           account.setAccUsername(Username);
           account.setAccPassword(Password);
           account.setAccName(Name);
           account.setAccEmail(Email);
           account.setStatus(Status);
           account.setAccRole(Roles);
           account.setAccPhone(Phone);
           account.add(account);
       }
       
        public  boolean CheckName()
 {
     boolean C= Account.isUsernameTaken(Checknames);
     return C;
 }
}
