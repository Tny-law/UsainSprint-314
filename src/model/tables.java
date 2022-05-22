/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Eechang
 */
public class tables {
    public static void main(String args[]){
        try{
            String roleTable = "create table role(RoleId int AUTO_INCREMENT primary key, RoleName varchar(255))";
            String accTable = "create table account(AccId int AUTO_INCREMENT primary key, AccUsername varchar(255), AccPassword varchar(255),AccName varchar(255), AccPhone varchar(255), AccEmail varchar(255), AccRole varchar(255),Status varchar(200))";
            String couponTable = "create table coupon(CouponId int AUTO_INCREMENT primary key, CouponName varchar(255), CouponDiscount Float(10,2), StartDate date, EndDate date)";
            String foodItemTable = "create table fooditem (FoodItemId int AUTO_INCREMENT primary key, FoodItemName varchar(255), FoodItemCategory varchar(255), FoodItemPrice DECIMAL(10,2), FoodItemDescription varchar(255), FoodItemAllergens varchar(255))";
            String Ordertable = "create table Orders (OrderId int AUTO_INCREMENT primary key, TableNumber varchar(100),PhoneNumber varchar(200),Date varchar(200),quantity int, Total DECIMAL(10,2),createdBy varchar(200),Discount DECIMAL(10,2),GrandTotal Float(10,2),Allergy varchar(200),OStatus varchar(200))";
            String OrderDetailtable = "create table OrderDetail(OrderId int ,FoodItem VARCHAR(200) null,FoodQuantity int null,FoodPrice DECIMAL(10,2) null,OrderDate varchar(200) null,TotalPrice DECIMAL(10,2) null,Discount varchar(200))";
            DbOperations.setDataOrDelete(roleTable, "Role Table created successfully");
            DbOperations.setDataOrDelete(accTable, "Account Table created successfully");
            DbOperations.setDataOrDelete(couponTable, "Coupon Table created successfully");
            DbOperations.setDataOrDelete(foodItemTable, "Food Item Table created successfully");
            DbOperations.setDataOrDelete(Ordertable, "Order Table created successfully");
            DbOperations.setDataOrDelete(OrderDetailtable, "Order Detail table created successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
