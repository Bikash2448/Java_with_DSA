import java.util.Scanner;
public class Lpactrice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=1;
        while(true){
            if(n%5==0 && n%7==0){
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}
