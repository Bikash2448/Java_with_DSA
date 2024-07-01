/**
 * Employee
 */
class Employee {
    private int emp_id;
    public void seteeemp_id(int a){
        emp_id=a;
    }
    public int getempp_id(){
        return emp_id;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Employee ep= new Employee();
        ep.seteeemp_id(200);
        System.out.println(ep.getempp_id());
        
    }
}
