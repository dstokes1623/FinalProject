/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import BusinessLayer.Product;
import java.util.ArrayList;

/**
 *
 * @author Client
 */
public class ProductDataManager {
    
    private ArrayList<Product> products;
    
    public ProductDataManager(){
        
        this.products = new ArrayList<Product>();
        
    }
    
    public Product create(Product productToCreate){
        
        this.products.add(productToCreate);
        
        return productToCreate;
    }
    
    public ArrayList<Product> getAll(){
        
        return this.products;
        
    }
}
