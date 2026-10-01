public class Employee implements Comparable<Employee>{
    int id;
    String name;
    int age;
    double sal;
    String designation;
    public Employee(int id, String name, int age, double sal, String designation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sal = sal;
        this.designation = designation;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", sal=" + sal + ", designation="
                + designation + "]";
    }
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.age,other.age);
        
    }
}
    
    
    
    
    

