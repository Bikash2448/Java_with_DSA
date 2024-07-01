import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int n = sc.nextInt();
        if(n%4==0 && n%400 ==0 || n%100!=0){
            System.out.println("Year is Leap year");
        }
        else{
            System.out.println("Year is not leap year.");
        }
    }
}
