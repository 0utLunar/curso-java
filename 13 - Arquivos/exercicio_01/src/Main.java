import entities.Product;

void main() {

    Scanner sc = new Scanner(System.in);

    List<Product> list = new ArrayList<>();

    System.out.print("Enter a file path: ");
    String srcFileStr = sc.nextLine();

    File file = new File(srcFileStr);
    String srcFolderStr = file.getParent();

    boolean sucess = new File(srcFolderStr + "/out").mkdir();

    System.out.println("Folder created: " + sucess);

    String targetFileStr = srcFolderStr + "/out/summary.csv";

    try (BufferedReader br = new BufferedReader(new FileReader(srcFileStr))) {

        String itemCsv = br.readLine();
        while (itemCsv != null) {

            String[] fields = itemCsv.split(",");
            String name = fields[0];
            double price = Double.parseDouble(fields[1]);
            int quantity = Integer.parseInt(fields[2]);

            list.add(new Product(name, price, quantity));

            itemCsv = br.readLine();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

            for (Product item : list) {
                bw.write(item.getName() + "," + String.format("%.2f", item.totalPrice()));
                bw.newLine();
            }

            System.out.println(targetFileStr + " Created!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    }

    sc.close();
}
