/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;

/**
 *
 * @author Eechang
 */
public class ConnectionProvider {
    public static Connection getCon() {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        //com.mysql.cj.jdbc.Driver   for Mac
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usainsprint?useSSL=false","root","dx1107527854");
        return con;
        }
        
        catch(Exception e) {
            return null;
        }
    }
}
