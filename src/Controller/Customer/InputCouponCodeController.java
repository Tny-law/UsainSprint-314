/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Customer;

import javax.swing.JOptionPane;
import model.Coupon;

/**
 *
 * @author Eechang
 */
public class InputCouponCodeController {
     public String CouponName;
    
    public Float CheckValidate()
    {
       Float Cvalues = 0f;
       Coupon coupon = null;
       coupon = Coupon.CheckCoupon(CouponName);  
       Cvalues = coupon.getCouponDiscount();
       if(Cvalues.equals(""))
       {
           JOptionPane.showMessageDialog(null, "<html><b>Incorrect coupon code</b></html>","Message",JOptionPane.ERROR_MESSAGE);
       }
       
       return Cvalues;
    }
}
