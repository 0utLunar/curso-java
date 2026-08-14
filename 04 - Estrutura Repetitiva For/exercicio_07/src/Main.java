void main() {

    Scanner sc = new Scanner(System.in);

    int n  = sc.nextInt();

    for  (int i = 1; i <= n; i++) {
        System.out.printf("%d %.0f %.0f\n", i, Math.pow(i, 2), Math.pow(i, 3));
    }

    sc.close();
    
}