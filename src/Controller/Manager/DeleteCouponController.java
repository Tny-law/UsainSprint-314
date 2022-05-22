/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Manager;

import model.Coupon;

/**
 *
 * @author Eechang
 */
public class DeleteCouponController {
    public String CouponName;
   public void deleteCouponController()
   {
            Coupon.delete(CouponName);
   }
}
