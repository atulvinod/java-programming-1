package test;


import java.util.LinkedList;

class Employee{
    String name, Address;
    int joiningYear;
    public Employee(String name,String Address, int joiningYear){
        this.name = name;
        this.Address = Address;
        this.joiningYear = joiningYear;
    }
    public String toString(){
        String paddedName = this.name+createPadding(10-this.name.length());
        String paddedYear = this.joiningYear+createPadding(15);

        return paddedName+paddedYear+this.Address;
    }
    public String createPadding(int padLength){
        String x = "";
        for(int i = 0 ;i < padLength ; i++){
            x += " ";
        }
        return x;
    }
}


public class assignment1_6 {

    LinkedList<Employee> employees;

    assignment1_6(){
        employees = new LinkedList<>();
        employees.add(new Employee("Robert","64C-WallStreet",1994));
        employees.add(new Employee("Sam","68D-WallStreet",2000));
        employees.add(new Employee("John","26B-WallStreet",1999));
        System.out.println("Name     Year of Joining     Address");
        employees.stream().forEach(e->{
            System.out.println(e);
        });
    }

    public static void main(String[] args) {
        assignment1_6 test = new assignment1_6();
    }
}
