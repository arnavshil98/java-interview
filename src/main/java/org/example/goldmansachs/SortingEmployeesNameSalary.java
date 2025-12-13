package org.example.goldmansachs;

import java.util.*;

class Employee implements Comparable<Employee> {
    String name;
    Integer salary;

    public Employee(String name, Integer salary){
        this.name = name;
        this.salary = salary;
    }
    // comparing by salary then name desc
    @Override
    public int compareTo(Employee o1) {
        if(o1.salary<this.salary){
            return -1;
        } else if (o1.salary>this.salary) {
            return 1;
        }else{
            return  o1.name.compareTo(this.name);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class SortingEmployeesNameSalary {



    public static void main(String[] args) {
        Employee e1 = new Employee("John",25000);
        Employee e2 = new Employee("Peter",28000);
        Employee e3 = new Employee("Henry",28000);
        Employee e4 = new Employee("David",23000);
        Employee e5 = new Employee("Parker",24000);
        Employee e6 = new Employee("Alen",25000);

        List<Employee> list = new ArrayList<>(List.of(e1,e2,e3,e4,e5,e6));

        Collections.sort(list);

        for (Employee e: list
             ) {
            System.out.println(e.toString());
        }
    }
}
