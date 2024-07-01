import java.util.Scanner;

public class arrprefixsum {
    public static int[] prefixx(int[] arrr){
        int n= arrr.length;
        int[] ans= new int[n];
        ans[0]=arrr[0];
        for(int i=1;i<n;i++){
            ans[i]= ans[i-1]+arrr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        // System.out.println("Enter size of array: ");
        // Scanner sc= new Scanner(System.in);
        // int a =sc.nextInt();
        // int[] arr= new int[a];
        // System.out.println("Enter the element of array");
        // for(int i=0;i<a;i++){
        // arr[i]=sc.nextInt();
        // }
        int[] arr={1,2,3,4,5,6,7,8};
        System.out.print("Original Array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[]ans=prefixx(arr);
        System.out.print("Prefix_sum array is: ");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
        System.out.println("ans of zero: "+ans[1]);
        System.out.println("Enter the first index: ");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter the last index: ");
        int b=sc.nextInt();
        int c= ans[b]-ans[a-1];
        System.out.println("Sum of first index to last index is: "+c);
    }
}
