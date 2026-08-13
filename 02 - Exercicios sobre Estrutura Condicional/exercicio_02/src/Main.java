import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);

    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();

    if ((a % b == 0) || (b % a == 0)) {
        System.out.println("Sao Multiplos");
    } else {
        System.out.println("Nao sao Multiplos");
    }

    sc.close();
    
}