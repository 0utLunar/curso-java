import entities.Rectangle;

void main() {

    Rectangle rectangle = new Rectangle();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter rectangle width and height: ");

    rectangle.width = sc.nextDouble();
    rectangle.height = sc.nextDouble();

    System.out.printf("AREA = %.2f\n", rectangle.area());
    System.out.printf("PERIMETER = %.2f\n", rectangle.perimeter());
    System.out.printf("DIAGONAL = %.2f\n", rectangle.diagonal());


    sc.close();
    
}