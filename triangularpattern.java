import java.util.Scanner;
public class triangularpattern {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number: ");
        a = sc.nextInt();
        //System.out.println("enter the column number: ");
        //b = sc.nextInt();
        for(c=1;c<=a;c++){
            for(d=1;d<=c;d++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
