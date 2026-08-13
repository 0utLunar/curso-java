import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);

    int cod, quantidade;
    double total = 0;
    cod = sc.nextInt();
    quantidade = sc.nextInt();

    if (cod == 1) {
        total = quantidade * 4.00;
    } else if (cod == 2) {
        total = quantidade * 4.50;
    } else if (cod == 3) {
        total = quantidade * 5.00;
    } else if (cod == 4) {
        total = quantidade * 2.00;
    } else if (cod == 5) {
        total = quantidade * 1.50;
    }

    System.out.printf("Total: R$ %.2f", total);

    sc.close();

}