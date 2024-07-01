public class selection {
    public static void selectsort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    min = j;
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }

        }
    }

    public static void print_arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 8, 6, 4, 9, 7, 87 };
        selectsort(arr);
        print_arr(arr);
    }
}
