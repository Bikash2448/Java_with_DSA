public class alogo_pac {
    public static void print_arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void selection_sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min_index =i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[min_index]>arr[j]) {
                    min_index=j;
                }
            }
            int temp = arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arrr = {7,2,9,4,1,6,22,24,16,48,36,8};
        selection_sort(arrr);
        print_arr(arrr);
    }
}
