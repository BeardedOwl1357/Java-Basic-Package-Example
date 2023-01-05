import geometery.*; // Allows you to import all classes inside the package "geometery"

public class App{
    public static void main(String args[]){
        // Circle 
        Circle cir = new Circle(5);
        System.out.printf("Radius = %f \t Circumferece = %f \t Area = %f \n",cir.radius, cir.circumference(), cir.area());
        // Rectangle
        Rectangle rect = new Rectangle(2,3 );
        System.out.printf("Length = %f \t Breadth = %f \t Perimeter = %f \t Area = %f \n",rect.length, rect.breadth, rect.perimeter(), rect.area());
        // Square
        Square sq = new Square(5);
        System.out.printf("Side = %f \t Perimeter = %f \t Area = %f \n",sq.side,sq.perimeter(),sq.area());
    }
}