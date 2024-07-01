class texxt{
    Object show(){
        System.out.println(22);
        return null;
    }
}

public class pac_smartpg extends texxt {
    // void show(){
    //     System.out.println(2);
    // }
    Object show(){
        System.out.println(2222);
        return null;
    }
    public static void main(String[] args) {
        pac_smartpg ps = new pac_smartpg();
        ps.show();
        // ps.show();
        ps.show();
        // texxt t=new texxt();
        // t.show();
        // t.show();
    }
}
