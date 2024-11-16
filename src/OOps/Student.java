
package OOps;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
    private String studentId;
    private String fullName;
    private Date dateOfBirth;
    private String major;
    private float gpa;
    Student(){
    }
    void enterStudentInfor()throws ParseException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's ID: ");
        this.studentId = sc.nextLine();
        System.out.println("Enter student's name: ");
        this.fullName = sc.nextLine();
        System.out.println("Enter student's date of birth: ");
        String dob = sc.nextLine();    
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.dateOfBirth = sdf.parse(dob);
        System.out.println("Enter student's major: ");
        this.major = sc.nextLine();
        System.out.println("Enter student's gpa: ");
        this.gpa = sc.nextFloat();
    }
    void displayStudentInfor(){
        System.out.println("Id: " +studentId);
        System.out.println("Full name: " +fullName);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date of birth: " + sdf.format(dateOfBirth));
        System.out.println("Major: " +major);
        System.out.println("GPA: " +gpa);
    }
    public String getStudentId(){
        return studentId;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String n){
        this.fullName = n;
    }
    public void setDateOfBirth(Date d){
        this.dateOfBirth = d;
    }
    public void setMajor(String m){
        this.major = m;
    }
    public void setGpa(float g){
        this.gpa = g;
    }
}
