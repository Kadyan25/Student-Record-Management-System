package com.example;

// StudentRecordManagement.java
import java.util.Scanner;

public class StudentRecordManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Student Record Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter option (1-5): ");

            int option = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Student Marks: ");
                    double marks = sc.nextDouble();
                    sc.nextLine();
                    manager.addStudent(new Student(id, name, marks));
                    break;
                case 2:
                    manager.viewStudents();
                    break;
                case 3:
                    System.out.print("Enter Student ID to update: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new name: ");
                    name = sc.nextLine();
                    System.out.print("Enter new marks: ");
                    marks = sc.nextDouble();
                    sc.nextLine();
                    manager.updateStudent(id, name, marks);
                    break;
                case 4:
                    System.out.print("Enter Student ID to delete: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    manager.deleteStudent(id);
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting Student Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option, please select 1-5.");
            }
        }
        sc.close();
    }
}
