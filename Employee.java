
import java.util.Collections;
import java.util.*;
import java.util.Comparator;
import java.util.Collections.*;

public class Employee implements Comparable<Employee> {
    private double age;
    private double salary;
    private String firstName;
    private String lastName;

    public Employee(double age, double salary, String firstName,
                    String lastName) {

        this.age = age;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        return this.getFirstName().compareTo(o.getFirstName() + " "+ this.getLastName().compareTo(o.getLastName()));
    }



    public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return (int) (e2.getSalary() - e1.getSalary());
        }
    };

}


    class Main {
        public static void main(String[] args) {

            List<Employee> list = new ArrayList<>();
            list.add(new Employee(22, 20000, "Muskan", "lama"));
            list.add(new Employee(23, 23300, "Sofi", "Gurung"));
            list.add(new Employee(22, 20000, "Kritika", "Shahi"));
            Iterator<Employee> it = list.iterator();

            System.out.println("Before sorting :");
            while (it.hasNext()) {
                System.out.println(it.next());

            }
            Collections.sort(list);
            System.out.println("\nsorting on the firstName basis: & lastName basis  ");
            it = list.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());


            }

            Collections.sort(list, Employee.salaryComparator);
            System.out.println("\nsorting on the basis of salary: ");
            it = list.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }




        }

}