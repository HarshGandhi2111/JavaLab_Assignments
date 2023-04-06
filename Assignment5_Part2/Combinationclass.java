package Assignment5_Part2;
import java.util.Scanner;

public class Combinationclass 
{
 public static void main(String[] args)
 {
    String name, designation, dept, EmployeeID, UAN, PFno, ESIno, BankN, BankAcno;
    double monthlySalary;
    int wd, lops;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the name of the employee: ");
    name = sc.nextLine();

    System.out.println("Enter the designation of the employee: ");
    designation = sc.nextLine();
    
    System.out.println("Enter the department of the employee: ");
    dept = sc.nextLine();
    
    System.out.println("Enter the ID of the employee: ");
    EmployeeID = sc.nextLine();

    System.out.println("Enter the Universal Account Number of the employee: ");
    UAN = sc.nextLine();

    System.out.println("Enter the privident fund number of the employee: ");
    PFno = sc.nextLine();

    System.out.println("Enter the health insurance number of the employee: ");
    ESIno = sc.nextLine();

    System.out.println("Enter the Bank Name of the recepient: ");
    BankN = sc.nextLine();

    System.out.println("Enter the bank account number of the recepient: ");
    BankAcno = sc.nextLine();

    System.out.println("Enter the number of working days: ");
    wd = sc.nextInt();

    System.out.println("Enter the leaves: ");
    lops = sc.nextInt();

    System.out.println("Enter the gross wage of the employee: ");
    monthlySalary = sc.nextDouble();
    
   NormalEmployee ne = new NormalEmployee(name, designation, dept, EmployeeID, UAN, PFno, ESIno, BankN, BankAcno, wd, lops, monthlySalary);
   System.out.println(ne);
   
   BonusEmployee be = new BonusEmployee(name, designation, dept, EmployeeID, UAN, PFno, ESIno, BankN, BankAcno, wd, lops,monthlySalary);
   System.out.println(be);
 }   
}

