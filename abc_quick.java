public class abc_quick {
    public static void print_arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void swap(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]=temp;
    }
    public static void quick_sort(int[] arr, int st,int end){
        if(st>=end){
            return;
        }
        int pvt_index =partation(arr,st,end);
        quick_sort(arr, st, pvt_index-1);
        quick_sort(arr, pvt_index+1, end);
    }
    public static int partation(int[] arrr,int st,int end){
        int pivot_element = arrr[st];
        int count = 0;
        for(int i=st+1;i<=end;i++){
            if (pivot_element>=arrr[i]) {
                count++;
            }
        }
        int pivot_index = st+count;
        swap(arrr, st, pivot_index);
        int i=st,j=end;
        while (i<pivot_index && j>pivot_index) {
            while (arrr[i]<=arrr[pivot_index]) {
                i++;
            }
            while (arrr[j]>arrr[pivot_index]) {
                j--;
            }
            if (i<pivot_index && j>pivot_index) {
                swap(arrr,i , j);
                i++;
                j--;
            }
        }
        return pivot_index;
    }
    
    public static void main(String[] args) {
        int [] arrr = {3,4,1,2,5,54,12,87,51,60,22,11,45,65,22};
        quick_sort(arrr, 0, arrr.length-1);
        // partation(arrr, 0, 0)
        print_arr(arrr);
    }
}
