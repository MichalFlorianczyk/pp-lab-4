import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        // Użyjemy nowych klas Manager i Worker
        employees[0] = new Manager("Jan Kowalski", 5000.0, 5);
        employees[1] = new Worker("Anna Nowak", 3200.0, "Księgowa");
        employees[2] = new Employee("Zbigniew Twardowski", 3500.0);
        employees[3] = new Employee("Karolina Kania", 4000.0);
        employees[4] = new Worker("Michał Pazdan", 4500.0, "HR");

        // Wyświetl informacje o wszystkich pracownikach
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
