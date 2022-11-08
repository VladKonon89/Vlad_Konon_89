package rectangle;

public class Square extends Rectangle{
    public Square(int side){
        super(side,side);
    }

    @Override
    public void draw(){
        System.out.println("I draw a square with side = "+getHeight());
    }
//    @Override
//    public void hello(){
//        System.out.println("Hi, Hello!");
//    }
}
