package JavaOOP_SuperKeyword;

public class Employee extends Person{

    int salary;

    Employee(String firstName, String lastName, int salary){
        super(firstName, lastName);
        this.salary = salary;
    }

    void showSalary(){
        System.out.println(this.firstName + " " + this.lastName + " has a salary of $" + this.salary);
    }

}
