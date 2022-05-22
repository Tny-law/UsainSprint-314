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
public class FoodItem {
    private int FoodItemId;
    private String FoodItemName;
    private String FoodItemCategory;
    private Float FoodItemPrice;
    private String FoodItemDescription;
    private String FoodItemAllergens;

    public int getFoodItemId() {
        return FoodItemId;
    }

    public void setFoodItemId(int FoodItemId) {
        this.FoodItemId = FoodItemId;
    }

    public String getFoodItemName() {
        return FoodItemName;
    }

    public void setFoodItemName(String FoodItemName) {
        this.FoodItemName = FoodItemName;
    }

    public String getFoodItemCategory() {
        return FoodItemCategory;
    }

    public void setFoodItemCategory(String FoodItemCategory) {
        this.FoodItemCategory = FoodItemCategory;
    }

    public Float getFoodItemPrice() {
        return FoodItemPrice;
    }

    public void setFoodItemPrice(Float FoodItemPrice) {
        this.FoodItemPrice = FoodItemPrice;
    }

    public String getFoodItemDescription() {
        return FoodItemDescription;
    }

    public void setFoodItemDescription(String FoodItemDescription) {
        this.FoodItemDescription = FoodItemDescription;
    }

    public String getFoodItemAllergens() {
        return FoodItemAllergens;
    }

    public void setFoodItemAllergens(String FoodItemAllergens) {
        this.FoodItemAllergens = FoodItemAllergens;
    }
    
    public static void add(FoodItem fooditem) {
        String query = "insert into fooditem(FoodItemName, FoodItemCategory, FoodItemPrice, FoodItemDescription, FoodItemAllergens) values('" + fooditem.getFoodItemName() + "','" + fooditem.getFoodItemCategory() + "','" + fooditem.getFoodItemPrice() + "','" + fooditem.getFoodItemDescription() + "','" + fooditem.getFoodItemAllergens() + "')";
        DbOperations.setDataOrDelete(query, "fooditem table created successfully");
    }

    public static ArrayList<FoodItem> getAllRecords() {
        ArrayList<FoodItem> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from fooditem");
            while (rs.next()) {
                FoodItem fooditem = new FoodItem();
                fooditem.setFoodItemId(rs.getInt("FoodItemId"));
                fooditem.setFoodItemName(rs.getString("FoodItemName"));
                fooditem.setFoodItemCategory(rs.getString("FoodItemCategory"));
                fooditem.setFoodItemPrice(rs.getFloat("FoodItemPrice"));
                fooditem.setFoodItemDescription(rs.getString("FoodItemDescription"));
                fooditem.setFoodItemAllergens(rs.getString("FoodItemAllergens"));
                arrayList.add(fooditem);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
        public static ArrayList<FoodItem> getAllCategory() {
        ArrayList<FoodItem> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select distinct FoodItemCategory from fooditem");
            while (rs.next()) {
                FoodItem fooditem = new FoodItem();
                fooditem.setFoodItemCategory(rs.getString("FoodItemCategory"));
                arrayList.add(fooditem);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void modify(FoodItem fooditem) {
        String query = "update fooditem set foodItemName = '" + fooditem.getFoodItemName() + "', foodItemCategory = '" + fooditem.getFoodItemCategory() + "',  foodItemPrice = '" + fooditem.getFoodItemPrice() + "', foodItemDescription = '" + fooditem.getFoodItemDescription() + "', foodItemAllergens = '" + fooditem.getFoodItemAllergens()+ "' where foodItemId = '"+fooditem.getFoodItemId()+"'";
        DbOperations.setDataOrDelete(query, "Food Item updated successfully");
        
    }

    public static void delete(String foodItemName) {
        String query = "delete from fooditem where FoodItemName = '" + foodItemName + "'";
        DbOperations.setDataOrDelete(query, "Food Item deleted successfully");
    }
        
    
    public static boolean isFoodItemNameTaken(String FoodItemName) {
        boolean exist = false;
        try {
            ResultSet rs = DbOperations.getData("select * from fooditem where fooditemname = '" + FoodItemName + "'");
            if (rs.next()) {
                exist = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return exist;
    }
        
            public static ArrayList<FoodItem> getAllRecordsByCategory(String category)
    {
        ArrayList<FoodItem> arrayList = new ArrayList<>();
        try {
            ResultSet rs =DbOperations.getData("select * from fooditem where FoodItemCategory='"+category+"'");
            while(rs.next())
            {
                FoodItem foodItem = new FoodItem();
                foodItem.setFoodItemName(rs.getString("FoodItemName"));
                arrayList.add(foodItem);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static ArrayList<FoodItem> filterFoodname(String name, String category)
    {
        ArrayList<FoodItem> arrayList = new ArrayList<>();
        try {
            ResultSet rs =DbOperations.getData("select * from fooditem where foodItemName like '%"+name+"%' and FoodItemCategory = '"+category+"'");
            while(rs.next())
            {
                FoodItem foodItem = new FoodItem();
                foodItem.setFoodItemName(rs.getString("FoodItemName"));
                arrayList.add(foodItem);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static FoodItem getFoodItemByName(String name)
    {
        FoodItem foodItem = new FoodItem();
        try {
            ResultSet rs = DbOperations.getData("select * from fooditem where foodItemName='"+name+"'");
            while(rs.next())
            {
                foodItem.setFoodItemName(rs.getString(2));
                foodItem.setFoodItemCategory(rs.getString(3));
                foodItem.setFoodItemPrice(rs.getFloat(4));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return foodItem;
    }
}
