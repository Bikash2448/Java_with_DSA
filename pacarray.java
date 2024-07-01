public class pacarray {
    public static int number(int[] arr2){
        for(int i=0;i<arr2.length;i++){
            for(int j=i+1;j<arr2.length;j++){
                if(arr2[i]==arr2[j]){
                    arr2[i]=-1;
                    arr2[j]=-1;
                }
            }
        }
        int num=0;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]>-1){
                num=arr2[i];
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1};
        System.out.println("unique element is: "+number(arr));
    }
}
