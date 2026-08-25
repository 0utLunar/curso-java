
void main() {

    File file = new File(Paths.get("dados", "in.txt").toString());
    Scanner sc = null;
    try {
        sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    } catch (FileNotFoundException e) {
        System.out.println("Error opening file " + e.getMessage());
    }
    finally {
        if(sc != null) {
            sc.close();
        }
        System.out.println("Finally block executed");
    }


}
