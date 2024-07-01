import java.lang.*;
/**
 * threadd
 */
public class threadd extends Thread{
    @Override
    public void run(){
        System.out.println("Biku................");
    }
    public static void main(String[] args) {
        // Thread t = new Thread();
        threadd t = new threadd();
        t.start();
    }
    
}
