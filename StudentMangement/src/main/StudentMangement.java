package main;

import data.Cabinet;
import ui.Menu;

public class StudentMangement {

    public static void main(String[] args) {

        Menu menu = new Menu("Student Management");
        Menu subMenu = new Menu("Update Menu");

        menu.addOption("1 - Add new Student");
        menu.addOption("2 - Search Student by ID");
        menu.addOption("3 - Remove Student");
        menu.addOption("4 - Update information of Student");
        menu.addOption("5 - Show profile of List Student");
        menu.addOption("6 - Show profile of List Student (in Ascending Of Name)");
        menu.addOption("7 - Show profile of List Student (in Ascending Of ID)");
        menu.addOption("8 - Show profile of List Student (in Ascending Of Gpa)");
        menu.addOption("9 - Quit Program");

        subMenu.addOption("1 - Update Gpa of Student");
        subMenu.addOption("2 - Update Yob of Student");
        subMenu.addOption("3 - Update Name of Student");

        int choice;
        Cabinet cabinet = new Cabinet();

        do {
            menu.printOpTion();
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    cabinet.addAStudent();
                    break;
                case 2:
                    cabinet.searchByID();
                    break;
                case 3:
                    cabinet.removeStudent();
                    break;
                case 4:
                    subMenu.printOpTion();
                    choice = subMenu.getChoice();
                    switch (choice) {
                        case 1:
                            cabinet.updateGpaOfStudent();
                            break;
                        case 2:
                            cabinet.updateYobOfStudent();
                            break;
                        case 3:
                            cabinet.updateNameOfStudent();
                            break;
                    }
                    break;
                case 5:
                    cabinet.showProfile();
                    break;
                case 6:
                    cabinet.showProfileInAscendingOfName();
                    break;
                case 7:
                    cabinet.showProfileInAscendingOfID();
                    break;
                case 8:
                    cabinet.showProfileInAscendingOfGpa();
                    break;
                case 9:
                    System.out.println("Bye Bye!!! See you again <3");
                    break;
            }
        } while (choice != 9);

    }

}
