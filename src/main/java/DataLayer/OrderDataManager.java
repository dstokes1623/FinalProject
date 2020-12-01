/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import BusinessLayer.Order;
import java.util.ArrayList;

/**
 *
 * @author Client
 */
public class OrderDataManager {
    
    private ArrayList<Order> orders;
    
    public OrderDataManager(){
        this.orders = new ArrayList<Order>();
    }
    
    public Order create(Order orderToCreate){
        
        this.orders.add(orderToCreate);
        
        return orderToCreate;
    }
    
    public ArrayList<Order> getAll(){
       
        return this.orders;
    }
    
    
}
