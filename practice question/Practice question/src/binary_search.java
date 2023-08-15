import java.util.*;

public class binary_search {
    static int Binary_Search(int arr[], int target, int start, int end) {
        while (start <= end) {
            
            int mid = start + (end - start) / 2;
        
            if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the Elements");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the target element ");
        int target = sc.nextInt();

        System.out.println("Enter the start index");
        int start = sc.nextInt();

        System.out.println("Enter the End index");
        int end = sc.nextInt();
        int ans = Binary_Search(arr , start , end , target);
        System.out.println(ans);
    }
}
