import java.util.Scanner;

public class arr2dsum {
    public static int[][] add2array(int[][]arr,int[][]arr1, int c){
        int a = arr.length;
        int b = arr[0].length;
        int y=c;
        int[][] ans = new int[a][b];
        if(a!=y){
            System.out.println("can't add this two array.....");
        }else{
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<b;j++){
                    ans[i][j]=arr[i][j]+arr1[i][j];
                }
                System.out.println();
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
        int c=sc.nextInt();
        int[][] arr = new int[a][c];
        System.out.println("Enter element of array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Row and column size of 2nd Array: ");
        int b=sc.nextInt();
        int d=sc.nextInt();
        int[][] arr2=new int[b][d];
        System.out.println("Enter element of array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        int anss[][]=add2array(arr,arr2,c);
        System.out.println("Ans is: ");
        print2darr(anss);
       // System.out.print(print2darr(anss));

    }
}
