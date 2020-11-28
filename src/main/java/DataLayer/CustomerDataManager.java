/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import BusinessLayer.Customer;
import java.util.ArrayList;

/**
 *
 * @author Client
 */
public class CustomerDataManager {
    private ArrayList<Customer> customers;
    
    public CustomerDataManager(){
        this.customers = new ArrayList<Customer>();
    }
    
    public Customer create(Customer customerToCreate){
       
        this.customers.add(customerToCreate);
        
        return customerToCreate;
    }
    
    public ArrayList <Customer> getAll(){
      
        return this.customers;
    }
}
