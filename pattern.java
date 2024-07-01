//Reverse Tringular Pattern
import java.util.Scanner;
// reverse triangle pattern
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number: ");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=(n+1)-i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
