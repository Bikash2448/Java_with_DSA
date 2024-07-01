import java.util.Scanner;

public class arr_pair_sum {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void receiveinput(int[] arrr){
        System.out.println("Enter the element of array: ");
        for(int i=0;i<arrr.length;i++){
            Scanner sc = new Scanner(System.in);
            arrr[i]=sc.nextInt();
        }
    }
    public static int pairsum(int[]arr2,int target){
        int n = arr2.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr2[i]+ arr2[j]== target){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.print("Enter the size: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr=new int[a];
        System.out.println(arr.length);
        receiveinput(arr);
       printarr(arr);
       System.out.println("Enter the sum of target: ");
       int m = sc.nextInt();
       System.out.println(pairsum(arr, m));
    }
}
