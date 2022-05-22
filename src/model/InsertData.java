/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author TonyL
 */
public class InsertData {
    
    public static void main(String args[]){
        try{
            String clearrole = ("truncate table role");
            String clearaccount= ("truncate table account");
            String clearcoupon = ("truncate table coupon");
            String clearfooditem = ("truncate table fooditem");
            String clearorders = ("truncate table orders");
            String clearorderdetail = ("truncate table orderdetail");
         String inserrole = "insert into role (RoleName) values ('User Admin'),('Owner'),('Manager'),('Staff');";
         String inseracc = "insert into account (AccUsername, AccPassword, AccName, AccPhone, AccEmail, AccRole, Status) values\n" +
"('Owner', 'owner0', 'Owner', '87654320', 'owner@gmail.com', 'Owner', 'Open') ,\n" +
"('Owner1', 'owner1', 'Owner1', '87654321', 'owner1@gmail.com', 'Owner', 'Open') ,\n" +
"('Owner2', 'owner2', 'Owner2', '87654322', 'owner2@gmail.com', 'Owner', 'Open') ,\n" +
"('Owner3', 'owner3', 'Owner3', '87654323', 'owner3@gmail.com', 'Owner', 'Open') ,\n" +
"('Owner4', 'owner4', 'Owner4', '87654324', 'owner4@gmail.com', 'Owner', 'Open') ,\n" +
"('Owner5', 'owner5', 'Owner5', '87654325', 'owner5@gmail.com', 'Owner', 'Open') ,\n" +
"('Owner6', 'owner6', 'Owner6', '87654326', 'owner6@gmail.com', 'Owner', 'Close') ,\n" +
"('Owner7', 'owner7', 'Owner7', '87654327', 'owner7@gmail.com', 'Owner', 'Close') ,\n" +
"('Owner8', 'owner8', 'Owner8', '87654328', 'owner8@gmail.com', 'Owner', 'Close') ,\n" +
"('Owner9', 'owner9', 'Owner9', '87654329', 'owner9@gmail.com', 'Owner', 'Close') ,\n" +
"('Owner10', 'owner10', 'Owner10', '97654330', 'owner10@gmail.com', 'Owner', 'Close') ,\n" +
"('Staff', 'staff0', 'Staff', '97654331', 'staff@gmail.com', 'Staff', 'Open') ,\n" +
"('Staff1', 'staff1', 'Staff1', '97654332', 'staff1@gmail.com', 'Staff', 'Open') ,\n" +
"('Staff2', 'staff2', 'Staff2', '97654333', 'staff2@gmail.com', 'Staff', 'Open') ,\n" +
"('Staff3', 'staff3', 'Staff3', '97654334', 'staff3@gmail.com', 'Staff', 'Open') ,\n" +
"('Staff4', 'staff4', 'Staff4', '97654335', 'staff4@gmail.com', 'Staff', 'Open') ,\n" +
"('Staff5', 'staff5', 'Staff5', '97654336', 'staff5@gmail.com', 'Staff', 'Open') ,\n" +
"('Staff6', 'staff6', 'Staff6', '97654337', 'staff6@gmail.com', 'Staff', 'Close') ,\n" +
"('Staff7', 'staff7', 'Staff7', '97654338', 'staff7@gmail.com', 'Staff', 'Close') ,\n" +
"('Staff8', 'staff8', 'Staff8', '97654339', 'staff8@gmail.com', 'Staff', 'Close') ,\n" +
"('Staff9', 'staff9', 'Staff9', '97654340', 'staff9@gmail.com', 'Staff', 'Close') ,\n" +
"('Staff10', 'staff10', 'Staff10', '97654341', 'staff10@gmail.com', 'Staff', 'Close') ,\n" +
"('Useradmin', 'useradmin0', 'Useradmin', '98765342', 'useradmin@gmail.com', 'Useradmin', 'Open') ,\n" +
"('Useradmin1', 'useradmin1', 'Useradmin1', '98765343', 'useradmin1@gmail.com', 'User Admin', 'Open') ,\n" +
"('Useradmin2', 'useradmin2', 'Useradmin2', '98765344', 'useradmin2@gmail.com', 'User Admin', 'Open') ,\n" +
"('Useradmin3', 'useradmin3', 'Useradmin3', '98765345', 'useradmin3@gmail.com', 'User Admin', 'Open') ,\n" +
"('Useradmin4', 'useradmin4', 'Useradmin4', '98765346', 'useradmin4@gmail.com', 'User Admin', 'Open') ,\n" +
"('Useradmin5', 'useradmin5', 'Useradmin5', '98765347', 'useradmin5@gmail.com', 'User Admin', 'Open') ,\n" +
"('Useradmin6', 'useradmin6', 'Useradmin6', '98765348', 'useradmin6@gmail.com', 'User Admin', 'Close') ,\n" +
"('Useradmin7', 'useradmin7', 'Useradmin7', '98765349', 'useradmin7@gmail.com', 'User Admin', 'Close') ,\n" +
"('Useradmin8', 'useradmin8', 'Useradmin8', '98765350', 'useradmin8@gmail.com', 'User Admin', 'Close') ,\n" +
"('Useradmin9', 'useradmin9', 'Useradmin9', '98765351', 'useradmin9@gmail.com', 'User Admin', 'Close') ,\n" +
"('Useradmin10', 'useradmin10', 'Useradmin10', '98765352', 'useradmin10@gmail.com', 'User Admin', 'Close') ,\n" +
"('Manager', 'manager0', 'Manager', '98767342', 'manager@gmail.com', 'Manager', 'Open') ,\n" +
"('Manager1', 'manager1', 'Manager1', '98865343', 'manager1@gmail.com', 'Manager', 'Open') ,\n" +
"('Manager2', 'manager2', 'Manager2', '98865344', 'manager2@gmail.com', 'Manager', 'Open') ,\n" +
"('Manager3', 'manager3', 'Manager3', '98865345', 'manager3@gmail.com', 'Manager', 'Open') ,\n" +
"('Manager4', 'manager4', 'Manager4', '98865346', 'manager4@gmail.com', 'Manager', 'Open') ,\n" +
"('Manager5', 'manager5', 'Manager5', '98865347', 'manager5@gmail.com', 'Manager', 'Open') ,\n" +
"('Manager6', 'manager6', 'Manager6', '98865348', 'manager6@gmail.com', 'Manager', 'Close') ,\n" +
"('Manager7', 'manager7', 'Manager7', '98865349', 'manager7@gmail.com', 'Manager', 'Close') ,\n" +
"('Manager8', 'manager8', 'Manager8', '98865350', 'manager8@gmail.com', 'Manager', 'Close') ,\n" +
"('Manager9', 'manager9', 'Manager9', '98865351', 'manager9@gmail.com', 'Manager', 'Close') ,\n" +
"('Manager10', 'manager10', 'Manager10', '98865352', 'manager10@gmail.com', 'Manager', 'Close');";
         
         String insertcoupon = "insert into coupon (couponname, coupondiscount, startdate, enddate) values\n" +
"('1off', '1', '2022-01-01', '2022-01-01') ,\n" +
"('2off', '2', '2022-02-02', '2022-02-02') ,\n" +
"('3off', '3', '2022-03-03', '2022-03-03') ,\n" +
"('4off', '4', '2022-04-04', '2022-04-04') ,\n" +
"('5off', '5', '2022-05-05', '2022-05-05') ,\n" +
"('6off', '6', '2022-06-06', '2022-06-06') ,\n" +
"('7off', '7', '2022-07-07', '2022-07-07') ,\n" +
"('8off', '8', '2022-08-08', '2022-08-08') ,\n" +
"('9off', '9', '2022-09-09', '2022-09-09') ,\n" +
"('10off', '10', '2022-10-10', '2022-10-10') ,\n" +
"('11off', '11', '2022-11-11', '2022-11-11') ,\n" +
"('12off', '12', '2022-12-12', '2022-12-12');";
         String insertfooditem = "insert into fooditem (FoodItemName, FoodItemCategory, FoodItemPrice, FoodItemDescription, FoodItemAllergens) values\n" +
"('Steam Fish With Cai Pu', 'Fish', 28, 'Steamed fish', 'Fish') ,\n" +
"('Teochew Style Steamed Fish', 'Fish', 28, 'Teochew Steamed Fish', 'Fish') ,\n" +
"('Steamed Fish With Garlic', 'Fish', 28, 'Steamed Garlic Fish', 'Fish') ,\n" +
"('Deep Fried Fish', 'Fish', 28, 'Fried Fish', 'Fish') ,\n" +
"('Curry Fish Head', 'Fish', 23, 'Curry Fish', 'Fish') ,\n" +
"('Nonya Fish Head', 'Fish', 23, 'Nonya Fish', 'Fish') ,\n" +
"('Sliced Fish With Seasonal Vegetables', 'Fish', 13, 'Seasonal Veggie', 'Fish') ,\n" +
"('Sweet and Sour Sliced Fish', 'Fish', 13, 'Sweet and Sour Fish', 'Fish') ,\n" +
"('Ginger Spring Onion Sliced Fish', 'Fish', 13, 'Ginger Spring Onion', 'Fish') ,\n" +
"('Crab Meat Shark''s Fin', 'Shark''s Fin', 31, 'Crab Meat with Shark Fin', 'Crab') ,\n" +
"('Crab Meat Fish Maw', 'Fish Maw', 23, 'Crab Meat with Fish Maw', 'Crab') ,\n" +
"('Seacucumber Fish Maw', 'Fish Maw', 21, 'Seacumcumber with Fish Maw', '') ,\n" +
"('Cereal Prawn', 'Prawn', 17, 'Prawn in Cereal', 'Prawn') ,\n" +
"('Thousand Island Sauce Prawn', 'Prawn', 17, 'Prawn in Thousand Island Sauce', 'Prawn') ,\n" +
"('Oyster Sauce Prawn', 'Prawn', 17, 'Prawn in Oyster Sauce', 'Prawn') ,\n" +
"('Nonya Prawn', 'Prawn', 17, 'Nonya Prawn', 'Prawn') ,\n" +
"('Cereal Sotong', 'Sotong', 13, 'Sotong in Cereal', 'Sotong') ,\n" +
"('Tasty Salad Sotong', 'Sotong', 13, 'Sotong in Tasty Salad', 'Sotong') ,\n" +
"('Salted Egg Sotong', 'Sotong', 13, 'Sotong in Salted Egg Sauce', 'Sotong') ,\n" +
"('Chilli Lala', 'Lala', 16, 'Lala in Chilli Sauce', '') ,\n" +
"('Fragrant Spicy Lala', 'Lala',16, 'Lala in Fragrant Spicy Sauce', '') ,\n" +
"('Ginger Spring Onion Lala', 'Lala',16, 'Lala with Ginger Spring Onion', '') ,\n" +
"('Sambal Lala',  'Lala',16,'Lala in Sambal Sauce', '') ,\n" +
"('Imperial Pork Ribs', 'Pork', 11, 'Pork Prince', '') ,\n" +
"('Sweet and Sour Pork', 'Pork', 11, 'Pork in Sweet and Sour Sauce', '') ,\n" +
"('Salted Egg Pork Ribs', 'Pork', 15, 'Pork Ribs in Salted Egg Sauce', '') ,\n" +
"('Black Pepper Pork Ribs', 'Pork', 13, 'Pork Ribs in Black Pepper Sauce', '') ,\n" +
"('Hong Kong Style Pork Ribs', 'Pork', 14, 'Pork from Hong Kong', '') ,\n" +
"('Prawn Paste Chicken Mid Joint Wing', 'Chicken', 11, 'Fried Chicken in Prawn Paste', 'Prawn') ,\n" +
"('Dried Chilli Chicken Cube', 'Chicken', 11, 'Chicken Cube in Dried Chilli', '') ,\n" +
"('Chicken with Cashew Nuts', 'Chicken', 11, 'Chicken with Cashew Nuts', '') ,\n" +
"('Chicken with Mango Salad', 'Chicken', 11, 'Chicken with Mango Salad', '') ,\n" +
"('Oyster Omelette', 'Omelette', 9, 'Oyster in Egg', 'Oyster') ,\n" +
"('Fu Rong Omelette', 'Omelette', 7, 'Omelette in Fu Rong Style', '') ,\n" +
"('Onion Omelette', 'Omelette', 7, 'Onion in Egg', '') ,\n" +
"('Cai Pu Omelette', 'Omelette', 7, 'Cai Pu in Egg', '') ,\n" +
"('Shrimp Omelette', 'Omelette', 7, 'Shrimp in Egg', 'Prawn') ,\n" +
"('Hotplate Beancurd', 'Beancurd', 9, 'Beancurd on Hotplate', '') ,\n" +
"('Claypot Beancurd', 'Beancurd', 9, 'Beancurd in Claypot', '') ,\n" +
"('Minced Meat Homemade Beancurd', 'Beancurd', 9, 'Homemade Beancurd with Minced Meat', '') ,\n" +
"('Xue Hua Homemade Beancurd', 'Beancurd', 9, 'Homemade Beancurd with Xue Hua', '') ,\n" +
"('Crabmeat Homemade Beancurd', 'Beancurd', 9, 'Homemade Beancurd with Crab Meat', 'Crab') ,\n" +
"('Sambal Kang Kong', 'Vegetable', 8, 'Kang Kong in Sambal Sauce', '') ,\n" +
"('Sambal Sweet Potato Leaf', 'Vegetable', 8, 'Sweet Potato Leaf in Sambal Sauce', '') ,\n" +
"('Garlic Nai Bai Cai', 'Vegetable', 8, 'Nai Bai Cai with garlic', '') ,\n" +
"('Oyster Sauce Baby Kai Lan', 'Vegetable', 8, 'Baby Kai Lan in Oyster Sauce', '') ,\n" +
"('Assorted Luo Han Vegetable', 'Vegetable', 9, 'Assorted Vegetable', '') ,\n" +
"('Stir-Fry Mixed Vegetable', 'Vegetable', 9, 'Mixed Vegetable Stir-Fried', '') ,\n" +
"('Seasonal Vegetable with Mushroom', 'Vegetable', 15, 'Special Vegetable and Mushroom', '') ,\n" +
"('Brocolli with Scallop', 'Vegetable', 17, 'Brocolli and Scallop', 'Scallop') ,\n" +
"('Salted Vegetable Beancurd Soup', 'Soup', 6, 'Vegetable and Beancurd in Soup', '') ,\n" +
"('Bittergourd Soup', 'Soup', 6, 'Bittergourd Soup', '') ,\n" +
"('Seaweed Soup', 'Soup', 6, 'Seaweed Soup', '') ,\n" +
"('Seafood Soup', 'Soup', 6, 'Seafood Soup', '') ,\n" +
"('Fish Head Beancurd Soup', 'Soup', 6, 'Fish Head and Beancurd in Soup', '') ,\n" +
"('Tom Yum Soup', 'Soup', 7, 'Taste of Thailand', '') ,\n" +
"('Fishmaw Egg Soup', 'Soup', 9, 'Fishmaw Egg Soup', '');";
         
         String insertOrders = "insert into orders (TableNumber, PhoneNumber, Date, quantity, Total,createdBy,Discount,GrandTotal,Allergy,OStatus) values\n" +
"('1', '92222222', '2022-05-19', 1, '13', '92222222', 0.00, 13.00, null, 'Unfulfilled')," +
"('2', '93333333', '2022-05-19', 2, '26', '93333333', 0.00, 26.00, null, 'Unfulfilled')," +
"('3', '94444444', '2022-05-19', 3, '39', '94444444', 0.00, 39.00, null, 'Unfulfilled')," +
"('4', '95555555', '2022-05-20', 1, '13', '95555555', 0.00, 13.00, null, 'Unfulfilled')," +
"('5', '96666666', '2022-05-20', 2, '26', '96666666', 0.00, 26.00, null, 'Unfulfilled')," +
"('6', '97777777', '2022-05-20', 3, '39', '97777777', 0.00, 39.00, null, 'Unfulfilled')," +
"('4', '98888888', '2022-05-20', 1, '13', '98888888', 0.00, 13.00, null, 'Unfulfilled')," +
"('5', '99999999', '2022-05-20', 1, '13', '99999999', 0.00, 13.00, null, 'Unfulfilled')," +
"('6', '91111111', '2022-05-20', 1, '13', '91111111', 0.00, 13.00, null, 'Unfulfilled')," +
"('3', '93333333', '2021-12-20', 15, '195', '93333333', 0.00, 195.00, null, 'Unfulfilled')," +
"('1', '91111111', '2022-05-01', 10, '130', '91111111', 0.00, 130.00, null, 'Unfulfilled');";
         
         String insertOrderDetail = "insert into orderdetail (OrderId, FoodItem, FoodQuantity, FoodPrice, OrderDate, TotalPrice,Discount) values\n" +
"(1, 'Sweet and Sour Sliced Fish', 1, 13.00, '2022-05-19', 13.00, '0.00')," +
"(2, 'Salted Egg Sotong', 1, 13.00, '2022-05-19', 13.00, '0.00')," +
"(2, 'Sweet and Sour Sliced Fish', 1, 13.00, '2022-05-19', 13.00, '0.00')," +
"(3, 'Sweet and Sour Sliced Fish', 1, 13.00, '2022-05-19', 13.00, '0.00')," +
"(3, 'Salted Egg Sotong', 1, 13.00, '2022-05-19', 13.00, '0.00')," +
"(3, 'Salted Egg Sotong', 1, 13.00, '2022-05-19', 13.00, '0.00')," +
"(4, 'Sweet and Sour Sliced Fish', 1, 13.00, '2022-05-20', 13.00, '0.00')," +
"(5, 'Salted Egg Sotong', 1, 13.00, '2022-05-20', 13.00, '0.00')," +
"(5, 'Sweet and Sour Sliced Fish', 1, 13.00, '2022-05-20', 13.00, '0.00')," +
"(6, 'Sweet and Sour Sliced Fish', 1, 13.00, '2022-05-20', 13.00, '0.00')," +
"(6, 'Salted Egg Sotong', 1, 13.00, '2022-05-20', 13.00, '0.00')," +
"(6, 'Salted Egg Sotong', 1, 13.00, '2022-05-20', 13.00, '0.00')," +
"(7, 'Sweet and Sour Sliced Fish', 1, 13.00, '2022-05-21', 13.00, '0.00')," +
"(8, 'Salted Egg Sotong', 1, 13.00, '2022-05-21', 13.00, '0.00')," +
"(9, 'Salted Egg Sotong', 1, 13.00, '2022-05-21', 13.00, '0.00')," +
"(10, 'Cereal Sotong', 15, 13.00, '2021-12-20', 195.00, '0.00')," +
"(11, 'Tasty Salad Sotong', 10, 13.00, '2022-05-01', 130.00, '0.00');";
         
         
         DbOperations.setDataOrDelete(clearrole, "table role table cleared successfully");
         DbOperations.setDataOrDelete(clearaccount, "table account table cleared successfully");
         DbOperations.setDataOrDelete(clearcoupon, "table coupon table cleared successfully");
         DbOperations.setDataOrDelete(clearfooditem, "table fooditem table cleared successfully");
         DbOperations.setDataOrDelete(clearorders, "table orders table cleared successfully");
         DbOperations.setDataOrDelete(clearorderdetail, "table orderdetail table cleared successfully");
         DbOperations.setDataOrDelete(inserrole, "insert role successfully");
         DbOperations.setDataOrDelete(inseracc, "insert account successfully");
         DbOperations.setDataOrDelete(insertcoupon, "insert coupon successfully");
         DbOperations.setDataOrDelete(insertfooditem, "insert coupon successfully");
         DbOperations.setDataOrDelete(clearorders, "table orders table cleared successfully");
         DbOperations.setDataOrDelete(insertOrders, "insert orders successfully");
         DbOperations.setDataOrDelete(clearorderdetail, "table orderdetail table cleared successfully");
         DbOperations.setDataOrDelete(insertOrderDetail, "insert orderdetails successfully");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
       }  
}
}