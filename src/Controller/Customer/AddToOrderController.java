/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Customer;

import model.FoodItem;

/**
 *
 * @author Eechang
 */
public class AddToOrderController {
    public FoodItem Foods;

    public FoodItem getFoods() {
        return Foods;
    }

    public void setFoods(String F) {
        this.Foods = FoodItem.getFoodItemByName(F);
    }


    

}
