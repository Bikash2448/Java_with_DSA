class d{
    // System.out.println();
    // int a = 30;
    d(){
        System.out.println("ok");
    }
}
public class superkeyword extends d{
    int b=20;
    void show(int a){
        // System.out.println(a);
        System.out.println(this.b);
        // System.out.println(super.a);
    }
    public static void main(String[] args) {
        // System.out.println();
        superkeyword sk = new superkeyword();
        sk.show(90);
    }
}
