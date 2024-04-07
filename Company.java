public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];
        
        employees[0] = new Manager("Jan Kowalski", 5000);
        employees[1] = new Worker("Anna Nowak", 3200, "Accountant");
        employees[2] = new Employee("Zbigniew Stonoga", 3400);
        employees[3] = new Worker("Karolina Kania", 2950, "IT Specialist");
        employees[4] = new Manager("Michał Pazdan", 4500);
        employees[5] = new Worker("Ewa Złotowska", 3100, "HR Specialist");
        employees[6] = new Employee("Tomasz Michalak", 3300);

        
        for (Employee emp : employees) {
            emp.setSalary(emp.getSalary() + 500);
        }

        
        for (Employee emp : employees) {
            if (emp instanceof Manager) {
                ((Manager)emp).setNumberOfSubordinates(5); // Assuming new value
                emp.setSalary(7500);
            }
        }

        
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
