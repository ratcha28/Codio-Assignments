package Week3Tasks;
class Student{
    String name;
    int rollNumber;
    int marks;
    void display(){
        System.out.println("Name:"+ name);
        System.out.println("Roll Number:"+ rollNumber);
        System.out.println("Marks:"+ marks);
        System.out.println("--------------------------------");
    }
}
public class StudentDetails {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Ratcha";
        s1.rollNumber=171;
        s1.marks=90;
        Student s2=new Student();
        s2.name="Nandhini";
        s2.rollNumber=133;
        s2.marks=90;
        Student s3=new Student();
        s3.name="suresh";
        s3.rollNumber=188;
        s3.marks=90;
        s1.display();
        s2.display();
        s3.display();
    }
}
