public class reversearr {
    public static void reverse(int[] arrr){
        int i = 0;
        int j = arrr.length-1;
        while(i<j){
            int temp;
            temp=arrr[i];
            arrr[i]=arrr[j];
            arrr[j]=temp;
            i++;
            j--;
        }
    }
    public static void display(int[] arrr){
        for(int i=0;i<arrr.length;i++){
            System.out.print(arrr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        display(arr);
        System.out.println();
        reverse(arr);
        display(arr);
    }
}
