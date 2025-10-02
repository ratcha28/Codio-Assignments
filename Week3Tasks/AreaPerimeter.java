package Week3Tasks;
class Rectangle{
    int length;
    int breadth;
    int area(){
        return length*breadth;
    }
    int perimeter(){
        return 2*(length + breadth);
    }
    void display(){
        System.out.println("Length Of A Rectangle:"+length);
        System.out.println("Breadth Of A Rectangle:"+breadth);
        System.out.println("Area:"+area());
        System.out.println("Perimeter:"+perimeter());
    }
}
public class AreaPerimeter{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=5;
        r.display();
    }
}
