/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Customer;

import model.OrderDetails;
import model.Orders;

/**
 *
 * @author Eechang
 */
public class ConfirmOrderController {
    public int OId;
    public String Phone;
    public int Quantity;
    public String allergy;
    public String TableNumber;
    public String createdBy;
    public Float CounponNumber;
    public String Date;
    public Float TotaPrice;
    public Float GrandPTotal;
    
    public String ODFoodName;
    public String FP;
    public String FQ;
    public String TP;
    
    public void SaveData()
    {
        Orders orders = new Orders();
        orders.setId(OId);
         orders.setPhone(Phone);
         orders.setQuantity(Quantity);
         orders.setAllergy(allergy);
         orders.setTableNumber(TableNumber);
         orders.setDate(Date);
         orders.setTotal(TotaPrice);
         orders.setCreatedBy(createdBy);
         orders.setDiscount(CounponNumber);
         orders.setGrandTotal(GrandPTotal);
         Orders.save(orders);
    }
    
    
    public void OrderDetailsData()
    {
         OrderDetails Od= new OrderDetails();
         Od.setOrderId(OId);
            Od.setFoodItem(ODFoodName);
            Od.setFoodPrice(Float.valueOf(FP));
            Od.setFoodQuantity(Integer.valueOf(FQ));
            Od.setTotalPrice(Float.valueOf(TP));
            Od.setOrderDate(Date);
            OrderDetails.save(Od);
    }
    
}
