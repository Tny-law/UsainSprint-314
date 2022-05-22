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
public class Orders {

    private int id;
    private String TableNumber;
    private String Phone;
    private String Date;
    private String FoodName;
    private int Quantity;
    private Float Total;
    private String createdBy;
    private Float Discount;
    private Float GrandTotal;
    private String Allergy;
    private String Status;
    private Float HightPrice;
    private String MaxItemName;
    private String MinItemName;
    private int MaxQuantity;
    private int LowerQuantity;
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTableNumber() {
        return TableNumber;
    }

    public void setTableNumber(String TableNumber) {
        this.TableNumber = TableNumber;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String FoodName) {
        this.FoodName = FoodName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public Float getTotal() {
        return Total;
    }

    public void setTotal(Float Total) {
        this.Total = Total;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Float getDiscount() {
        return Discount;
    }

    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    public Float getGrandTotal() {
        return GrandTotal;
    }

    public void setGrandTotal(Float GrandTotal) {
        this.GrandTotal = GrandTotal;
    }

    public String getAllergy() {
        return Allergy;
    }

    public void setAllergy(String Allergy) {
        this.Allergy = Allergy;
    }

    public Float getHightPrice() {
        return HightPrice;
    }

    public void setHightPrice(Float HightPrice) {
        this.HightPrice = HightPrice;
    }

    public String getMaxItemName() {
        return MaxItemName;
    }

    public void setMaxItemName(String MaxItemName) {
        this.MaxItemName = MaxItemName;
    }

    public String getMinItemName() {
        return MinItemName;
    }

    public void setMinItemName(String MinItemName) {
        this.MinItemName = MinItemName;
    }

    public int getMaxQuantity() {
        return MaxQuantity;
    }

    public void setMaxQuantity(int MaxQuantity) {
        this.MaxQuantity = MaxQuantity;
    }

    public int getLowerQuantity() {
        return LowerQuantity;
    }

    public void setLowerQuantity(int LowerQuantity) {
        this.LowerQuantity = LowerQuantity;
    }

    

    public static String getOrId() {
        int id = 1;
        try {
            ResultSet rs = DbOperations.getData("select max(OrderId) from Orders");
            if (rs.next()) {
                id = rs.getInt(1);
                id = id + 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }

    public static void save(Orders order) {
        String query = "insert into Orders (OrderId, TableNumber, PhoneNumber, date,quantity, Total, createdBy,Discount,GrandTotal,Allergy,OStatus) values('" + order.getId() + "','" + order.getTableNumber() + "','" + order.getPhone() + "','" + order.getDate() + "','" + order.getQuantity() + "','"
                + order.getTotal() + "','" + order.getCreatedBy() + "','" + order.getDiscount() + "','" + order.getGrandTotal() + "','" + order.getAllergy() + "','Unfulfilled')";
        DbOperations.setDataOrDelete(query, "Order Added Successfully");
    }

    public static ArrayList<Orders> getOrderStatus() {
        ArrayList<Orders> arraylist = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select OrderId, OStatus from Orders");
            while (rs.next()) {
                Orders orders = new Orders();
                orders.setStatus(rs.getString("OStatus"));
                orders.setId(rs.getInt("OrderId"));
                arraylist.add(orders);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return arraylist;
    }

    public void getOrdStatus(int id) {

        try {
            String sql = "select OStatus from Orders where OrderId='" + id + "'";
            ResultSet rs = DbOperations.getData(sql);
            while (rs.next()) {
                setStatus(rs.getString("OStatus"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static ArrayList<Orders> getAllRecords() {
        ArrayList<Orders> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select OrderId,TableNumber, OStatus,date from Orders where DATE_SUB(CURDATE(), INTERVAL 1 DAY) <=DATE(date) order by date desc");
            while (rs.next()) {
                Orders orders = new Orders();
                orders.setId(rs.getInt("OrderId"));
                orders.setTableNumber(rs.getString("TableNumber"));
                orders.setStatus(rs.getString("ostatus"));
                arrayList.add(orders);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void fulfillOrder(Orders order)
    {
        String query = "update orders set ostatus = 'Fulfilled' where orderid = '" + order.getId() + "'";
        DbOperations.setDataOrDelete(query, "Order updated successfully");
    }
    public static void unfulfillOrder(Orders order)
    {
        String query = "update orders set ostatus = 'Unfulfilled' where orderid = '" + order.getId() + "'";
        DbOperations.setDataOrDelete(query, "Order updated successfully");
    }
    public static void cancelOrder(Orders order)
    {
        String query = "update orders set ostatus = 'Cancelled' where orderid = '" + order.getId() + "'";
        DbOperations.setDataOrDelete(query, "Order updated successfully");
    }
    
    public  Float GatAvg(String StarDate, String EndDate)
    {
        Float AvrData = 0f;
        try {
           String sql = "select (select sum(Total) from Orders where date between '"+StarDate+"' and '"+EndDate+"')/(select count(t.PhoneNumber) from (select distinct PhoneNumber from Orders) t) AvgPrice";
           ResultSet rs = DbOperations.getData(sql);
           while(rs.next())
           {
                //setAvgData(rs.getFloat("AvgPrice"));
               AvrData = rs.getFloat("AvgPrice");
           }
        } catch (Exception e) {
        }
        return AvrData;
    }
    
    public  void HigPrice(String StarDate, String EndDate)
    {
        try {
            String sql = "select PhoneNumber,sum(Total) Hprice from Orders where date between '"+StarDate+"' and '"+EndDate+"' group by PhoneNumber  order by sum(Total) desc limit 1";
           ResultSet rs = DbOperations.getData(sql);
           while(rs.next())
           {
               setPhone(rs.getString("PhoneNumber"));
               setHightPrice(rs.getFloat("Hprice"));
           }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
    } 
    
    public void MaxItem(String StarDate, String EndDate)
    {
        try {
            String sql = "select FoodItem,sum(FoodQuantity)TotalQuantity from OrderDetail where OrderDate between '"+StarDate+"' and '"+EndDate+"' group by FoodItem  order by sum(FoodQuantity) desc limit 1;";
           ResultSet rs = DbOperations.getData(sql);
           while(rs.next())
           {
               setMaxItemName(rs.getString("FoodItem"));
               setMaxQuantity(rs.getInt("TotalQuantity"));
           }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void MinItem(String StarDate, String EndDate)
    {
        try {
            String sql = "select FoodItem,sum(FoodQuantity)TotalQuantity from OrderDetail where OrderDate between '"+StarDate+"' and '"+EndDate+"' group by FoodItem  order by sum(FoodQuantity) asc limit 1;";
           ResultSet rs = DbOperations.getData(sql);
           while(rs.next())
           {
               setMinItemName(rs.getString("FoodItem"));
               setLowerQuantity(rs.getInt("TotalQuantity"));
           }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static ArrayList<Orders> ReportOut(String FDate, String TDate) {
            ArrayList<Orders> arraylist = new ArrayList<>();
        try {
            String sql = "select * from Orders where date  between '"+FDate+"' and '"+TDate+"' ;";
            ResultSet rs = DbOperations.getData(sql);
            while (rs.next()) {
                Orders or = new Orders();
                or.setId(rs.getInt("OrderId"));
                or.setPhone(rs.getString("PhoneNumber"));
                or.setDate(rs.getString("date"));
                or.setTotal(rs.getFloat("Total"));
                or.setDiscount(rs.getFloat("Discount"));
                or.setStatus(rs.getString("OStatus"));
                arraylist.add(or);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arraylist;
    }
    
    public String CheckMaxDate()
    {
        String CheckMaxDate ="";
         try {
           String sql = "select MAX(Date)MaxD from Orders";
           ResultSet rs = DbOperations.getData(sql);
           while(rs.next())
           {
                //setAvgData(rs.getFloat("AvgPrice"));
               CheckMaxDate =rs.getString("MaxD");
           }
        } catch (Exception e) {
        }
        return CheckMaxDate;
    }
    
    public String CheckMinDate()
    {
        String CheckMinDate ="";
         try {
           String sql = "select MIN(Date)MinD from Orders;";
           ResultSet rs = DbOperations.getData(sql);
           while(rs.next())
           {
                //setAvgData(rs.getFloat("AvgPrice"));
               CheckMinDate =rs.getString("MinD");
           }
        } catch (Exception e) {
        }
        return CheckMinDate;
    }
}
