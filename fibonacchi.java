import java.util.Scanner;

public class fibonacchi {
    static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int ans = fibo(n-1)+fibo(n-2);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("enter the number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i =0; i<=a; i++){
            System.out.println(fibo(i));
        }
        // System.out.println(fibo(a));
    }
}
