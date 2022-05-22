/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Manager;

import java.util.ArrayList;
import java.util.Iterator;
import model.Coupon;

/**
 *
 * @author Eechang
 */
public class ViewCouponCodeController {
    
    public static Iterator<Coupon> getData()
    {
        ArrayList<Coupon> list = Coupon.getAllRecords();
        Iterator<Coupon> itr = list.iterator();
        return itr;
    }
}
