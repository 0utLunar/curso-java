void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos numeros voce vai digitar? ");
    int n = sc.nextInt();
    double maior = Double.MIN_VALUE;
    int posicao = 0;
    double[] vect = new double[n];

    for (int i = 0; i < n; i++) {
        System.out.print("Digite um numero: ");
        vect[i] = sc.nextDouble();
        if (vect[i] > maior) {
            maior = vect[i];
            posicao = i;
        }
    }

    System.out.println();
    System.out.printf("MAIOR VALOR = %.1f\n", maior);
    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicao);

    sc.close();
}