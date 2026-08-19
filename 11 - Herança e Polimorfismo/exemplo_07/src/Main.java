import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

void main() {

    List<Account> list = new ArrayList<>();

    list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
    list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
    list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
    list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));

    double sum = 0;
    for (Account account : list) {
        sum =+ account.getBalance();
    }

    System.out.printf("Total balance: %.2f", sum);

    for (Account account : list) {
        account.deposit(10.0);
        System.out.println("Deposited " + account.getNumber() + ", R$ " + account.getBalance());
    }
}
