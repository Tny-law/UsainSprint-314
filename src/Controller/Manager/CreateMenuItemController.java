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
public class CreateMenuItemController {
    public String FoodName;
    public String CategoryName;
    public Float FoodPrice;
    public String Description;
    public String Allergens;
    public String FitemName;
    
    public void createFoodItemController()
    {
        FoodItem fooditem = new FoodItem();
        fooditem.setFoodItemName(FoodName);
        fooditem.setFoodItemCategory(CategoryName);
        fooditem.setFoodItemPrice(FoodPrice);
        fooditem.setFoodItemDescription(Description);
        fooditem.setFoodItemAllergens(Allergens);
        FoodItem.add(fooditem);
    }
     public  boolean CheckFoodName()
 {
     boolean C= FoodItem.isFoodItemNameTaken(FitemName);
     return C;
 }
}
