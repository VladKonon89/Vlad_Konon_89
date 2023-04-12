package rectangle_vk89;

public class Square extends Rectangle{  // child class
    public Square(int side){
        super(side,side);   // вызываем конструктор суперкласса Rectangle
    }

    @Override   // переписываем функцию из базового класса, чтоб поменять слово ректангл на скуэр
    public void draw(){
        System.out.println("I draw a square with side = "+getHeight());
    }
}
