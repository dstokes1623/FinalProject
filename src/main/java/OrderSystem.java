
import BusinessLayer.Customer;
import BusinessLayer.Order;
import BusinessLayer.Product;
import DataLayer.CustomerDataManager;
import DataLayer.OrderDataManager;
import DataLayer.OrderItemDataManager;
import DataLayer.ProductDataManager;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Client
 */
public class OrderSystem {
    public static void main(String[] args) {
         CustomerDataManager customerDM = new CustomerDataManager();
         OrderDataManager orderDM = new OrderDataManager();
         OrderItemDataManager orderItemDM = new OrderItemDataManager();
         ProductDataManager productDM = new ProductDataManager();
         
         Customer cust1 = new Customer(1, "John", "Tester", "(913)555-1623");
         Customer cust2 = new Customer(2, "Brad", "Mondo", "(816)555-0922");
         Customer cust3 = new Customer(3, "Mikayla", "Madison", "(505)555-1782");
         
         Product prod1 = new Product(1, "Cat", 22, 99.99);
         Product prod2 = new Product(2, "Dog", 12, 200.28);
         Product prod3 = new Product(3, "Fish", 50, 20.99);
         
         Order order1 = new Order(1, 2, "10/22/2020");
         Order order2 = new Order(2, 1, "10/31/2020");
         Order order3 = new Order(3, 3, "11/20/2020");
         
         
         
    }
}
