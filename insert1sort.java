public class insert1sort {
    public static void insert(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int temp = arr[i];
            int j = i-1;
            while (j>-1 && temp<arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;

        }
    }
    public static void print_arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {44,54,5,2,4,21,24,7,1,3};
        insert(arr);
        print_arr(arr);
    }
}
