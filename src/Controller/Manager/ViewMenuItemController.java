/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Manager;

import java.util.ArrayList;
import java.util.Iterator;
import model.FoodItem;

/**
 *
 * @author Eechang
 */
public class ViewMenuItemController {
    
     
      public static Iterator<FoodItem> getFoodData()
    {
         ArrayList<FoodItem> list = FoodItem.getAllRecords();
        Iterator<FoodItem> itr = list.iterator();
        return itr;
    }
}
