
void main() {

    File file = new File("in.txt");
    Scanner sc = null;
    try {
        sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());;
    } finally {
        if (sc != null) {
            sc.close();
        }
    }
}
