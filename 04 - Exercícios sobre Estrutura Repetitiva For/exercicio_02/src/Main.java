void main() {

  Scanner sc = new Scanner(System.in);

  int in = 0, out = 0, input;
  int n = sc.nextInt();

  for  (int i = 0; i < n; i++) {
    input = sc.nextInt();
    if (input >= 10 && input <= 20) {
      in++;
    } else {
      out++;
    }
  }

  System.out.println(in + " in");
  System.out.println(out + " out");

  sc.close();

}