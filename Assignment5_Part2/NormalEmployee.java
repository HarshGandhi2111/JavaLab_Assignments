package Assignment5_Part2;

import java.util.Scanner;

public class NormalEmployee extends Employee 
{
    Scanner sc = new Scanner(System.in);
    public double bs,ma, hra, pf, esi, ca, others, pt = 0, lr = 0; 
    public NormalEmployee(String name, String designation, String dept, String EmployeeID, String UAN, String PFno, String ESIno, String BankN, String BankAcno, int wd, int lops, double basicSalary)
    {
       super(name, designation, dept, EmployeeID, UAN, PFno, ESIno, BankN, BankAcno, wd, lops, basicSalary);
     
    }
    public double getMonthlySalary()
    {
        return getBasicSalary();
    }
    public String toString()
    {
    double totalearnings;
    double totaldeductions;
       bs = ((super.getBasicSalary()/super.getWd()) * (super.getWd() - super.getLops()))*(0.45);
       hra = bs *(0.40);
       ma = (1250/super.getWd())*(super.getWd() - super.getLops());
       ca = (1600/super.getWd())*(super.getWd() - super.getLops());
       others = ((super.getBasicSalary()/super.getWd()) * (super.getWd() - super.getLops()))-(hra+ma+ca+bs);
       totalearnings = (bs+hra+ma+ca+others);
       if (bs>=15000)
       {
           pf = 15000*(12/100);
       }
       else
       {
           pf = bs*(15/100);
       }
       if(super.getBasicSalary()<=21000)
       {
           esi = totalearnings *(0.75/100);
       }
       else
       {
           esi = 0;
       }
       totaldeductions = (pf+esi+pt+lr);  
    return " * * * * * * * * * * * * * * * * * * * * *"+ "\n" + 
             " Name: "+super.getName()+"\n"+
                " Employee ID: "+super.getEmployeeID()+"\n"+
                " Department: "+super.getDept()+"\n"+
                " Designation: "+super.getDesignation()+"\n"+
                " UAN: "+super.getUAN()+"\n"+
                " PF No: "+super.getPFno()+"\n"+
                " ESI No: "+super.getESIno()+"\n"+
                " Bank Name: "+super.getBankN()+"\n"+
                " Bank Account No: "+super.getBankAcno()+"\n"+
                " Working Days: "+super.getWd()+"\n"+
                " Leaves on Pay: "+super.getLops()+"\n"+
                " Leaves without Pay: "+(super.getWd() - super.getLops()) +"\n"+"\n"+"\n"+
                " Basic Wage: "+ bs + "\n"+
                " Housing Rent Allowance: "+ hra + "\n"+
                " Medical Allowance: "+ ma +"\n"+
                " Conveyance Allowance: "+ ca +"\n"+
                " Other allowances: "+ others +"\n"+
                " Total Earnings: "+ totalearnings +"\n"+"\n"+"\n"+
                " Provident Fund: "+ pf +"\n"+
                " ESI: "+ esi +"\n"+
                " Professional Tax: "+ pt +"\n"+
                " Loan Recovery: "+ lr +"\n"+
                " Total Deductions: "+ totaldeductions +"\n"+"\n"+"\n"+ 
                "\n" + " * * * * * * * * * * * * * * * * * * * * *" + "\n";
    }
}
