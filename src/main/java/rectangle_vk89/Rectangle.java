package rectangle_vk89;

public class Rectangle {  // parent(basic or super) class
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

}
