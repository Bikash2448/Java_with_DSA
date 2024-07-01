public class selection_pac {
    public static void select(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int min =i;
            for(int j=i+1;j<n;j++){
                if (arr[i]>arr[j]) {
                    min=j;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
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
        select(arr);
        print_arr(arr);
    }
}
