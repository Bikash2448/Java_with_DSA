// public class k_multiples {
//     static void multiple(int n,int k){
//         if (k==0) {
//             return;
//         }
//         multiple(n, k-1);
//         System.out.print(n*k+" ");

//     }
//     public static void main(String[] args) {
//         multiple(4,8);
//     }
// }




public class k_multiples {
    static int alternate_sum_series(int n){
        if (n==0) {
            return 0;
        }
        if (n%2==0) {
            int a =alternate_sum_series(n-1)-n;
            return a;
        }else{
           int b= alternate_sum_series(n-1)+n;
           return b;
        }
    }
    public static void main(String[] args) {
        int c = alternate_sum_series(6);
        System.out.println(c);
    }
    
}