//count //sum 0f// the number of digits for a given number n
public class Lpactrice3 {
    public static void main(String[] args) {
        int number_of_digits = 0;
        int n = 123456;
        while(n>0){
            number_of_digits+=n%10;
           n = n/10;
          // number_of_digits++;
        }
        System.out.println(number_of_digits);
    }
}
