import java.lang.*;
public class Test implements Runnable{
    public void run(){
        System.out.println("Biku Mal.............");
        // public static void run1(){
        //     System.out.println("gygugu");
        // }
    }
    public void run1(){
        System.out.println("Bikuu Mal.............");
    }
    
    public static void main(String[] args) {
        Test t = new Test();
        Test t2 = new Test();
        Thread th = new Thread(t);
        Thread th1 = new Thread(t2);

        th.start();
        th1.start();
        // th.sleep(3000);
    }
}
