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
 * @author Eechang
 */
public class Coupon {
    private int CouponId;
    private String CouponName;
    private Float CouponDiscount;
    private String StartDate;
    private String EndDate;

    public int getCouponId() {
        return CouponId;
    }

    public void setCouponId(int CouponId) {
        this.CouponId = CouponId;
    }

    public String getCouponName() {
        return CouponName;
    }

    public void setCouponName(String CouponName) {
        this.CouponName = CouponName;
    }

    public Float getCouponDiscount() {
        return CouponDiscount;
    }

    public void setCouponDiscount(Float CouponDiscount) {
        this.CouponDiscount = CouponDiscount;
    }

   

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }
       
    public static void add(Coupon coupon) {
        String query = "insert into coupon(CouponName, CouponDiscount, StartDate, EndDate) values('" + coupon.getCouponName() + "', '" + coupon.getCouponDiscount() + "','" + coupon.getStartDate() + "','" + coupon.getEndDate() + "')";
        DbOperations.setDataOrDelete(query, "Coupon created successfully");
    }

    public static ArrayList<Coupon> getAllRecords() {
        ArrayList<Coupon> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from coupon");
            while (rs.next()) {
                Coupon coupon = new Coupon();
                coupon.setCouponId(rs.getInt("CouponId"));
                coupon.setCouponName(rs.getString("CouponName"));
                coupon.setCouponDiscount(rs.getFloat("CouponDiscount"));
                coupon.setStartDate(rs.getString("StartDate"));
                coupon.setEndDate(rs.getString("EndDate"));
                arrayList.add(coupon);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void modify(Coupon coupon) {
        String query = "update coupon set couponname = '" + coupon.getCouponName() + "', coupondiscount = '" + coupon.getCouponDiscount() + "' ,startdate = '" + coupon.getStartDate() + "' , enddate = '" + coupon.getEndDate() + "' where couponid = '" + coupon.getCouponId() + "'";
        DbOperations.setDataOrDelete(query, "Coupon updated successfully");
    }

    public static void delete(String CouponName) {
        String query = "delete from coupon where couponname = '" + CouponName + "'";
        DbOperations.setDataOrDelete(query, "Coupon deleted successfully");
    }
    
        public static boolean isCouponNameTaken(String CouponName) {
        boolean exist = false;
        try {
            ResultSet rs = DbOperations.getData("select * from coupon where couponname = '" + CouponName + "'");
            if (rs.next()) {
                exist = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return exist;
        }
        
        public static Coupon CheckCoupon(String couponName)
    {
        Coupon coupon = null;

        try 
        {
            String sql ="select CouponDiscount  from coupon where CouponName='"+couponName+"';";
            ResultSet rs = DbOperations.getData(sql);
//            if(!rs.next())
//            {
//                JOptionPane.showMessageDialog(null, "<html><b>Please check the coupon, Thanks!</b></html>","Message",JOptionPane.ERROR_MESSAGE);
//                return coupon;
//            }
            while(rs.next())
            {
                coupon = new Coupon();
                coupon.setCouponDiscount(rs.getFloat("CouponDiscount"));
                //JOptionPane.showMessageDialog(null, "<html><b>Coupon activated</b></html>","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return coupon;
    }
}
