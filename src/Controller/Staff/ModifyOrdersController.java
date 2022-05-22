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
public class ModifyOrdersController {

    public int Id;
    
    public void fulfillOrderController() {
        Orders order = new Orders();
        order.setId(Id);
        order.fulfillOrder(order);
    }
    
        public void unfulfillOrderController() {
        Orders order = new Orders();
        order.setId(Id);
        order.unfulfillOrder(order);
    }
}
