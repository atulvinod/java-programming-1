package test;

import java.util.LinkedList;
import java.util.Scanner;



public class assignment1_3  {

  static  class Employee{
        int empId, empSalary;
        String empName, empDesignation, empLocation;

        public int getEmpId() {
            return empId;
        }

        public void setEmpId(int empId) {
            this.empId = empId;
        }

        public int getEmpSalary() {
            return empSalary;
        }

        public void setEmpSalary(int empSalary) {
            this.empSalary = empSalary;
        }

        public String getEmpName() {
            return empName;
        }

        public void setEmpName(String empName) {
            this.empName = empName;
        }

        public String getEmpDesignation() {
            return empDesignation;
        }

        public void setEmpDesignation(String empDesignation) {
            this.empDesignation = empDesignation;
        }

        public String getEmpLocation() {
            return empLocation;
        }

        public void setEmpLocation(String empLocation) {
            this.empLocation = empLocation;
        }
    }

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        LinkedList<Employee> list = new LinkedList<>();
        System.out.println("Enter id, name, designation, location and salary below");
        for(int i = 0 ; i < 10 ; i++){
            System.out.println(String.format("Employee No : %i", i+1));
            Employee newEmp = new Employee();
            newEmp.setEmpId(scan.nextInt());
            newEmp.setEmpName(scan.nextLine());
            newEmp.setEmpDesignation(scan.nextLine());
            newEmp.setEmpLocation(scan.nextLine());
            newEmp.setEmpSalary(scan.nextInt());
            System.out.println("---------------------------");
        }
        System.out.println("All names of employees");
        list.stream().forEach(e->{
            System.out.println(e.getEmpName());
        });
        System.out.println("\n All salaries greater than 50,000/-");
        list.stream().filter(e->e.getEmpSalary()>50000).forEach(e->{
            System.out.println(String.format("Name : %s , Salary : %i",e.getEmpName(),e.getEmpSalary()));
        });
        System.out.println("\n All locations starting with letter \'M\'");
        list.stream().filter(e->e.getEmpLocation().startsWith("M")).forEach(e->{
            System.out.println(String.format("Name : %s , Location : %s",e.getEmpName(),e.getEmpLocation()));

        });
        System.out.println("\n All designations stating with \'E\'");
        list.stream().filter(e->e.getEmpDesignation().endsWith("E")).forEach(e->{
            System.out.println(String.format("Name : %s , Designation : %s",e.getEmpName(),e.getEmpDesignation()));

        });
    }

}
