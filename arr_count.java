import java.util.Scanner;

public class arr_count {
    public static int[] print_array(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }

        int[] new_arr = new int[count];
        int index = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                new_arr[index] = arr[i];
                index++;
            }
        }

        return new_arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 4, 5, 7, 8, 9, 4, 5, 1, 2, 1, 4, 4, 5, 6, 7, 8, 4, 1, 21, 6, 22, 5};
        System.out.println("Enter the number you want to compare with: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int[] result = print_array(arr, x);

        System.out.println("Numbers greater than " + x + ": ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
