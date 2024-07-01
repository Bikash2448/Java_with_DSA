public class Quick__sort {
    public static void print_arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void swap(int[] arr, int first_ele, int sec_ele){
        int temp = arr[first_ele];
        arr[first_ele]=arr[sec_ele];
        arr[sec_ele]=temp;
    }
    public static void quickk_sort(int[] arr,int st,int end){
        if(st>=end){
            return;
        }
        int pivot = partitation(arr,st,end);
        quickk_sort(arr, st, pivot-1);
        quickk_sort(arr, pivot+1, end);

    }
    private static int partitation(int[] arr, int st, int end) {
       int pvt = arr[st];
       int cnt = 0;
       for(int i=st+1;i<=end;i++){
        if (arr[i]<=pvt) {
            cnt++;
        }
       }
       int pivot_index = st+cnt;
       swap(arr, st, pivot_index);
       
       int i=st, j=end;
       while (i<pivot_index && j>pivot_index) {
        while (arr[i]<=pvt) {
            i++;
        }
        while (arr[j]>pvt) {
            j--;
        }
        if (i<pivot_index && j>pivot_index) {
            swap(arr, i, j);
            i++;
            j--;
        }
       }



       return pivot_index;
    }
    public static void main(String[] args) {
        int[] arr = {8,6,4,2,1,3,5,7,9,28,48,21,22,80,24};
        quickk_sort(arr, 0, arr.length-1);
        print_arr(arr);
    }
}
