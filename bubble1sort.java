public class bubble1sort {
    public static void bubb(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void print_arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int [] arrr = {5,2,8,1,9,4,6,75,11,2,1};
        bubb(arrr);
        print_arr(arrr);
    }
}
