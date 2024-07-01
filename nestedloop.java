import java.util.Scanner;
public class nestedloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row no: ");
        int n = sc.nextInt();
        System.out.println("Enter the column no: ");
        int m = sc.nextInt();
        int i ,j;
        for(i =1;i<=n;i++){
            for(j=1;j<=m;j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
