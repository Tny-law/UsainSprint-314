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
public class GateAllFoodController {
    public static Iterator<FoodItem> getAlldata()
    {
        ArrayList<FoodItem> list= FoodItem.getAllRecords();
        Iterator<FoodItem> itr = list.iterator();
        return itr;
    }
}
