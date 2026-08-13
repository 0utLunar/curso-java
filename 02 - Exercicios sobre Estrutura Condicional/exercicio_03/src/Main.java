import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);

    int input = sc.nextInt();

    if (input % 2 == 0) {
        System.out.printf("PAR");
    } else {
        System.out.printf("IMPAR");
    }


    sc.close();

}