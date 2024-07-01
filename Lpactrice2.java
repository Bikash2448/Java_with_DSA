import java.util.Scanner;
public class Lpactrice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println();
        int n;
        for(n=1;n<=50;n++){
            if(n%3==0){
                continue;
               // System.out.println(n);
            }
            System.out.println(n);
        }
    }
}
