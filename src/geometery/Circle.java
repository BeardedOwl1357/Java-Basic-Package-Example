package geometery;

public class Circle{
    public double radius = 0.0;
    public double PI = 3.14;
    public Circle(double radius){
        this.radius = radius;
    }
    public double circumference(){
        return (2 * PI * radius);
    }
    public double area(){
        return (PI * radius * radius);
    }
}