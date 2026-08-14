import entities.Employee;

void main() {

    Employee employee = new Employee();
    Scanner sc = new Scanner(System.in);

    System.out.print("Name: ");
    employee.name = sc.nextLine();
    System.out.print("Gross salary: ");
    employee.grossSalary = sc.nextDouble();
    System.out.print("Tax: ");
    employee.tax = sc.nextDouble();
    System.out.println();
    System.out.println("Employee: " + employee);
    System.out.println();
    System.out.print("Which percentage to increase salary? ");
    employee.increaseSalary(sc.nextDouble());
    System.out.println();
    System.out.println("Updated data: " + employee);

    sc.close();

}