package Exam;

import java.util.Scanner;

public class Main 
{
     public static void main(String[] args) 
    {
    String name, rollno,branch;
    String subjects[] = new String[5];
    double marks[] = new double[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        name = sc.nextLine();
        System.out.println("Enter the roll number of the student: ");
        rollno = sc.nextLine();
        System.out.println("Enter the branch of the student: ");
        branch = sc.nextLine();
        for(int i = 0; i<5; i++)
        {
            System.out.println("Enter the name of subject "+(i+1)+":");
            subjects[i] = sc.nextLine();
            System.out.println("Enter the marks of subject "+(i+1)+":");
            marks[i] = sc.nextDouble();
            sc.nextLine();
        }
        Student student = new Student(name, rollno, branch, subjects, marks);
        student.display();
        ResultPrinter printer = new ResultPrinter((Result) student);
        printer.show();
    }
}
