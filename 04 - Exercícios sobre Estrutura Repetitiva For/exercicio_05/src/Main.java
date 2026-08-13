void main() {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int result = n;

    for (int i = 1; i < n; i++) {
        result = result * (n-i);
    }

    System.out.println(result);

    sc.close();

}