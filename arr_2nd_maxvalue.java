public class arr_2nd_maxvalue {
    public static int max_value(int[]arr2){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]>max){
                max = arr2[i];
            }
        }
        return max;
    }
    public static int sec_large_value(int[] arr2){
       int max= max_value(arr2);
       //max=Integer.MIN_VALUE;
       //int sec_large_val = 0;
       for(int i=0;i<arr2.length;i++){
        if(arr2[i]==max){
            arr2[i]=Integer.MIN_VALUE;
           // sec_large_val=arr2[i];
        }
       }
       int a =max_value(arr2);
       return a;
       }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(sec_large_value(arr));
    }
}
