
import BusinessLayer.Customer;
import BusinessLayer.Order;
import BusinessLayer.OrderItem;
import BusinessLayer.Product;
import DataLayer.CustomerDataManager;
import DataLayer.OrderDataManager;
import DataLayer.OrderItemDataManager;
import DataLayer.ProductDataManager;
import Logging.ConsoleLogger;
import Logging.Logger;
import java.util.ArrayList;

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
         Logger logger = new ConsoleLogger();
         
         CustomerDataManager customerDM = new CustomerDataManager();
         OrderDataManager orderDM = new OrderDataManager();
         OrderItemDataManager orderItemDM = new OrderItemDataManager();
         ProductDataManager productDM = new ProductDataManager();
         
         Customer cust1 = new Customer(1, "John", "Tester", "(913)555-1623");
         Customer cust2 = new Customer(2, "Brad", "Mondo", "(816)555-0922");
         Customer cust3 = new Customer(3, "Mikayla", "Madison", "(505)555-1782");
         
         Product prod1 = new Product(1, "Cat", 22, 100);
         Product prod2 = new Product(2, "Dog", 12, 200);
         Product prod3 = new Product(3, "Fish", 50, 20);
         
         Order order1 = new Order(1, 2, "10/22/2020");
         Order order2 = new Order(2, 1, "10/31/2020");
         Order order3 = new Order(3, 3, "11/20/2020");
         
         OrderItem ordItem1 = new OrderItem(1, 1, 2, "Dog", 2, 400);
         OrderItem ordItem2 = new OrderItem(1, 1, 3, "Fish", 1, 20);
         
         OrderItem ordItem3 = new OrderItem(2, 2, 1, "Cat", 2, 200);
         OrderItem ordItem4 = new OrderItem(2, 2, 3, "Fish", 4, 80);
         
         OrderItem ordItem5 = new OrderItem(3, 3, 2, "Dog", 1, 200);
         OrderItem ordItem6 = new OrderItem(3, 3, 1, "Cat", 2, 200);
         
         logger.logInfo("Creating users");
         
         customerDM.create(cust1);
         customerDM.create(cust2);
         customerDM.create(cust3);
         
         logger.logInfo("Creating orders");
         
         orderDM.create(order1);
         orderDM.create(order2);
         orderDM.create(order3);
         
         logger.logInfo("Creating order items");
         
         orderItemDM.create(ordItem1);
         orderItemDM.create(ordItem2);
         orderItemDM.create(ordItem3);
         orderItemDM.create(ordItem4);
         orderItemDM.create(ordItem5);
         orderItemDM.create(ordItem6);
         
         logger.logInfo("Creating products");
         
         productDM.create(prod1);
         productDM.create(prod2);
         productDM.create(prod3);
         
         logger.logInfo("Retrieving customers");
         
         ArrayList<Customer> allCustomers = customerDM.getAll();
         System.out.println(allCustomers);
         
         logger.logInfo("Retrieving orders");
         
         ArrayList<Order> allOrders = orderDM.getAll();
         System.out.println(allOrders);
         
         logger.logInfo("Retrieving order items");
         
         ArrayList<OrderItem> allOrderItems = orderItemDM.getAll();
         System.out.println(allOrderItems);
         
         
    }
}
