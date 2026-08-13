void main() {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] mat = new int[n][m];

    for  (int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            mat[i][j] = sc.nextInt();
        }
    }

    int search = sc.nextInt();

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (mat[i][j] == search) {
                System.out.printf("Position: %d,%d%n", i, j);
                if (j > 0) {
                    System.out.println("Left: " + mat[i][j-1]);
                }
                if (i > 0) {
                    System.out.println("Up: " + mat[i-1][j]);
                }
                if (j < mat[i].length-1) {
                    System.out.println("Right: " + mat[i][j+1]);
                }
                if (i < mat.length-1) {
                    System.out.println("Down: " + mat[i+1][j]);
                } {

                }
            }
        }
    }

    sc.close();
}