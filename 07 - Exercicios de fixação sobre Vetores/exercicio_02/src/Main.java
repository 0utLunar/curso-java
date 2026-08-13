void main() {

    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos numeros voce vai digitar? ");
    int n = sc.nextInt();
    double sum = 0, avg = 0;
    double[] vect = new double[n];

    for (int i = 0; i < n; i++) {
        System.out.print("Digite um numero: ");
        vect[i] = sc.nextDouble();
        sum += vect[i];
    }

    avg = sum / n;

    System.out.println();

    System.out.print("VALORES = ");
    for (int i = 0; i < n; i++) {
        System.out.printf("%.1f ", vect[i]);
    }

    System.out.print("\nSOMA = ");
    System.out.printf("%.2f", sum);

    System.out.print("\nMEDIA = ");
    System.out.printf("%.2f", avg);


    sc.close();

}