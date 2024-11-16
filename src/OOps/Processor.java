package OOps;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList studentList = new StudentList();
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add students");
            System.out.println("2. Display all students");
            System.out.println("3. Find student by ID");
            System.out.println("4. Delete student by ID");
            System.out.println("5. Edit student by ID");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    studentList.enterAllStudents();
                    break;
                case 2:
                    studentList.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Enter student Id to find: ");
                    String idToFind = sc.nextLine();
                    Student student = studentList.findStudentById(idToFind);
                    if (student != null) {
                        student.displayStudentInfor();
                    } else {
                        System.out.print("Student not found");
                    }
                    break;
                case 4:
                    System.out.print("Enter student Id to delete: ");
                    String idToDelete = sc.nextLine();
                    if (studentList.deleteStudentById(idToDelete)) {
                        System.out.print("Student deleted.");
                    } else {
                        System.out.print("Student not found");
                    }
                    break;
                case 5:
                    System.out.print("Enetr student Id to edit: ");
                    String idToEdit = sc.nextLine();
                    if (studentList.editStudentById(idToEdit)) {
                        System.out.print("Student update successfully.");
                    } else {
                        System.out.print("Student not found.");
                    }
                    break;
                case 0:
                    System.out.print("Exiting....");
                    break;
                default:
                    System.out.print("Invalid option. Please try again.");
            }
        }
    }
}
