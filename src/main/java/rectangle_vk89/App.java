package rectangle_vk89;

public class App {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,6);
        r1.draw();
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        Square s1 = new Square(5);
        s1.draw();
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());

        Rectangle s2 = new Square(9);  // базовому классу можем присвоить значение чайлд класса, наоборот нельзя
    }
}
