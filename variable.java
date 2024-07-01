import java.util.Scanner;
public class variable {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double principle, rate ,time,simple_interest;
        System.out.println("Enter principle Amount: ");
        principle = sc.nextDouble();
        //principle = 20000;
        System.out.println("Enter interest rate: ");
        //rate = 12;
        rate = sc.nextDouble();
        //time = 2;
        System.out.println("Enter Time: ");
        time = sc.nextDouble();
        simple_interest = (principle*rate*time)/100;
        System.out.println("Your interest amount is : "+simple_interest);

    }
}
