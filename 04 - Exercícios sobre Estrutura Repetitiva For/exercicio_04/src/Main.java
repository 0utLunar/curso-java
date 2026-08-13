void main() {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b == 0) {
            System.out.printf("divisao impossivel\n");
        } else {
            double c = (double) a / b;
            System.out.printf("%.1f\n", c);
        }
    }

    sc.close();
    
}