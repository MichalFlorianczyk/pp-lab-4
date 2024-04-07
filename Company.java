public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Jan Kowalski", 3000.0);
        employees[1] = new Employee("Anna Nowak", 3200.0);
        employees[2] = nw Employee("Zbigniew Twardowski", 3500.0);
        employees[3] = new Employee("Karolina Kania", 4000.0);
        employees[4] = new Employee("Michał Pazdan", 4500.0);

        System.out.println("Pracownik o indeksie 3: " + employees[3]);

        employees[3].setSalary(5000.0);
        System.out.println("Zaktualizowane dane pracownika o indeksie 3: " + employees[3]);

        System.out.println("Wszyscy pracownicy:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
