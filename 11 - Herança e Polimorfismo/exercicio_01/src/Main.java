import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

void main() {

    Scanner sc = new Scanner(System.in);
    List<Product> products = new ArrayList<>();
    DateTimeFormatter ftm = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    IO.print("Enter the number of products: ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        IO.println("Product #" + (i + 1) + " data: ");
        IO.print("Common, used or imported (c/u/i)? ");
        sc.nextLine();
        char choice = sc.next().charAt(0);
        IO.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        IO.print("Price: ");
        double price = sc.nextDouble();
        if  (choice == 'u') {
            IO.print("Manufacture date (DD/MM/YYYY): ");
            sc.nextLine();
            LocalDate manufactureDate = LocalDate.parse(sc.next(), ftm);
            products.add(new UsedProduct(name, price, manufactureDate));
        } else if (choice == 'i') {
            IO.print("Customs fee: ");
            double customsFee = sc.nextDouble();
            products.add(new ImportedProduct(name, price, customsFee));
        } else {
            products.add(new Product(name, price));
        }
    }

    IO.println();
    IO.println("PRICE TAGS: ");
    for (Product p : products) {
        IO.println(p.priceTag());
    }

    sc.close();
}
