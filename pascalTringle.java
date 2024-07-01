import java.util.Scanner;

public class pascalTringle {
    public static void print_Array(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] pascalArray(int n){
        int[][] array = new int[n][];
        for(int i=0;i<n;i++){
            array[i]=new int[i+1];
            array[i][0]=array[i][i]=1;
            for(int j=1;j<i;j++){
                array[i][j]=array[i-1][j]+array[i-1][j-1];
            }
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Row size of Array: ");
        int n = sc.nextInt();
        int[][] ans=pascalArray(n);
        print_Array(ans);

    }
}
