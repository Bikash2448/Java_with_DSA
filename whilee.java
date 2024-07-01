import java.util.Scanner;
public class whilee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input:");
        int n = sc.nextInt();
        int sum = 0;
        int num=1;
        while(n>=num){
           // System.out.println(num);
           sum = sum+num;
            num++;
        }
        System.out.println(sum);
    }
}
