import java.util.Scanner;

public class pactricee1 {
    static void printarr(int[] arr){
        int a = arr.length;
        System.out.print("your array is: ");
        for(int i=0; i<a;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] dupli_ele_arr(int[] arr){
        int a = arr.length;
        int[] a1 = new int[a/2];
        int b= a1.length;
        arraylist arrr = new arraylist();
        for(int i = 0;i<a;i++){
            for(int j=i+1;j<a;j++){
                if(arr[i]==arr[j]){
                    // for(int k =0;k<b; k++){
                    a1[i] = arr[i];
                    // }
                    // a1[0] = arr[i];
                }
            }
        }
        return a1;
    }
    public static void main(String[] args) {
        System.out.println("enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("enter the element of array: ");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        printarr(arr);
        System.out.println();
        int[] b = dupli_ele_arr(arr);

        printarr(b);
    }
}
