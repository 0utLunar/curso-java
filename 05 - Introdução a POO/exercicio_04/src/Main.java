import util.CurrencyConverter;

void main() {

  Scanner sc = new Scanner(System.in);

  System.out.print("What is the dollar price? ");
  CurrencyConverter.dollar = sc.nextDouble();
  System.out.print("How many dollars will be bought? ");
  double finalPrice = CurrencyConverter.convert(sc.nextDouble());
  System.out.printf("Amount to be paid in reais = %.2f\n", finalPrice);


  sc.close();
    
}