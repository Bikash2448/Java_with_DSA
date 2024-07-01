public class arrpac2 {
    public static void shorted(int[] arrr){
        int count=0;
        for(int i=0;i<arrr.length;i++){
            if(arrr[i]==0){
                count++;
            }
        }
        for(int i=0;i<arrr.length;i++){
            if(count>i){
                arrr[i]=0;
            }
            else{
                arrr[i]=1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={0,1,0,0,1,1,1,0,1,0,0};
        shorted(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
