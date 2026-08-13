import java.util.Scanner;


void main() {

  Scanner sc = new Scanner(System.in);
  double input = sc.nextDouble();
  String intervalo = "";

  if (input >= 0 && input <= 25) {
    intervalo = "[0,25]";
  } else  if (input > 25 && input <= 50) {
    intervalo = "[25,50]";
  }  else if (input > 50 && input <= 75) {
    intervalo = "[50,75]";
  }  else if (input > 75 && input <= 100) {
    intervalo = "[75,100]";
  } else {
    System.out.printf("Fora de intervalo");
    return;
  }

  System.out.printf("Intervalo %s",  intervalo);

  sc.close();
    
}