// INVENTORY MANAGEMENT SYSTEM 
// Objective = To create an inventory management system with three catagories in which we can add data and edit and get data
// Here is the code
//This code allows you to manage items in three different categories (electronics, clothing, and books) and edit/view their data.
//First, we need to create a class to represent the items in our inventory:


public class Item {
    private String name;
    private String category;
    private int quantity;

    public Item(String name, String category, int quantity) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

// This class has three instance variables: name (the name of the item), category (the category of the item), and quantity (the quantity of the item). We also have a constructor to create a new item object with these values, and getter and setter methods to access and modify the quantity of an item.
//Next, we need to create our inventory management system:

import java.util.ArrayList;
import java.util.Scanner;

public class InventoryManagementSystem {
    private ArrayList<Item> inventory;

    public InventoryManagementSystem() {
        inventory = new ArrayList<Item>();
    }

    public void addItem(String name, String category, int quantity) {
        Item item = new Item(name, category, quantity);
        inventory.add(item);
        System.out.println("Item added successfully.");
    }

    public void removeItem(String name) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getName().equals(name)) {
                inventory.remove(i);
                System.out.println("Item removed successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void editQuantity(String name, int newQuantity) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getName().equals(name)) {
                inventory.get(i).setQuantity(newQuantity);
                System.out.println("Quantity updated successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void viewInventory() {
        System.out.println("Name\tCategory\tQuantity");
        for (Item item : inventory) {
            System.out.println(item.getName() + "\t" + item.getCategory() + "\t\t" + item.getQuantity());
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        while (!choice.equals("5")) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Edit quantity");
            System.out.println("4. View inventory");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter category (electronics/clothing/books): ");
                    String category = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    ims.addItem(name, category, quantity);
                    break;
                case "2":
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    ims.removeItem(name);
                    break;
