/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Owner;

import java.util.ArrayList;
import java.util.Iterator;
import model.Orders;

/**
 *
 * @author TonyL
 */
public class OwnerViewController {
    public static Iterator<Orders> ViewTable(String FDate,String TDate)
    {
        ArrayList<Orders> list = Orders.ReportOut(FDate, TDate);
        Iterator<Orders> itr = list.iterator();
        return itr;
    }
}
