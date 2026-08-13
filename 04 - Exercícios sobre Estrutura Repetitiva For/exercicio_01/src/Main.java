void main() {

    Scanner sc = new Scanner(System.in);

    int input = sc.nextInt();

    for (int i = 1; i <= input; i++) {
        if (i % 2 != 0) {
            System.out.println(i);
        }
    }

    sc.close();
    
}