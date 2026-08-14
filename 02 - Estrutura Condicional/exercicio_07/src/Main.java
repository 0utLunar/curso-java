import java.util.Scanner;


void main() {

    Scanner sc = new Scanner(System.in);

    double x, y;
    String quadrante = "";
    x = sc.nextDouble();
    y = sc.nextDouble();

    if (x == 0 && y == 0) {
        quadrante = "Origem";
    }
    if (x > 0 && y > 0) {
        quadrante = "Q1";
    } else if  (x < 0 && y > 0) {
        quadrante = "Q2";
    }  else if  (x < 0 && y < 0) {
        quadrante = "Q3";
    } else if  (x > 0 && y < 0) {
        quadrante = "Q4";
    } else if (x == 0) {
        quadrante = "Eixo X";
    } else if (y == 0) {
        quadrante = "Eixo Y";
    }

    System.out.printf("%s", quadrante);

    sc.close();

}