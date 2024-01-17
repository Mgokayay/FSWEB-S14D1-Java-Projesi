package s14d1;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int id,String name,double salary) {
        super(id,name,salary);
    }


    public void work() {
        System.out.println("Junior Developer " + getName() + "starts to working");
        setSalary(getSalary()+5000);
    }
}
