import java.lang.reflect.Array;
import java.util.Scanner;

public class arr_reference {
    public static int[] print_array(int arr[],int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        int[] new_arr = new int[count];
        int indexx = 0;
        for(int i=0;i<arr.length;i++){
            //System.out.print(arr[i]+ " ");
            if(arr[i]>x){
                //int indexx = 0;
                new_arr[indexx]=arr[i];
                indexx ++;
                //int greater_no = arr[i];
            }
            
        }
        //System.out.println(new_arr);
        
        return new_arr;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,6,3,4,5,7,8,9,4,5,1,2,1,4,4,5,6,7,8,4,1,21,6,22,5};
        System.out.println("enter the number what you want to coumt: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[]result = print_array(arr, x);
        System.out.println("Greater no is : ");
        for(int i=0;i<result.length;i++){
            System.out.print(" "+result[i]);
        }
    }
}
    

