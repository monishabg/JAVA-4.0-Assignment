package com.inventory.example;
//File: InventoryManager.java

import java.util.HashMap;
import java.util.Scanner;

class Product {
 int productId;
 String productName;
 int quantity;
 double price;

 public Product(int productId, String productName, int quantity, double price) {
     this.productId = productId;
     this.productName = productName;
     this.quantity = quantity;
     this.price = price;
 }

 public String toString() {
     return "Product ID: " + productId +
            ", Name: " + productName +
            ", Quantity: " + quantity +
            ", Price: $" + price;
 }
}

public class InventoryManager {
 HashMap<Integer, Product> inventory = new HashMap<>();

 public void addProduct(Product product) {
     inventory.put(product.productId, product);
     System.out.println("Product added.");
 }

 public void updateProduct(int productId, String name, int quantity, double price) {
     if (inventory.containsKey(productId)) {
         Product product = inventory.get(productId);
         product.productName = name;
         product.quantity = quantity;
         product.price = price;
         System.out.println("Product updated.");
     } else {
         System.out.println("Product not found.");
     }
 }

 public void deleteProduct(int productId) {
     if (inventory.remove(productId) != null) {
         System.out.println("Product deleted.");
     } else {
         System.out.println("Product not found.");
     }
 }

 public void viewInventory() {
     if (inventory.isEmpty()) {
         System.out.println("Inventory is empty.");
     } else {
         for (Product p : inventory.values()) {
             System.out.println(p);
         }
     }
 }

 public static void main(String[] args) {
     InventoryManager manager = new InventoryManager();

     // Sample usage
     manager.addProduct(new Product(1, "Keyboard", 50, 799.99));
     manager.addProduct(new Product(2, "Mouse", 100, 499.99));
     manager.updateProduct(1, "Mechanical Keyboard", 60, 999.99);
     manager.viewInventory();
     manager.deleteProduct(2);
     manager.viewInventory();
 }
}
