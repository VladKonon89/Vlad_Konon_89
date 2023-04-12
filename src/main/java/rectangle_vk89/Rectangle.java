package rectangle_vk89;

public class Rectangle {  // parent(basic or super) class
    private int height;   // поля private не доступны,чтобы вытащить инфу из них, но внизу есть гетер public
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

    public int getPerimeter() {
        return (width + height) * 2;
    }

    public int getHeight() {
        return height;
    }   // через паблик гетер можно вытащить инфу в другие чайлд классы
//<<<<<<< HEAD:src/main/java/rectangle_vk89/Rectangle.java
//
//=======
//    public final void hello(){
//        System.out.println("hello");
//    }
//>>>>>>> origin/main:src/main/java/rectangle/Rectangle.java
}
