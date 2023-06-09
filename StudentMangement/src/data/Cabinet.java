package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import utils.MyToys;

//Cabinet stored information of student 
//using ArrayList with data type is Student ( object data Type )  
public class Cabinet {

    private List<Student> listStudent = new ArrayList();

    public void addAStudent() {

        //get input from user to initialize instance variable through Constructor
        String id;
        String name;
        int yob;
        double gpa;
        // Variable to check id had existed before
        int pos;
        //loop Arraylist to check exist of id before
        //if Exist let user input again
        do {
            //using Regular Expression to check format for ID
            id = MyToys.getID("ID(SXXXXX): ",
                    "The format of id id SXXXXX (X stand for digit) ",
                    "^[S|s]\\S{5}$");
            pos = searchByID(id);
            if (pos >= 0) {
                System.out.println("Student already exist"
                        + " Input another one");
            }
        } while (pos != -1);

        name = MyToys.getAString("NAME: ", "Name is required! Please"
                + "fill your name before next");
        yob = MyToys.getAnInteger("YOB: ", "Year Of Birth must better"
                + "than 0!! please fill again ", 1, 3000);
        gpa = MyToys.getAnDouble("GPA: ", "GPA must be in range of 0 to 10  ", 0, 10);
        System.out.println("-------------------------------------------");

        listStudent.add(new Student(id, name, yob, gpa));
        System.out.println("Add Student successfully!!!");

    }

    public void searchByID() {
        String id;
        Student x;
        System.out.println("-------------------------------------------");

        if (listStudent.isEmpty()) {
            System.out.println("Cabinet is empty");
            return;
        }

        id = MyToys.getID("ID(SXXXXX): ",
                "The format of id id SXXXXX (X stand for digit) ",
                "^[S|s]\\S{5}$");
        x = searchObjectByID(id);
        System.out.println("-------------------------------------------");

        if (x == null) {
            System.out.println("Not Found!!!");
        } else {
            System.out.println("Here is the Student that you want to search ");
            String header = String.format("|%-8s|%-25s|%-4s|%-4s|\n",
                    "ID", "Name", "Yob", "Gpa");
            System.out.println(header);
            x.showwProfile();
        }

    }

    //Helper function help to find position of student object in Arraylist
    //return integer represent for position of student in ArrayList
    //-1 mean not found 
    // > 0 is the position of Student in ArrayList 
    private int searchByID(String studentID) {

        //Check list if empty return -1 quickly (if empty mean not data for searching)  
        if (listStudent.isEmpty()) {
            return -1;
        }
        //Loop ArrayList if id in list equal with id from user input 
        //will return position of student in ArrayList
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId().equalsIgnoreCase(studentID)) {
                return i;
            }
        }
        // loop to the end of Arraylist not found anything id that equals so return -1 
        return -1;
    }

    //Method that return an object which have same id with user input
    private Student searchObjectByID(String studentID) {
        if (listStudent.isEmpty()) {
            return null;
        }
        for (Student student : listStudent) {
            if (student.getId().equalsIgnoreCase(studentID)) {
                return student;
            }
        }
        return null;
    }

    public void removeStudent() {
        String id;
        String check;
        Student x;

        System.out.println("-------------------------------------------");

        if (listStudent.isEmpty()) {
            System.out.println("Cabinet is empty");
            return;
        }

        id = MyToys.getID("ID(SXXXXX): ",
                "The format of id id SXXXXX (X stand for digit) ",
                "^[S|s]\\S{5}$");
        x = searchObjectByID(id);
        if (x == null) {
            System.out.println("-------------------------------------------");
            System.out.println("Not Found");
            return;
        }
        System.out.println("-------------------------------------------");
        System.out.println("Here is profile of id that you input");
        String header = String.format("|%-8s|%-25s|%-4s|%-4s|\n",
                "ID", "Name", "Yob", "Gpa");
        System.out.println(header);
        x.showwProfile();
        System.out.println("-------------------------------------------");
        check = MyToys.getAString("Are you sure to remove(Y/N): ",
                "Confirm must be required");
        if (check.equalsIgnoreCase("Y")) {
            listStudent.remove(x);
        } else {
            return;
        }
        System.out.println("-------------------------------------------");
        System.out.println("Remove successfully");
    }

    public void updateNameOfStudent() {
        String id;
        String tmpName;
        Student x;
        String check;

        System.out.println("-------------------------------------------");

        if (listStudent.isEmpty()) {
            System.out.println("Cabinet is empty");
            return;
        }

        id = MyToys.getID("ID(SXXXXX): ",
                "The format of id id SXXXXX (X stand for digit) ",
                "^[S|s]\\S{5}$");
        x = searchObjectByID(id);
        System.out.println("-------------------------------------------");
        if (x == null) {
            System.out.println("Not found");
            return;
        }
        System.out.println("Here profile of Id that you input");
        String header = String.format("|%-8s|%-25s|%-4s|%-4s|\n",
                "ID", "Name", "Yob", "Gpa");
        System.out.println(header);
        x.showwProfile();
        System.out.println("-------------------------------------------");
        check = MyToys.getAString("Are you sure to update name of Student(Y/N): ",
                "Confirm must be required");
        if (check.equalsIgnoreCase("Y")) {
            tmpName = MyToys.getAString("Name you want to update: ", "this fill must be required");
            x.setName(tmpName);

        } else {
            return;
        }
        System.out.println("-------------------------------------------");
        System.out.println("Update Successfully");
    }

    public void updateYobOfStudent() {
        String id;
        int tmpYob;
        Student x;
        String check;
        System.out.println("-------------------------------------------");

        if (listStudent.isEmpty()) {
            System.out.println("Cabinet is empty");
            return;
        }

        id = MyToys.getID("ID(SXXXXX): ",
                "The format of id id SXXXXX (X stand for digit) ",
                "^[S|s]\\S{5}$");
        x = searchObjectByID(id);
        System.out.println("-------------------------------------------");
        if (x == null) {
            System.out.println("Not found");
            return;
        }
        System.out.println("Here profile of Id that you input");
        String header = String.format("|%-8s|%-25s|%-4s|%-4s|\n",
                "ID", "Name", "Yob", "Gpa");
        System.out.println(header);
        x.showwProfile();
        System.out.println("-------------------------------------------");
        check = MyToys.getAString("Are you sure to update name of Student(Y/N): ",
                "Confirm must be required");
        if (check.equalsIgnoreCase("Y")) {
            tmpYob = MyToys.getAnInteger("Yob you want to update (Yob > 0): ",
                    "fill must be required", 1, 3000);
            x.setYob(tmpYob);

        } else {
            return;
        }
        System.out.println("-------------------------------------------");
        System.out.println("Update Successfully");
    }

    public void updateGpaOfStudent() {
        String id;
        double tmpGpa;
        Student x;
        String check;
        System.out.println("-------------------------------------------");

        if (listStudent.isEmpty()) {
            System.out.println("Cabinet is empty");
            return;
        }

        id = MyToys.getID("ID(SXXXXX): ",
                "The format of id id SXXXXX (X stand for digit) ",
                "^[S|s]\\S{5}$");
        x = searchObjectByID(id);
        System.out.println("-------------------------------------------");
        if (x == null) {
            System.out.println("Not found");
            return;
        }
        System.out.println("Here profile of Id that you input");
        String header = String.format("|%-8s|%-25s|%-4s|%-4s|\n",
                "ID", "Name", "Yob", "Gpa");
        System.out.println(header);
        x.showwProfile();
        System.out.println("-------------------------------------------");
        check = MyToys.getAString("Are you sure to update name of Student(Y/N): ",
                "Confirm must be required");
        if (check.equalsIgnoreCase("Y")) {
            tmpGpa = MyToys.getAnDouble("Gpa you want to update (0 <= GPA <= 10): ",
                    "fill must be required", 0, 10);
            x.setGpa(tmpGpa);

        } else {
            return;
        }
        System.out.println("-------------------------------------------");
        System.out.println("Update Successfully");
    }

    //show all information of those Student inputted
    public void showProfile() {
        System.out.println("-------------------------------------------");
        if (listStudent.isEmpty()) {
            System.out.println("Cabinet is Empty, Don't have anything to show");
            return;
        }
        String header = String.format("|%-8s|%-25s|%-4s|%-4s|\n",
                "ID", "Name", "Yob", "Gpa");
        listStudent.forEach((student) -> {
            student.showwProfile();
        });
        System.out.println("-------------------------------------------");
    }

    public void showProfileInAscendingOfID() {
        System.out.println("-------------------------------------------");
        if (listStudent.isEmpty()) {
            System.out.println("Cabinet is Empty, Don't have anything to show");
            return;
        }
        Collections.sort(listStudent);
        System.out.println("Here is the list of Student");
        String header = String.format("|%-8s|%-25s|%-4s|%-4s|\n",
                "ID", "Name", "Yob", "Gpa");
        for (int i = 0; i < listStudent.size(); i++) {
            listStudent.get(i).showwProfile();
        }
    }

    public void showProfileInAscendingOfName() {
        System.out.println("-------------------------------------------");
        if (listStudent.isEmpty()) {
            System.out.println("Cabinet is Empty, Don't have anything to show");
            return;
        }
        Comparator c = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareToIgnoreCase(s2.getName());
            }
        };
        Collections.sort(listStudent);
        System.out.println("-------------------------------------------");
        System.out.println("Here is the list of Student ");
        String header = String.format("|%-8s|%-25s|%-4s|%-4s|\n",
                "ID", "Name", "Yob", "Gpa");
        for (int i = 0; i < listStudent.size(); i++) {
            listStudent.get(i).showwProfile();
        }
    }

    public void showProfileInAscendingOfGpa() {
        if (listStudent.isEmpty()) {
            System.out.println("Cabinet is Empty, nothing to show");
            return;
        }
        Collections.sort(listStudent, Comparator.comparingDouble(Student::getGpa));
        System.out.println("-------------------------------------------");
        System.out.println("Here is the list of Student after Sorting base on Gpa:  ");
        String header = String.format("|%-8s|%-25s|%-4s|%-4s|\n",
                "ID", "Name", "Yob", "Gpa");
        System.out.println(header);
        for (int i = 0; i < listStudent.size(); i++) {
            listStudent.get(i).showwProfile();
        }

    }
}
