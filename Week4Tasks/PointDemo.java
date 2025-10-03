package Week4Tasks;
class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    void display() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

public class PointDemo {
    public static void main(String[] args) {
        Point p1 = new Point(5, 10);
        Point p2 = new Point(p1);
        Point p3 = new Point(p2);

        p2.x = 20;
        p3.y = 50;

        System.out.println("Original Point:");
        p1.display();

        System.out.println("Copied Point 1:");
        p2.display();

        System.out.println("Copied Point 2:");
        p3.display();
    }
}

