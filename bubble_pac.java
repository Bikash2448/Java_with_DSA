public class bubble_pac {
    public static void bubb(int[] arr){
        int n = arr.length;
        for(int i =0;i<n;i++){
            for(int j= 1;j<n;j++){
                if (arr[j-1]>arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]= temp;
                }
            }
        }

    }
    public static void print_arr(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,1,9,6,4,2,45,14,78,28};
        bubb(arr);
        print_arr(arr);
    }
}
