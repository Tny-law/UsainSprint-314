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
public class Role {
    private int RoleId;
    private String RoleName;

    public int getRoleId() {
        return RoleId;
    }

    public void setRoleId(int RoleId) {
        this.RoleId = RoleId;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }
    
    
    public static void add(Role role) {
        String query = "insert into role(RoleName) values('" + role.getRoleName() + "')";
        DbOperations.setDataOrDelete(query, "Role created successfully");
    }

    public static ArrayList<Role> getAllRecords() {
        ArrayList<Role> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from role");
            while (rs.next()) {
                Role role = new Role();
                role.setRoleId(rs.getInt("RoleId"));
                role.setRoleName(rs.getString("RoleName"));
                arrayList.add(role);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void modify(Role role) {
        String query = "update role set rolename = '" + role.getRoleName() + "' where roleid = '" + role.getRoleId() + "'";
        DbOperations.setDataOrDelete(query, "Role updated successfully");
    }

    public static void delete(String RoleName) {
        String query = "delete from role where rolename = '" + RoleName + "'";
        DbOperations.setDataOrDelete(query, "Role deleted successfully");
    }

    public static boolean isUserRoleTaken(String RoleName) {
        boolean exist = false;
        try {
            ResultSet rs = DbOperations.getData("select * from role where rolename = '" + RoleName + "'");
            if (rs.next()) {
                exist = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return exist;
    }
}
