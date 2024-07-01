import java.io.*;
import java.net.*;
// import java.util.Scanner;
public class server {
    public static void main(String[] args) {
        try {
            while(true){
                ServerSocket ss = new ServerSocket(2244);
                Socket s = ss.accept();
                System.out.println("Connection established..");
                PrintStream ps = new PrintStream(s.getOutputStream());
                ps.print("Hello.....");
                // Scanner sc = new Scanner(System.in);
                // System.out.println(" Enter msg to be send : ");
                // String str = sc.nextLine();
                // ps.print(str);
               // ps.print(" Hello Biku if this code is run successfully then you happy ........");
                s.close();
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("errorrrr"+e.getMessage());    
        }
    }
}
