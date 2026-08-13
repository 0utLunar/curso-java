void main() {

    Scanner sc = new Scanner(System.in);

    int alcool = 0, gasolina = 0, diesel = 0, input;
    input = sc.nextInt();

    while (input != 4) {
        switch (input) {
            case 1: alcool ++;
            break;
            case 2: gasolina ++;
            break;
            case 3: diesel ++;
            break;
        }
        input = sc.nextInt();
    }

    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: " + alcool);
    System.out.println("Gasolina: " + gasolina);
    System.out.println("Diesel: " + diesel);

    sc.close();

}