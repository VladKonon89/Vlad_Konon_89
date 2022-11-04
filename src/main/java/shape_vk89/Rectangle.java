package shape_vk89;

public class Rectangle implements Shape{
    private int height;
    private int length;

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("I draw a rectangle with height = "+height+" length = "+length);

    }

    @Override
    public double getArea() {
        return height*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(height+length);
    }
}
