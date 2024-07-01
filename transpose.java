import java.util.Scanner;

public class transpose {
    public static void transposee(int[][] arr2,int a,int b ){
        for(int i=0;i<a;i++){
            for(int j=i;j<b;j++){
                int temp =arr2[i][j];
                arr2[i][j]=arr2[j][i];
                arr2[j][i]=temp;

            }
        }
        printarr(arr2);
    }
    public static void printarr(int[][] arr2){
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] arr= new int[3][3];
        System.out.println("Enter 9 element of Array: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        printarr(arr);
        System.out.println();
        transposee(arr, 3, 3);
    }
}
