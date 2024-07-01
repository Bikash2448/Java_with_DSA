//import java.util.Scanner;

public class arr_input {
    public static void print_array(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        // System.out.println("enter array input.......");
        // for(int i=0;i<arr.length;i++){
        //     Scanner sc = new Scanner(System.in);
        //     arr[i]=sc.nextInt();
            //System.out.println(arr[]);
        System.out.println("Your Array Is.........");
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+ " ");
        print_array(arr);
        // }
        System.out.println("\ncopy to new array........");
        int[] arr_2 = arr.clone();
        arr_2[0]=0;
        arr_2[1]=0;
        print_array(arr_2);
        System.out.println("\n");
        print_array(arr);
    }
}
