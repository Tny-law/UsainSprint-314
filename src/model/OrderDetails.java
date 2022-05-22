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
 * @author TonyL
 */
public class OrderDetails {

    private int OrderId;
    private String FoodItem;
    private int FoodQuantity;
    private Float FoodPrice;
    private String OrderDate;
    private Float TotalPrice;
    
    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int OrderId) {
        this.OrderId = OrderId;
    }

    public String getFoodItem() {
        return FoodItem;
    }

    public void setFoodItem(String FoodItem) {
        this.FoodItem = FoodItem;
    }

    public int getFoodQuantity() {
        return FoodQuantity;
    }

    public void setFoodQuantity(int FoodQuantity) {
        this.FoodQuantity = FoodQuantity;
    }

    public Float getFoodPrice() {
        return FoodPrice;
    }

    public void setFoodPrice(Float FoodPrice) {
        this.FoodPrice = FoodPrice;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public Float getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(Float TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    public static void save(OrderDetails Oderdetail) {
        String query = "insert into OrderDetail(OrderId, FoodItem, FoodQuantity, FoodPrice, OrderDate, TotalPrice) values('" + Oderdetail.getOrderId() + "','" + Oderdetail.getFoodItem() + "','" + Oderdetail.getFoodQuantity() + "'"
                + ",'" + Oderdetail.getFoodPrice() + "','" + Oderdetail.getOrderDate() + "','" + Oderdetail.getTotalPrice() + "')";
        DbOperations.setOderdetail(query);
    }

    public static ArrayList<OrderDetails> getAllRecords(int id) {
        ArrayList<OrderDetails> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select FoodItem, FoodQuantity, FoodPrice, OrderDate, TotalPrice from OrderDetail where OrderId='" + id + "'");
            while (rs.next()) {
                OrderDetails Od = new OrderDetails();
                Od.setFoodItem(rs.getString("FoodItem"));
                Od.setFoodQuantity(rs.getInt("FoodQuantity"));
                Od.setFoodPrice(rs.getFloat("FoodPrice"));
                Od.setOrderDate(rs.getString("OrderDate"));
                Od.setFoodPrice(rs.getFloat("TotalPrice"));
                arrayList.add(Od);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static ArrayList<OrderDetails> getAllRecordsStaff() {
        ArrayList<OrderDetails> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select FoodItem, FoodQuantity, FoodPrice, OrderDate, TotalPrice from OrderDetail");
            while (rs.next()) {
                OrderDetails Od = new OrderDetails();
                Od.setFoodItem(rs.getString("FoodItem"));
                Od.setFoodQuantity(rs.getInt("FoodQuantity"));
                Od.setFoodPrice(rs.getFloat("FoodPrice"));
                Od.setOrderDate(rs.getString("OrderDate"));
                Od.setFoodPrice(rs.getFloat("TotalPrice"));
                arrayList.add(Od);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    
}
