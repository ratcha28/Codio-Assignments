package Week4Tasks;
class Shape{
    public double area(){
        return 0;
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape{
    double length,breadth;
    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double area(){
        return length*breadth;
    }
}
class Triangle extends Shape{
    double base,height;
    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    public double area(){
        return 0.5*base*height;
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape[] Shapes=new Shape[3];
        Shapes[0]=new Circle(5);
        Shapes[1]=new Rectangle(4,6);
        Shapes[2]=new Triangle(3,7);
        for(Shape s:Shapes){
            System.out.println("Area = "+ s.area());
        }
    }
}
