public class Find_max {
    static int max_element(int[] arr, int index){
        if (index == arr.length-1) {
            return arr[index];
        }
        int maxxc = max_element(arr, index+1);
        return Math.max(maxxc,arr[index]);
        
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,7,9,5,3,1};
        int a =max_element(arr, 0);
        System.out.println(a);
    }
}
