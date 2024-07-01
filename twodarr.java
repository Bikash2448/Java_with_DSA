import java.util.Scanner;

public class twodarr {
    public static void main(String[] args) {
        // int[][] arr = new int[2][3];
        // arr[0][0]=1;
        // arr[0][1]=2;
        // arr[0][2]=3;
        // arr[1][0]=4;
        // arr[1][1]=5;
        // arr[1][2]=6;
        // int[][] arr={{1,2,3},{4,5,6},{7,8,9},{11,12,13},{14,15,16}};
        // System.out.println(arr.length);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row size of Array: ");
        int a=sc.nextInt();
        System.out.println("enter column size of Array: ");
        int b=sc.nextInt();
        int[][] arr = new int[a][b];
        System.out.println("Enter element of array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Array is: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
