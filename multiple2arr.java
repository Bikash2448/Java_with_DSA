import java.util.Scanner;

public class multiple2arr {
    public static int[][] multiple(int[][] arr,int a, int b,int[][]arr1,int c, int d){
        int ans[][]=new int[a][d];
        if(b!=c){
            System.out.println("Multiplication not possible....");
        }else{
            for(int i=0;i<a;i++){
                for(int j=0;j<d;j++){
                    for(int k=0;k<b;k++){
                        ans[i][j] += arr[i][k]+arr1[k][j];
                        
                    }
                }
            }
        }
        return ans;
    }
    public static void print2darr(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row and column size of 1st Array: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[][] arr = new int[a][b];
        System.out.println("Enter element of array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter Row and column size of 2nd Array: ");
        int c=sc.nextInt();
        int d=sc.nextInt();
        int[][] arr2=new int[c][d];
        System.out.println("Enter element of array: ");
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        print2darr(arr);
        System.out.println();
        print2darr(arr2);
       int[][] anss= multiple(arr, a, b, arr2, c, d);
       System.out.println("This is the multiplication of two array: ");
       print2darr(anss);
    }
}
