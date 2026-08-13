import entities.Rent;

void main() {

    Scanner sc = new Scanner(System.in);
    System.out.printf("How many rooms will be rented? ");
    int n = sc.nextInt();
    Rent[] rents = new Rent[9];
    for(int i = 0; i < n; i++) {
        System.out.println();
        System.out.printf("Rent #%d%n", i + 1);
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Room: ");
        int room = sc.nextInt();
        Rent rent = new Rent(name, email);
        rents[room] = rent;
    }

    System.out.println();
    System.out.println("Busy rooms: ");
    for (int i = 0; i < rents.length; i++) {
        if (rents[i] != null) {
            System.out.printf("%d: %s, %s\n", i,  rents[i].getName(), rents[i].getEmail());
        }
    }

    sc.close();


}