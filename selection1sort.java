public class selection1sort {
    public static void select(int[] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            int min_index = i;
            for(int j=i+1;j<n;j++){
                if(arr[min_index]>arr[j]){
                    min_index=j;
                }
            }
            int temp = arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;

        }
    }
    public static void print_arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arrr = {5,2,7,4,8,5,4,9,1};
        select(arrr);
        print_arr(arrr);
    }
}
