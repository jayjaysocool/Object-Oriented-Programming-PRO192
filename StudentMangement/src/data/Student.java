package data;


public class Student implements Comparable<Student> {

    private String id;
    private String name;
    private int yob;
    private double gpa;

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("|%-8s|%-25s|%-4d|%-4.1f|\n", id, name, yob, gpa);
    }

    public void showwProfile() {
        System.out.printf("|%-8s|%-25s|%-4d|%-4.1f|\n", id, name, yob, gpa);

    }

  @Override
    public int compareTo(Student that) {
        return this.id.compareToIgnoreCase(that.id);
    }
}
