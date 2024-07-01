public class algo_pac {
    public static void print_arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void insert_sort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int current = arr[i];
            int j=i-1;
            while (j>-1 && current<arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
    public static void main(String[] args) {
        int[] arrr = {7,2,9,4,1,6,22,24,16,48,36,8};
        insert_sort(arrr);
        print_arr(arrr);
    }
}
