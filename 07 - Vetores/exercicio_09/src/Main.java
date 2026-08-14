void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantas pessoas voce vai digitar? ");
    int n = sc.nextInt();
    String[] nomes = new String[n];
    int[] idades = new int[n];
    int maisVelho = Integer.MIN_VALUE;
    int posicao = 0;
    for (int i = 0; i < n; i++) {
      System.out.printf("Dados da %da pessoa:\n", i+1);
      System.out.print("Nome: ");
      sc.nextLine();
      nomes[i] = sc.nextLine();
      System.out.print("Idade: ");
      idades[i] = sc.nextInt();
      if (idades[i] > maisVelho) {
        posicao = i;
        maisVelho = idades[i];
      }
    }

    System.out.printf("PESSOA MAIS VELHA: %s", nomes[posicao]);
    sc.close();
}