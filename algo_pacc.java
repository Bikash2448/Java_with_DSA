public class algo_pacc {
    public static void print_arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void bubb_sort(int[] arr){
        int n = arr.length;
        for(int i =0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arrr = {7,2,9,4,1,6,22,24,16,48,36,8};
        bubb_sort(arrr);
        print_arr(arrr);
    }
}
