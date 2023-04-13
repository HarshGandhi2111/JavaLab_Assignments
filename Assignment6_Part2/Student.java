package Exam;

public class Student implements Result
{
    private String name;
    private String rollNo;
    private String branch;

    private String subject[] = new String[5];
    private double marks[] = new double[5];
    public Student(String name, String rollNo, String branch, String subject[], double marks[]) 
    {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
        this.subject = subject;
        this.marks = marks;
    }

    public void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
        for(int i = 0; i<5; i++)
        {
            System.out.println(subject[i]+": "+marks[i]);
        }
    }

    public double calculatePercentage()
    {
        double sum = 0;
        for(int j =0; j<5; j++)
        {
            sum = sum + marks[j];
        }
        return ((sum)* 0.002) * 100;
    }

}
