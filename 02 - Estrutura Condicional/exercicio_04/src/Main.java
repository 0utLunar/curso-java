import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);


    int inicio, fim, duracao;
    inicio = sc.nextInt();
    fim = sc.nextInt();

    if (inicio == fim) {
        duracao = 24;
    } else if (inicio > fim) {
        duracao = 24 - inicio + fim;
    } else {
        duracao = fim - inicio;
    }

    System.out.printf("O JOGO DUROU %d HORA(S)",  duracao);


    sc.close();

}