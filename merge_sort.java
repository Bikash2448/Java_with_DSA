public class merge_sort {
    public static void mergesort(int[] arr,int l,int r){
        if(l<r){
            int mid= (l+r)/2;
            mergesort(arr, l, mid);
            mergesort(arr,mid+1, r);
            merge(arr,l,mid,r);
        }
    }
    public static void merge(int arr[],int l,int mid,int r){
        int leftarray = mid-l+1;
        int rightarray = r-mid;
        int[] n1 = new int[leftarray];
        int[] n2 = new int[rightarray];
        int i,j,k;
        
        for(i=0;i<leftarray;i++){
            n1[i]=arr[l+i];
        }
        for(j=0;j<rightarray;j++){
            n2[j]=arr[mid+1+j];
        }
        i=0;
        j=0;
        k=l;
        while (i<leftarray && j<rightarray) {
            if(n1[i]<=n2[j]){
                arr[k++]=n1[i++];
            }
            else{
                arr[k++]=n2[j++];
            }
        }
        while(i<leftarray){
            arr[k++]=n1[i++];
        }
        while(j<rightarray){
            arr[k++]=n2[j++];
        }
    }
    public static void print_arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr ={5,2,8,47,52,41,21,14,22,28};
        // mergesort();
        mergesort(arr, 0, arr.length-1);
        print_arr(arr);
    }

    
}
