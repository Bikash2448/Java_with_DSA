class human{
    private int age;
    void getage(){
        System.out.println(age);
    }
    void setage(int a){
        this.age=a;
    }
    void eat(){
        System.out.println("Eating............");
    }
    void weight(int a){
        System.out.println("your weight is "+a);
    }
}
public class polymorphism_smart extends human{
    public static void main(String[] args) {
        polymorphism_smart ps= new polymorphism_smart();
        ps.setage(22);
        // ps.getage();
        ps.weight(45);
        // System.out.println(ps.getage());
    }
}
