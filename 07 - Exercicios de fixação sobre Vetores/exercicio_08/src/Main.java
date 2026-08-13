void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos elementos vai ter o vetor? ");
    int n = sc.nextInt();
    int nPares = 0;
    int vect[] = new int[n];
    double mediaPares = 0;
    for (int i = 0; i < n; i++) {
        System.out.print("Digite um numero: ");
        vect[i] = sc.nextInt();
        if (vect[i] % 2 == 0) {
            mediaPares += vect[i];
            nPares++;
        }
    }

    mediaPares /= nPares;
    if (nPares > 0) {
        System.out.printf("MEDIA DOS PARES = %.1f", mediaPares);
    } else {
        System.out.print("NENHUM NUMERO PAR");
    }



    sc.close();
}