import java.util.Scanner;

void main() {

  Scanner sc = new  Scanner(System.in);

  int input = sc.nextInt();

  if (input < 0) {
    System.out.printf("NEGATIVO%n");
  } else {
    System.out.printf("NAO NEGATIVO%n");
  }

  sc.close();

}