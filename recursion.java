import java.util.Scanner;

public class recursion {
    static void printincreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        //9System.out.println(n);
        printincreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        System.out.println("Enter The Number: ");
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the number: ");
        int n = sc.nextInt();
        printincreasing(n);
    }
}
