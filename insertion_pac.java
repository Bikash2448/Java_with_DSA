public class insertion_pac {
    public static void print_arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void insertt(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int temp = arr[i];
            int j = i-1;
            while (j>-1 && arr[j]>arr[i]) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]= temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,1,9,6,4,2,45,14,78,28};
        insertt(arr);
        print_arr(arr);
    }
}
