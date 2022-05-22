/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Customer;

import java.util.ArrayList;
import java.util.Iterator;
import model.FoodItem;

/**
 *
 * @author TonyL
 */
public class filterFoodController {
    public static Iterator<FoodItem> getAlldata(String name, String c)
    {
        ArrayList<FoodItem> list= FoodItem.filterFoodname(name,c);
        Iterator<FoodItem> itr = list.iterator();
        return itr;
    }
}
