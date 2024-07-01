import java.util.Scanner;
class algebra{
    int add (int a,int b){
        int ans = a+b;
        return ans;
    }
}
public class summethod {
    public static void main(String[] args) {
        algebra obj = new algebra();
        System.out.print("enter two number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter number");
        int m = sc.nextInt();
        int a= obj.add(m,n);
        System.out.println(a);
        
    }
}
