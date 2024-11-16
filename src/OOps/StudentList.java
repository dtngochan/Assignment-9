
package OOps;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    private ArrayList<Student> studentList = new ArrayList<>();
    public void enterAllStudents(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
        System.out.println("Enter information of student " + (i + 1) + ": ");
        Student student = new Student();
        try {
            student.enterStudentInfor();  
            studentList.add(student);
        } catch (Exception e) {
            System.out.println("Invalid input for student information. Please try again.");
            i--;  
        }
    }
    }
    public void displayAllStudents(){
        for(Student student : studentList){
            student.displayStudentInfor();
            System.out.println("-------------------------");
        }
    }
    public Student findStudentById(String idToFind){
        for(Student student : studentList){
            if(student.getStudentId().equals(idToFind)){
                return student;
            }
        }
        return null;
    }
    public boolean deleteStudentById(String idToDelete){
        for(Student student : studentList){
            if(student.getStudentId().equals(idToDelete)){
                studentList.remove(student);
                return true;
            }
        }
        return false;
    }
    public boolean editStudentById(String idToEdit){
        Scanner sc = new Scanner(System.in);
        for(Student student: studentList){
            if(student.getStudentId().equals(idToEdit)){
                System.out.println("Editing student: " +student.getFullName());
                System.out.print("Enter new full name (leave blank to keep current): ");
                String newName = sc.nextLine();
                if(!newName.isBlank()){
                    student.setFullName(newName);
                }
                System.out.print("Enter new date of birth (leave blank to keep current): ");
                String newDob = sc.nextLine();
                if(!newDob.isBlank()){
                    try{
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        student.setDateOfBirth(sdf.parse(newDob));
                    }catch(Exception e){
                        System.out.println("Invalid date format. Skipping date of birth update.");
                    }
                }
                System.out.print("Enter new major (leave blank to keep current): ");
                String newMajor = sc.nextLine();
                if(!newMajor.isBlank()){
                    student.setMajor(newMajor);
                }
                System.out.print("Enter new GPA (leave blank to keep current): ");
                String newGpa = sc.nextLine();
                if(!newGpa.isBlank()){
                    try{
                        student.setGpa(Float.parseFloat(newGpa));
                    }catch(NumberFormatException e){
                        System.out.println("Invalid GPA format. Skipping GPA update.");
                    }                       
                }
                
                return true;
            }
            
        }
        
        return false;
    }
}
