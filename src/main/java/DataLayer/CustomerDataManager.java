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
    
    public ArrayList<Customer> getCustomerByUserID(int userID){
        ArrayList<Customer> output = new ArrayList();
     
        for(Customer customer : this.customers){
            if(customer.getCustomerID() == userID){
                output.add(customer);
            }
        }
        return output;
    }
}
