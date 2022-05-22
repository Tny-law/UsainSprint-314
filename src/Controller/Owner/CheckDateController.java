/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Owner;

import model.Orders;

/**
 *
 * @author TonyL
 */
public class CheckDateController {
     public String ChecBigDate()
     {
         String BigDate="";
         Orders or = new  Orders();
         BigDate=or.CheckMaxDate();
         return BigDate;
     }
     
      public String ChecSmallDate()
     {
         
         String SmallDate ="";
         Orders or = new  Orders();
         SmallDate=or.CheckMinDate();
         return SmallDate;
     }
}
