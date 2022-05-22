/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Owner;
import model.Orders;
/**
 *
 * @author Eechang
 */
public class generateReportController {
    public String fromDate;
    public String toDate;
     public Float AveData()
     {
         Float avger = 0f;
         Orders Or = new Orders();
         avger=Or.GatAvg(fromDate, toDate);        
         return avger;
     }
     
     public Orders HigP()
     {
         Orders Or = new Orders();
         Or.HigPrice(fromDate, toDate);
         Or.MaxItem(fromDate, toDate);
         Or.MinItem(fromDate, toDate);
         return Or;
     }
     
    
    
}


