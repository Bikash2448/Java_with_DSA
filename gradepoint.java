import java.util.Scanner;
public class gradepoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter persentage of Marks:");
        int n = sc.nextInt();
        if(n>=90){
            System.out.println("Excellent");
        }
        else if(n>80){
            System.out.println("Very Good");
        }
        else if(n>50){
            System.out.println("good");
        }
        else if(n<50){
            System.out.println("Below average");
        }
    }
}
