public class pac_algo {
    public static void print_arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void merge_sort(int[] arr,int l,int m){
        if (l<m) {
            int mid = (l+m)/2;
            merge_sort(arr, l, mid);
            merge_sort(arr,mid+1,m);
            merge(arr,l,mid,m);
        }
    }
    private static void merge(int[] arr, int l, int mid, int m) {
        int n1 =mid+1-l;
        int n2 =m-mid;
        int[] leftarr = new int[n1];
        int[] rightarr = new int[n2];
        for(int i=0;i<n1;i++){
            leftarr[i]=arr[l+i];
        }
        for(int j =0;j<n2;j++){
            rightarr[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=l;
        while (i<n1 && j<n2) {
            if (leftarr[i]<=rightarr[j]) {
                arr[k++]=leftarr[i++];
            }else{
                arr[k++]=rightarr[j++];
            }
        }
        while (i<n1) {
            arr[k++]=leftarr[i++];
        }
        while (j<n2) {
            arr[k++]=rightarr[j++];
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,6,2,4,7,1,3,9,6};
        merge_sort(arr, 0, arr.length-1);
        print_arr(arr);
    }
}
