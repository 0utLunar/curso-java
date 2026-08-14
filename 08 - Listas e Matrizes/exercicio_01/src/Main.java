import entities.Employee;

void main() {

    Scanner sc = new Scanner(System.in);
    List<Employee> employees = new ArrayList<>();
    System.out.print("How many employees will be registered? ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        System.out.println();
        System.out.println("Employee #" + (i + 1) + ":");
        System.out.print("Id: ");
        int id = sc.nextInt();
        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();
        employees.add(new Employee(id, name, salary));
    }

    System.out.println();
    System.out.print("Enter the employee id that will have salary increase: ");
    int id = sc.nextInt();
    Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    if (emp == null) {
        System.out.println("This id does not exist!");
    }
    else {
        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
    }



    System.out.println();
    System.out.println("List of employees:");
    for (Employee employee : employees) {
        System.out.println(employee);
    }


    sc.close();

}