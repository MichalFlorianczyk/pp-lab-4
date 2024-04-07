import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        
        Employee[] employees = {
                new Manager("Jan Kowalski", 5000.0), // indeks 0
                new Worker("Anna Nowak", 3200.0, "Księgowa"),
                new Employee("Zbigniew Twardowski", 3500.0),
                new Employee("Karolina Kania", 4000.0),
                new Worker("Michał Pazdan", 4500.0, "HR")
        };

        
        int nonManagersCount = 0;
        for (Employee e : employees) {
            if (!(e instanceof Manager)) {
                nonManagersCount++;
            }
        }

        
        if (employees[0] instanceof Manager) {
            ((Manager) employees[0]).setNumberOfSubordinates(nonManagersCount);
            employees[0].setSalary(7500.0);
        }

        
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
