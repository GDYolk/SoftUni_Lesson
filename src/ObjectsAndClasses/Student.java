package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Student {
    private String firstname;
    private String lastname;
    private int age;
    private String hometown;

    public Student(String firstname, String lastname, int age, String hometown) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.hometown = hometown;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentsList = new ArrayList<>();

        while (true) {
            String[] input = scanner.nextLine().split(" ");

            if (Objects.deepEquals(input[0], "end")) {
                break;
            }

            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt((input[2]));
            String hometown = input[3];

            //if (isStudentExisting(studentsList, firstName, lastName)) {
            Student student = studentsList.stream()
                    .filter(s -> s.getFirstname().equals(firstName) && s.getLastname().equals(lastName))
                    .findFirst()
                    .orElse(null);

            if (student == null) {
                Student studentToAdd = new Student(firstName, lastName, age, hometown);
                studentsList.add(studentToAdd);
            } else {
                student.setFirstname(firstName);
                student.setLastname(lastName);
                student.setAge(age);
                student.setHometown(hometown);
            }
            // }
        }
        String hometown = scanner.nextLine();
        studentsList.forEach((student) -> {
            if (student.getHometown().equals(hometown)) {
                System.out.printf("%s %s is %d years old%n",
                        student.getFirstname(),
                        student.getLastname(),
                        student.getAge());
            }
        });
    }
}
/* private static  boolean isStudentExisting(List<Student> studentsList, String firstname, String lastname) {
        for (Student student : studentsList) {
            if (student.getFirstname().equals(firstname) &&
                    student.getLastname().equals(lastname)) {
                return true;
            }
        }
        return false;
    }
// function work call use func
/*
                Student = getStudent(studentsList, firstName, lastName);

                student.setFirstname(firstName);
                student.setLastname(lastName);
                student.setAge(age);
                student.setHometown(hometown);
*/
// This is function old version
/*
 private static Student getStudent(List<Student> studentsList, String firstname, String lastname) {
        Student existingStudent = null;

        for (Student student : studentsList) {
            if (student.getFirstname().equals(firstname) &&
                    student.getLastname().equals(lastname)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }*/