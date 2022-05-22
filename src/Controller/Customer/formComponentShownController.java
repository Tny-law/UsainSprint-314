/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Customer;

import java.util.ArrayList;
import java.util.Iterator;
import model.FoodItem;
import model.Orders;

/**
 *
 * @author TonyL
 */
public class formComponentShownController {
    public int getId()
    {
        int Oid=Integer.valueOf(Orders.getOrId());
        return Oid;
    }
    
    public  Iterator<FoodItem> AllCategoryRecords()
    {
        ArrayList<FoodItem> list = FoodItem.getAllCategory();
        Iterator<FoodItem> itr = list.iterator();
        return itr;
    }
    
    public  Iterator<FoodItem> getAllFooddata()
    {
        ArrayList<FoodItem> list= FoodItem.getAllRecords();
        Iterator<FoodItem> itr = list.iterator();
        return itr;
    }
}
