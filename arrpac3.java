public class arrpac3 {
    public static void swap(int[] arrr,int a,int b){
        int temp;
        temp=arrr[a];
        arrr[a]=arrr[b];
        arrr[b]=temp;
    }
    public static void evenfirst(int[] arrr){
        int n= arrr.length;
        int a=0;
        int b =n-1;
        while(a<b){
            if(arrr[a]%2==1 && arrr[b]%2==0){
                swap(arrr,a, b);
                a++;
                b--;
            }
            if(arrr[a]%2==0){
                a++;
            }
            if(arrr[b]%2==1){
                b--;
            }
        }
       
    }
    public static void main(String[] args) {
        int[] arr= {21,1,2,3,4,5,6,7,8,9,13,15};
        evenfirst(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
