void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos numeros voce vai digitar? ");
    int n = sc.nextInt();
    int pares = 0;
    int[] vect = new int[n];

    for  (int i = 0; i < n; i++) {
        System.out.print("Digite um numero: ");
        vect[i] = sc.nextInt();
    }

    System.out.println();
    System.out.println("NUMEROS PARES:");
    for(int i = 0; i < n; i++) {
        if(vect[i] % 2 == 0) {
            System.out.printf("%d ", vect[i]);
            pares++;
        }
    }

    System.out.println();
    System.out.printf("QUANTIDADE DE PARES: %d\n", pares);

    sc.close();
}