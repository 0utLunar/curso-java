void main() {

    Scanner sc = new Scanner(System.in);

    int senha = 2002;
    int input = sc.nextInt();

    while (input != senha) {
        System.out.println("Senha Invalida");
        input = sc.nextInt();
    }

    System.out.println("Acesso Permitido");

    sc.close();
    
}