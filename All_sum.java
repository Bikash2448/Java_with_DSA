public class All_sum {
    static int sum_array(int[] arr, int index){
        if (index == arr.length-1) {
            return arr[index];
        }
        int sum = sum_array(arr, index+1);
        return sum+arr[index];
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8};
        int a = sum_array(arr, 0);
        System.out.println(a);
    }
}
