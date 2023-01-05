package geometery;

public class Rectangle{
    public double length = 0.0, breadth = 0.0;
    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double perimeter(){
        return 2*(length + breadth);
    }
    public double area(){
        return length*breadth;
    }
}