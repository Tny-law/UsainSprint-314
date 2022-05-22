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
public class CreateCouponCodeController {
    public String CouponName;
    public Float CouponDiscount;
    public String StartDate;
    public String EndDate;
    public String CounpoName;
    public void createCouponController()
    {
        Coupon coupon = new Coupon();
        coupon.setCouponName(CouponName);
        coupon.setCouponDiscount(CouponDiscount);
        coupon.setStartDate(StartDate);
        coupon.setEndDate(EndDate);
        coupon.add(coupon);
    }
     public  boolean CheckCouponName()
 {
     boolean C= Coupon.isCouponNameTaken(CounpoName);
     return C;
 }
}
