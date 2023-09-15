package ObjectsAndClasses.Exercise;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Students {
    private String firstname;
    private String lastname;
    private double grade;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String toString(Students s) {
        return s.getFirstname() +" "+s.getLastname() +": " + new DecimalFormat("0.00").format(s.getGrade());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Students>  studentsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] student = scanner.nextLine().split(" ");

            Students students = new Students();
            students.setFirstname(student[0]);
            students.setLastname(student[1]);
            students.setGrade(Double.parseDouble(student[2]));

            studentsList.add(students);
        }
        scanner.close();
        for (int i = 0; i < studentsList.size()-1; i++) {
            if (studentsList.get(i).getGrade() < studentsList.get(i+1).getGrade()) {
                Collections.swap(studentsList, i, i+1);
                i = -1;
            }
        }
        studentsList.forEach(s -> System.out.printf("%s%n", new Students().toString(s)));
    }
}
