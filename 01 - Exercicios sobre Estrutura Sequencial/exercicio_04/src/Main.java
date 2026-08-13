import java.util.Scanner;

void main() {

  Scanner sc = new Scanner(System.in);

  int numero = sc.nextInt();
  int horas = sc.nextInt();
  double salarioHr = sc.nextDouble();

  double salario = horas * salarioHr;

  System.out.printf("NUMBER = %d\n", numero);
  System.out.printf("SALARY = U$ %.2f", salario);

  sc.close();
    
}