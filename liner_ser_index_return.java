public class liner_ser_index_return {
    static void search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }

        if (arr[index] == target) {
            // return index;
            System.out.print(index+" Love you ");
        }

        
        search(arr, target, index + 1);
        // return a;
        // if (a > 0) {
        //     return a;
        // } else {
        //     return -1;
        // }
    }

    public static void main(String[] args) {
        int[] arr = { 2,  6,4,1, 8, 7,1,2,8,5,4,6,9,5,2, 9, 5, 3, 1 };
        search(arr, 2, 0);
        // System.out.println(n);
    }
}
