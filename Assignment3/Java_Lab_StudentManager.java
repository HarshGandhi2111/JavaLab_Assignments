import java.util.ArrayList;
import java.util.Scanner;


public class Java_Lab_StudentManager  {
    
    ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        
        Java_Lab_StudentManager sm = new Java_Lab_StudentManager();
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add a student");
            System.out.println("2. Display all students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by name");
            System.out.println("5. Search by position");
            System.out.println("6. Update a student");
            System.out.println("7. Delete a student");
            System.out.println("8. Exit");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    sm.addStudent();
                    break;
                case 2:
                    sm.displayAllStudents();
                    break;
                case 3:
                    sm.searchByPrn();
                    break;
                case 4:
                    sm.searchByName();
                    break;
                case 5:
                    sm.searchByPosition();
                    break;
                case 6:
                    sm.updateStudent();
                    break;
                case 7:
                    sm.deleteStudent();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }



class Student
 {
    int prn;
    String name;
    String dob;
    float marks;

    // Constructor to initialize student object
    public Student(int prn, String name, String dob, float marks) 
    {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    // Method to display student details
    public void display() {
        System.out.println("PRN: " + prn);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Marks: " + marks);
    }
}


    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PRN:");
        int prn = sc.nextInt();
        System.out.println("Enter name:");
        String name = sc.next();
        System.out.println("Enter date of birth (DD/MM/YYYY):");
        String dob = sc.next();
        System.out.println("Enter marks:");
        float marks = sc.nextFloat();
        Student s = new Student(prn, name, dob, marks);
        students.add(s);
        System.out.println("Student added successfully.");
    }

    public void displayAllStudents() {
        if (students.size() == 0) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                s.display();
                System.out.println("------------");
            }
        }
    }

    public void searchByPrn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PRN:");
        int prn = sc.nextInt();
        boolean found = false;
        for (Student s : students) {
            if (s.prn == prn) {
                s.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public void searchByName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.next();
        boolean found = false;
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(name)) {
                s.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching students found.");
        }
    }

    public void searchByPosition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position:");
        int pos = sc.nextInt() - 1;
        if (pos < 0 || pos >= students.size()) {
            System.out.println("Invalid position.");
        } else {
            students.get(pos).display();
        }
    }

    public void updateStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PRN of student to update:");
        int prn = sc.nextInt();
        boolean found = false;
        for (Student s : students) {
            if (s.prn == prn) {
                System.out.println("Enter new name:");
                s.name = sc.next();
                System.out.println("Enter new date of birth (DD/MM/YYYY):");
                s.dob = sc.next();
                System.out.println("Enter new marks:");
                s.marks = sc.nextFloat();
                found = true;
                System.out.println("Student details updated successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PRN of student to delete:");
        int prn = sc.nextInt();
        boolean found = false;
        for (Student s : students) {
            if (s.prn == prn) {
                students.remove(s);
                found = true;
                System.out.println("Student deleted successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }
}
