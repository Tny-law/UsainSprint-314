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
public class ModifyCouponCodeController {
    public int Id;
    public String CouponName;
    public Float Discount;
    public String StarDate;
    public String EndDate;
    public void modifyCouponController()
    {
         Coupon coupon = new Coupon();
        coupon.setCouponId(Id);
        coupon.setCouponName(CouponName);
        coupon.setCouponDiscount(Discount);
        coupon.setStartDate(StarDate);
        coupon.setEndDate(EndDate);
        coupon.modify(coupon);
    }
}
