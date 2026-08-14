void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos elementos vai ter o vetor? ");
    int n = sc.nextInt();
    double[] vect = new double[n];
    double media = 0;
    for (int i = 0; i < n; i++) {
        System.out.print("Digite um numero: ");
        vect[i] = sc.nextDouble();
        media += vect[i];
    }

    media = media / n;
    System.out.println();
    System.out.printf("MEDIA DO VETOR = %.3f\n", media);
    System.out.println("NUMEROS ABAIXO DA MÉDIA: ");
    for (int i = 0; i < n; i++) {
        if (vect[i] < media) {
            System.out.printf("%.1f\n", vect[i]);
        }
    }



    sc.close();
}