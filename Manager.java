import java.util.ArrayList;
import java.util.Collections;

public class Manager {
    public static void main(String[] args) {
        Employee e1=new Employee(1, "viraja", 18, 50000, "Manager");
        Employee e2=new Employee(2, "yashu", 16, 40000, "Trainer");
        Employee e3=new Employee(3, "geetha", 17, 70000, "Admin");
        Employee e4=new Employee(4, "madhu", 20, 60000, "Senior Trainer");
        Employee e5=new Employee(5, "suma", 19, 30000, "Clerk");
        ArrayList<Employee> al=new ArrayList<>();
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        al.add(e5);

         Collections.sort(al,(a,b)-> a.name.compareTo(a.name));
        for(Employee e:al){
        System.out.println(e);
        }

    
    }
    
}
