import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);

    double salario = sc.nextDouble();
    double imposto = 0;

    if (salario <= 2000) {
        System.out.printf("Isento");
        return;
    } else if (salario > 2000 && salario <= 3000) {
        imposto = (salario - 2000) * 0.08;
    } else if (salario > 3000 && salario <= 4500) {
        imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
    } else if (salario > 4500) {
        imposto = (salario - 4500) * 0.28 + 1000 * 0.08 + 1500 * 0.18;
    }

    System.out.printf("R$ %.2f", imposto);

    sc.close();

}