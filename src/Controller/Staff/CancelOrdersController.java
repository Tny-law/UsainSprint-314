/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Staff;

import model.Orders;

/**
 *
 * @author Eechang
 */
public class CancelOrdersController {
        public int Id;
    
    public void cancelOrderController() {
        Orders order = new Orders();
        order.setId(Id);
        order.cancelOrder(order);
    }
}
