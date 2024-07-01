public class Display_Arr {
    static void print_arr(int[] arr, int index){
        if (index == arr.length) {
            return ;
        }
        System.out.print(arr[index]+" ");
        print_arr(arr, index+1);
        // System.out.print(arr[index]+" ");
        
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,7,9,5,3,1};
        print_arr(arr, 0);
    }
}