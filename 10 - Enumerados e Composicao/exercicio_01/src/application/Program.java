import model.entities.Client;
import model.entities.Order;
import model.entities.OrderItem;
import model.entities.Product;
import model.enums.OrderStatus;

void main() {

    Scanner sc = new Scanner(System.in);

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    IO.println("Enter client data: ");
    IO.print("Name: ");
    String name = sc.nextLine();
    IO.print("Email: ");
    String email = sc.next();
    IO.print("Birth date: (DD/MM/YYYY): ");
    LocalDate birthDate = LocalDate.parse(sc.next(), fmt);

    Client client = new Client(name, email, birthDate);

    IO.println("Enter order data: ");
    IO.print("STATUS: ");
    OrderStatus status = OrderStatus.valueOf(sc.next());

    Order order = new Order(client, LocalDateTime.now(), status);

    IO.print("How many items to this order? ");
    int n = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < n; i++) {
        IO.println("Enter #" + (i + 1) + " item data: ");
        IO.print("Product name: ");
        String productName = sc.nextLine();
        IO.print("Product price: ");
        double productPrice = sc.nextDouble();
        IO.print("Quantity: ");
        int quantity = sc.nextInt();
        sc.nextLine();

        Product product = new Product(productName, productPrice);

        OrderItem orderItem = new OrderItem(quantity, productPrice, product);

        order.addItem(orderItem);
    }

    IO.println();
    IO.println("ORDER SUMMARY:");
    IO.println(order);

    sc.close();

}
