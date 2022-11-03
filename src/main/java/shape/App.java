package shape;

public class App {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Shape c2 = new Circle(8);

        Rectangle r1= new Rectangle(3,7);
        Shape r2 = new Rectangle(4,5);

        Square s1 = new Square(9);
        Rectangle s2 = new Square(7);
        Shape s3 = new Square(4);

        Shape[] shapes = {c1,c2,r1,r2,s1,s2,s3};

//        for (Shape shape : shapes){
//            shape.draw();
//        }
        double total = 0;
        for (Shape shape : shapes){
            total = total+shape.getArea();
        }
        System.out.println(total);

    }
}
