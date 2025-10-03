package Week4Tasks;
class Student1 {
    String name;
    int rollNo;
    double marks;

    Student1(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    Student1(Student1 s) {
        this.name = s.name;
        this.rollNo = s.rollNo;
        this.marks = s.marks;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Ratchambiga", 171, 95.5);
        Student1 s2 = new Student1(s1);

        s2.name = "Devi";

        System.out.println("Original Student:");
        s1.display();

        System.out.println("Copied Student:");
        s2.display();
    }
}