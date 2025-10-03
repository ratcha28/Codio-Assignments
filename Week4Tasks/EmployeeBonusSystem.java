package Week4Tasks;
class Employee{
    public double getBonus(){
        return 0;
    }
}
class Manager extends Employee{
    public double getBonus(){
        return 10000;
    }
}
class Developer extends Employee{
    public double getBonus(){
        return 5000;
    }
}
public class EmployeeBonusSystem {
    public static void main(String[] args) {
        Employee e1=new Manager();
        Employee e2=new Developer();
        System.out.println("Manager Bonus: "+e1.getBonus());
        System.out.println("Developer Bonus: "+e2.getBonus());
    }
}
