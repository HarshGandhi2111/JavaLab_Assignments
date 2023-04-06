package Assignment5_Part2;

public abstract class Employee 
{
        private String name, designation, dept, EmployeeID, UAN, PFno, ESIno, BankN, BankAcno;
        protected double basicSalary;   
        private int wd, lops;
                                                         /*
                                                         UAN: Universal Account Number
                                                         PFno: Provident Fund Number
                                                         ESIno: Health Insurance Number 
                                                         BankN: Bank Name
                                                         BankAcno: Bank Account Number 
                                                         wd: Number of working days 
                                                         lops: Number of leaves on pay
                                                         paids: Number of paid days
                                                         */
        public String getName()
        {
        return name;
        }
        public String getDesignation()
        {
        return designation;
        }
        public String getDept()
        {
        return dept;
        }
        public String getEmployeeID()
        {
        return EmployeeID;
        }
        public String getUAN()
        {
        return UAN;
        }
        public String getPFno()
        {
        return PFno;
        }
        public String getESIno()
        {
        return ESIno;
        }
        public String getBankN()
        {
        return BankN;
        }
        public String getBankAcno()
        {
        return BankAcno;
        }
        public int getWd()
        {
        return wd;
        }
        public int getLops()
        {
        return lops;
        }
        public double getBasicSalary()
        {
        return basicSalary;
        }
        public void setDesignation(String desgn)
        {
        designation = desgn;
        }
        public void setName(String nm)
        {
        name = nm;
        }
        public void setBasicSalary(int sal)
        {
        basicSalary = sal;
        }
        public void setDept(String dpt)
        {
        dept = dpt;
        }
        public void setEmployeeID(String empID)
        {
        EmployeeID = empID;
        }
        public void setUAN(String uan)
        {
        UAN = uan;
        }
        public void setPFno(String pfno)
        {
        PFno = pfno;
        }
        public void setESIno(String esino)
        {
        ESIno = esino;
        }
        public void setBankN(String bankn)
        {
        BankN = bankn;
        }
        public void setBankAcno(String bankacno)
        {
        BankAcno = bankacno;
        }
        public void setWd(int wd)
        {
        this.wd = wd;
        }
        public void setLops(int lops)
        {
        this.lops = lops;
        }
        public Employee(String name, String designation, String dept, String EmployeeID, String UAN, String PFno, String ESIno, String BankN, String BankAcno, int wd, int lops, double basicSalary)
        {
        this.name = name;
        this.designation = designation;
        this.dept = dept;
        this.EmployeeID = EmployeeID;
        this.UAN = UAN;
        this.PFno = PFno;      
        this.ESIno = ESIno;
        this.BankN = BankN;
        this.BankAcno = BankAcno;
        this.wd = wd;
        this.lops = lops;
        this.basicSalary = basicSalary;
        }
        public abstract double getMonthlySalary();
}
