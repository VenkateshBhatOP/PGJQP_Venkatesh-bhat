package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
 
public class TreeMapSort {
 
    public static void main(String a[]){
      
        TreeMap<Employee,String> a1 = new TreeMap<Employee, String>(new SortByName());
        a1.put(new Employee("Venkatesh",30000), "VENKATESH");
        a1.put(new Employee("Sumit",16200), "SUMIT");
        a1.put(new Employee("Rajath",23000), "RAJATH");
        a1.put(new Employee("Prajwal",12400), "PRAJWAL");
        Set<Employee> keys = a1.keySet();
        for(Employee key:keys){
            System.out.println(key+" --> "+a1.get(key));
        }
        System.out.println("========================================");
        
        TreeMap<Employee,String> b = new TreeMap<Employee, String>(new SortBySalary());
        b.put(new Employee("Venkatesh",30000), "VENKATESH");
        b.put(new Employee("Sumit",16200), "SUMIT");
        b.put(new Employee("Rajath",23000), "RAJATH");
        b.put(new Employee("Prajwal",12400), "PRAJWAL");
        Set<Employee> ks = b.keySet();
        for(Employee key:ks){
            System.out.println(key+" --> "+a1.get(key));
        }
    }
}
 
class SortByName implements Comparator<Employee>{
 
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}
 
class SortBySalary implements Comparator<Employee>{
 
    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getSalary() > e2.getSalary()){
            return 1;
        } else {
            return -1;
        }
    }
}
 
class Employee{
     
    private String name;
    private int salary;
     
    public Employee(String n, int s){
        this.name = n;
        this.salary = s;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+this.name+"-- Salary: "+this.salary;
    }
}

