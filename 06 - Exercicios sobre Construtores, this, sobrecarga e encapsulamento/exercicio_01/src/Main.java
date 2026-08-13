import entities.Account;

void main() {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter account number: ");
    int number = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter account holder: ");
    String holder = sc.nextLine();
    Account account = new Account(number, holder);
    System.out.print("Is there a initial deposit (y/n)? ");
    char initialDeposit = sc.next().toLowerCase().charAt(0);
    if (initialDeposit == 'y') {
        System.out.print("Enter initial deposit value: ");
        account.deposit(sc.nextDouble());
    }

    System.out.println();
    System.out.println("Account data:");
    System.out.println(account);

    System.out.println();
    System.out.print("Enter a deposit value: ");
    account.deposit(sc.nextDouble());
    System.out.println("Updated account data:");
    System.out.println(account);

    System.out.println();
    System.out.print("Enter a withdraw value: ");
    account.withdraw(sc.nextDouble());
    System.out.println("Updated account data:");
    System.out.println(account);


    sc.close();
    
}