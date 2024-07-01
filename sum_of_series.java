// factorial
import java.util.Scanner;
public class sum_of_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int fac =1;
        for(int i =1;i<=n;i++){
            fac = fac*i;
          //  fac++;
            System.out.println(fac);
        }


    }
}
