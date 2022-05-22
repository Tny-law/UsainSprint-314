/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Manager;

import model.FoodItem;

/**
 *
 * @author Eechang
 */
public class DeleteMenuItemController {
     public String FoodName;
    public void deleteFoodItemController()
    {
            FoodItem.delete(FoodName);
    }
}
