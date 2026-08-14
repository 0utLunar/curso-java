import entities.Person;

void main() {

    Scanner sc = new Scanner(System.in);

    System.out.print("Quantas pessoas serão digitadas? ");
    int n = sc.nextInt();
    double mediumHeight = 0;
    double sixteen = 0;
    Person[] vect = new Person[n];
    for (int i = 0; i < n; i++) {
        System.out.printf("Dados da %da pessoa:%n",  i + 1);
        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        Person pessoa = new Person(nome, idade, altura);
        vect[i] = pessoa;
        mediumHeight += altura;
        if (idade < 16) {
            sixteen++;
        }
    }

    mediumHeight = mediumHeight / n;
    sixteen = sixteen / n * 100;
    System.out.println();
    System.out.printf("Altura média: %.2f%n", mediumHeight);
    System.out.printf("Pessoas com menos de 16 anos: %.1f%\n", sixteen);

    for (Person p : vect) {
        if (p.getAge() < 16){
            System.out.println(p.getName());
        }
    }

    sc.close();
    
}