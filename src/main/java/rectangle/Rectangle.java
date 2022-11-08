package rectangle;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public void draw(){
        System.out.println("I draw a rectangle with height = "+this.height+", width = "+this.width);
    }
    public int getArea(){
        return height*width;
    }
    public int getPerimeter(){
        return (width+height)*2;
    }

    public int getHeight() {
        return height;
    }
    public final void hello(){
        System.out.println("hello");
    }
}
