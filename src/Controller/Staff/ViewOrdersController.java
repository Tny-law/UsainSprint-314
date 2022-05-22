/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Staff;

import java.util.ArrayList;
import java.util.Iterator;
import model.Orders;

/**
 *
 * @author TonyL
 */
public class ViewOrdersController {
    
    public static Iterator<Orders> getStatus()
    {
        ArrayList<Orders> list = Orders.getOrderStatus();
        Iterator<Orders> or = list.iterator();
        return or;
    }
    
        public static Iterator<Orders> getdata()
    {
        ArrayList<Orders> arrayL = Orders.getAllRecords();
        Iterator<Orders> itr = arrayL.iterator();
         
        return itr;
    } 
}
