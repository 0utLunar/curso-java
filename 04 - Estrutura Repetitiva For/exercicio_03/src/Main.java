void main() {

  Scanner sc = new Scanner(System.in);

  int n = sc.nextInt();
  double nota1, nota2, nota3, media;

  for (int i = 0; i < n; i++) {
    nota1 = sc.nextDouble();
    nota2 = sc.nextDouble();
    nota3 = sc.nextDouble();

    media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10.0;

    System.out.printf("%.1f\n", media);
  }


  sc.close();

}