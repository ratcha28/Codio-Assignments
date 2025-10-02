package Week3Tasks;
class Employee{
    private String name;
    private int id;
    private double salary;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void display(){
        System.out.println("Employee Name:"+ name);
        System.out.println("Employee ID:"+ id);
        System.out.println("Salary:"+ salary);
        System.out.println("------------------------------");
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setName("Ratcha");
        emp.setId(171);
        emp.setSalary(50000.0);
        emp.display();
    }
}
