import java.util.Scanner;

public class rotatearrr {
    public static void printarr(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int[][]arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public static void reversearr(int[] arr){
        int x=0; 
        int y=arr.length-1;
        while (x<y) {
            int temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
            x++;
            y--;
        }
    }
    public static void rotate_90Deg(int[][]arr){
        transpose(arr);
        for(int i=0;i<arr.length;i++){
            reversearr(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of Array: ");
        int a=sc.nextInt();
        int[][] arr = new int[a][a];
        System.out.println("Enter the element of Array: ");
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        printarr(arr);
        System.out.println();
        transpose(arr);
        // System.out.println("Reverse of Array is: "+arr);
        printarr(arr);
        System.out.println();
        rotate_90Deg(arr);
        printarr(arr);
    }
}
