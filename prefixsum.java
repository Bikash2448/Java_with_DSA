public class prefixsum {
    // public static int[] prefix(int[] arr2){
    //     int n = arr2.length;
    //     int pre[]=new int[n];
    //     pre[0]=arr2[0];
    //     for(int i=1;i<arr2.length;i++){
    //         pre[i]=pre[i-1]+arr2[i];
    //     }
    //     return pre;
    // }
    // public static void prefix(int[]arr){
    //     int pre[]=new int[arr.length];
    //     pre[0]=arr[0];
    //     prefix(pre[i]=pre[i-1]+arr[i]);

    // }
    public static void prefixx(int[] arr2){
        int n= arr2.length;
        for(int i=1;i<n;i++){
            arr2[i]=arr2[i-1]+arr2[i];
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        prefixx(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
