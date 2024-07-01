public class Facto {
    public static int Factorial(int a) {
        if (a == 0 || a==1) {
            return 1;
         } //else if (a == 1) {
        //     return 1;}
        int b = a * Factorial(a - 1);
        return b;
        
    }

    public static void main(String[] args) {
        int c = Factorial(4);
        System.out.println(c);
    }
}
