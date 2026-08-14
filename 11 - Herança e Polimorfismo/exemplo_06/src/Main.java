import entities.Employee;
import entities.OutsourcedEmployee;

void main() {

    Scanner sc  = new Scanner(System.in);
    List<Employee> employees = new ArrayList<>();

    IO.print("Enter the number of employees: ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        IO.println("Employee #" + (i + 1) + " data: ");
        IO.print("Outsourced (y/n)? ");
        sc.nextLine();
        char choice = sc.nextLine().charAt(0);
        IO.print("Name: ");
        String name = sc.nextLine();
        IO.print("Hours: ");
        int hours = sc.nextInt();
        IO.print("Value per hour: ");
        double valuePerHour = sc.nextDouble();
        if (choice == 'y') {
            IO.print("Additional charge: ");
            double additionalCharge = sc.nextDouble();
            Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
            employees.add(employee);
        } else {
            Employee employee = new Employee(name, hours, valuePerHour);
            employees.add(employee);
        }
    }

    IO.println();
    IO.println("PAYMENTS: ");
    for  (Employee employee : employees) {
        IO.println(employee);
    }

    sc.close();

}
