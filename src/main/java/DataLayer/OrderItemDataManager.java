/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import BusinessLayer.Order;
import BusinessLayer.OrderItem;
import java.util.ArrayList;

/**
 *
 * @author Client
 */
public class OrderItemDataManager {
    
    private ArrayList<OrderItem> items;
    
    public OrderItemDataManager(){
        this.items = new ArrayList<OrderItem>();
    }
    
    public OrderItem create(OrderItem itemToCreate){
        
        this.items.add(itemToCreate);
        
        return itemToCreate;
    }
    
    public ArrayList<OrderItem> getAll(){
      
        return this.items;
        
    }
    public ArrayList<OrderItem> getByOrderNumber(int orderNumber){
        ArrayList<OrderItem> output = new ArrayList(orderNumber);
        
        for(OrderItem item : items){
            if(item.getOrderNumber() == orderNumber){
                output.add(item);
            }
        }
        return output;
    }
}
