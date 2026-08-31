import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

void main() {

    Scanner sc = new Scanner(System.in);

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    System.out.println("Entre os dados do contrato: ");
    System.out.print("Numero: ");
    int number = sc.nextInt();
    System.out.print("Data (dd/MM/yyyy): ");
    LocalDate date = LocalDate.parse(sc.next(), dtf);
    System.out.print("Valor do contrato: ");
    double totalValue = sc.nextDouble();

    Contract obj = new Contract(number, date, totalValue);

    System.out.print("Entre com o numero de parcelas: ");
    int n = sc.nextInt();

    ContractService contractService = new ContractService(new PaypalService());
    contractService.processContract(obj, n);

    System.out.println("Parcelas");
    for (Installment installment : obj.getInstallments()) {
        System.out.println(installment);
    }



    sc.close();

}