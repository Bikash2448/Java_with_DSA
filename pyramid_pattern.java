//Pyramid structure pattern printing
import java.util.Scanner;
public class pyramid_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){ //tervising over rows
            //print n-i spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print 2*i-1          *
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
