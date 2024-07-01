import java.util.*;
public class stringcw {
    public static void main(String[] args) {
        String str = "Bika";
        // System.out.println(str);
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the string: ");
        // String s = sc.nextLine();
        // System.out.println(s);
        // char s = str.charAt(5);
        // System.out.println(s);
        // int a = str.indexOf("l");
        // System.out.println(a);
        String gtr = "Cikasu";
        // System.out.println(str.compareTo(gtr));
        // System.out.println(str.concat(gtr));
        // System.out.println("Biku"+"Chiku"+100+"mal");
        // System.out.println(str.substring(1,4));
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length()+1;j++){
                System.out.print(str.substring(i,j));
                System.out.println();
            }
        }
    }
}
