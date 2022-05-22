/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Customer;

import java.util.ArrayList;
import java.util.Iterator;
import model.OrderDetails;
import model.Orders;

/**
 *
 * @author Eechang
 */
public class ViewOrdersController {
    public int StatuId;
    public static Iterator<OrderDetails> ViewBill(int id)
    {
         ArrayList<OrderDetails> list = OrderDetails.getAllRecords(id);
        Iterator<OrderDetails> itr = list.iterator();
        return itr;
    }
    
    public  String getOrderStatus()
    {
        String OrStatus="";
        Orders Or = new Orders();
        Or.getOrdStatus(StatuId);
        OrStatus = Or.getStatus();
        return OrStatus;
    }
}
