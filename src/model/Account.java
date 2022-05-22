/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Eechang
 */
public class Account {
    private int AccId;
    private String AccUsername;
    private String AccPassword;
    private String AccName;
    private String AccPhone;
    private String AccEmail;
    private String AccRole;
    private String Status;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    public int getAccId() {
        return AccId;
    }

    public void setAccId(int AccId) {
        this.AccId = AccId;
    }

    public String getAccUsername() {
        return AccUsername;
    }

    public void setAccUsername(String AccUsername) {
        this.AccUsername = AccUsername;
    }

    public String getAccPassword() {
        return AccPassword;
    }

    public void setAccPassword(String AccPassword) {
        this.AccPassword = AccPassword;
    }

    public String getAccName() {
        return AccName;
    }

    public void setAccName(String AccName) {
        this.AccName = AccName;
    }

    public String getAccPhone() {
        return AccPhone;
    }

    public void setAccPhone(String AccPhone) {
        this.AccPhone = AccPhone;
    }

    public String getAccEmail() {
        return AccEmail;
    }

    public void setAccEmail(String AccEmail) {
        this.AccEmail = AccEmail;
    }

    public String getAccRole() {
        return AccRole;
    }

    public void setAccRole(String AccRole) {
        this.AccRole = AccRole;
    }
    
       
    public void LoginAccount(String account, String password) {
         
        try {
            String sql = "select * from account where AccUsername='" + account + "' and AccPassword='" + password + "'";
            ResultSet rs = DbOperations.getData(sql);
            while (rs.next()) {
               
                setStatus(rs.getString("Status"));
               
                setAccId(rs.getInt("AccId"));
                setAccUsername(rs.getString("AccUsername"));
                setAccPassword(rs.getString("AccPassword"));
                setAccName(rs.getString("AccName"));
                setAccPhone(rs.getString("AccPhone"));
                setAccEmail(rs.getString("AccEmail"));
                setAccRole(rs.getString("AccRole"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

 public void add(Account account) {

    String query = "insert into account(AccUsername, AccPassword, AccName, AccPhone, AccEmail, AccRole, Status) values('" +account.getAccUsername() + "','" + account.getAccPassword() + "','" + account.getAccName() + "','" + account.getAccPhone() + "','" + account.getAccEmail() + "','" + account.getAccRole() + "','" + account.getStatus() + "')";
    DbOperations.setDataOrDelete(query, "Account created successfully");
    }

    public static ArrayList<Account> getAllRecords() {
        ArrayList<Account> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from account");
            while (rs.next()) {
                Account account = new Account();
                account.setAccId(rs.getInt("AccId"));
                account.setAccUsername(rs.getString("AccUsername"));
                account.setAccPassword(rs.getString("AccPassword"));
                account.setAccName(rs.getString("AccName"));
                account.setAccPhone(rs.getString("AccPhone"));
                account.setAccEmail(rs.getString("AccEmail"));
                account.setAccRole(rs.getString("AccRole"));
                account.setStatus(rs.getString("Status"));
                arrayList.add(account);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public  void modify(Account account) {
        String query = "update account set accUsername = '" + account.getAccUsername() + "', accPassword = '" + account.getAccPassword() + "',  accName = '" + account.getAccName() + "', accPhone = '" + account.getAccPhone() + "', accEmail = '" + account.getAccEmail() + "', accRole = '" + account.getAccRole() + "', Status = '" + account.getStatus() + "' where AccId = '" + account.getAccId() + "'";
        DbOperations.setDataOrDelete(query, "Account updated successfully");
    }

    public static void delete(String AccUsername) {
        String query = "delete from account where AccUsername = '" + AccUsername + "'";
        DbOperations.setDataOrDelete(query, "Account deleted successfully");
    }
    public static boolean isUsernameTaken(String AccUsername) {
        boolean exist = false;
        try {
            ResultSet rs = DbOperations.getData("select * from account where AccUsername = '" + AccUsername + "'");
            if (rs.next()) {
                exist = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return exist;

    }
}

