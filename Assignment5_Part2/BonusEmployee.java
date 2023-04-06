package Assignment5_Part2;

public class BonusEmployee extends Employee 
{
    public double bs,ma, hra, da, ta, pf, esi, ca, others, pt = 0, lr = 0, bonus; 

    public BonusEmployee(String name, String designation, String dept, String EmployeeID, String UAN, String PFno, String ESIno, String BankN, String BankAcno, int wd, int lops,double basicSalary)
    {
       super(name, designation, dept, EmployeeID, UAN, PFno, ESIno, BankN, BankAcno, wd, lops, basicSalary);
     
    }
    public double getMonthlySalary()
    {
        if ((super.getBasicSalary()) < 7000)
        {
            bonus = (super.getBasicSalary()) * 8.33/100;
        }
        else if ((super.getBasicSalary()) >= 7000 && (super.getBasicSalary())<50000)
        {
            bonus = (super.getBasicSalary()) * 10/100;
        }
        if ((super.getBasicSalary()) >= 50000 && (super.getBasicSalary())<125000)
        {
            bonus = (super.getBasicSalary()) * 15/100;
        }
        if ((super.getBasicSalary()) >= 125000)
        {
            bonus = (super.getBasicSalary()) * 20/100;
        }
        System.out.println("You are eligible to have a bonus of " + bonus);
        System.out.println("\n");
        return (super.getBasicSalary() + bonus);
     }
    public String toString()
    {
        double totalearnings;
        double totaldeductions;
        bs = (super.getBasicSalary()/super.getWd())* (super.getWd() - super.getLops())*(0.45);
        hra = bs *(0.40/100);
        ma = (1250/super.getWd())*(super.getWd() - super.getLops());
        ca = (1600/super.getWd())*(super.getWd() - super.getLops());
        others = ((super.getBasicSalary()/super.getWd()) * (super.getWd() - super.getLops()))-(hra+ma+ca+bs);
        totalearnings = (bs+hra+ma+ca+others);
       if (bs>=15000)
       {
           pf = 15000*(0.12);
       }
       else
       {
           pf = bs*(0.15);
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
                " Name: "+ super.getName()+
                "\n"+" Designation: "+ super.getDesignation()+"\n"+
                " Department: "+ super.getDept()+"\n"+
                " Employee ID: "+ super.getEmployeeID()+"\n"+
                " UAN: "+ super.getUAN()+"\n"+
                " PF No: "+ super.getPFno()+"\n"+
                " ESI No: "+ super.getESIno()+"\n"+
                " Bank Name: "+ super.getBankN()+"\n"+
                " Bank Account No: "+ super.getBankAcno()+"\n"+
                " Working Days: "+ super.getWd()+"\n"+
                " Leaves on Pay: "+ super.getLops()+"\n"+
                " Leaves without Pay: "+ (super.getWd() - super.getLops()) +"\n"+"\n"+"\n"+
                "Basic Wage: "+ bs+ "\n"+
                "Housing Rent Allowance: "+ hra+"\n"+
                "Medical Allowance: "+ ma+"\n"+
                "Conveyance Allowance: "+ ca+"\n"+
                "Other allowances: "+ others+"\n"+
                "Total Earnings:"+ totalearnings+"\n"+" \n"+"\n"+
                "Provident Fund: "+ pf+"\n"+
                "Employee State Insurance: "+ esi+"\n"+
                "Professional Tax: "+ pt+"\n"+
                "Labour Welfare Fund: "+ lr+"\n"+
                "Total Deductions:"+ totaldeductions +"\n"+"\n"+"\n"+
                "\n"+" Monthly Salary including bonus: "+ getMonthlySalary()+
                "\n" + " * * * * * * * * * * * * * * * * * * * * *";
    }
}