
public class MyThread implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i+"no my thread is" +i);
            try{
            Thread.sleep(2000);
        }
        catch(Exception e){

        }
        }
    }
    class Thread2 extends Thread{
        public void run(){
            for(int i=10;i>=1;i--){
                System.out.println("Another Thread"+i);
                try{
            Thread.sleep(1000);
            }
            catch(Exception e){ 
            }

            }
        }
    }
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread thr = new Thread(mt);
        MyThread.Thread2 tr = mt.new Thread2();
        thr.start();
        tr.start();
        
    }
}
