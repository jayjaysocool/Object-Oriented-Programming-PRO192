package main;

import data.Cabinet;
import ui.Menu;

/*Build a Order Management program. With the following basic functions

1. List all Products
2. List all Customers
3. Search a Customer based on his/her ID
4. Add a Customer
5. Update a Customer
6. Save Customers to the file, named customers.txt
7. List all Orders in ascending order of Customer name
8. List all pending Orders
9. Add an Order
10. Update an Order
    10.1. Update an Order based on its ID
    10.2. Delete an Order based on its ID
11. Save Orders to file, named orders.txt
Others- Quit

 */
public class OrderManagement {

    public static void main(String[] args) {

        Menu mainMenu = new Menu("Order Management");
        Menu subMenu = new Menu("Update Menu");

        mainMenu.addOption("1. List all Products");
        mainMenu.addOption("2. List all Customers");
        mainMenu.addOption("3. Search a Customer based on his/her ID");
        mainMenu.addOption("4. Add a Customer");
        mainMenu.addOption("5. Update a Customer");
        mainMenu.addOption("6. Save Customers to the file, named customers.txt");
        mainMenu.addOption("7. List all Orders in ascending order of Customer name");
        mainMenu.addOption("8. List all pending Orders");
        mainMenu.addOption("9. Add an Order");
        mainMenu.addOption("10. Update an Order");
        mainMenu.addOption("11. Save Orders to file, named orders.txt");
        mainMenu.addOption("12. Quit");

        subMenu.addOption("1. Update an Order based on its ID");
        subMenu.addOption("2. Delete an Order based on its ID");

        int choice;
        Cabinet cabinet = new Cabinet();

        do {
            mainMenu.showMenu();
            choice = mainMenu.getchoice();

            switch (choice) {
                case 1:
                    cabinet.printProducts();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    subMenu.showMenu();
                    choice = subMenu.getchoice();
                    switch (choice) {
                        case 1:
                            break;
                        case 2:
                            break;
                    }
                    break;
                case 11:
                    break;
                case 12:
                    System.out.println("Goodbye!!! <3");
                    break;
            }
        } while (choice != 12);

    }

}
