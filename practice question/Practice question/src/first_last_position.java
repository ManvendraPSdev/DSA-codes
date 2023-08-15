
public class first_last_position {
    public static int[] searchRange(int[] num, int target){

        int[] ans = {-1, -1};

        int start = search(num, target, true);   // for first occurrence
        int end = search(num, target, false);  // for last occurrence

        ans[0] = start;  // store the index of the first occurrence of the target
        ans[1] = end;    // store the index of the last occurrence of the target

        return ans;
    }


// Since we have to run the function twice 1st when we have to print first occurence and Second When we have to print the second occurence
// Therefore we have to make the another function , so that we can call the function twice
// this function provide us the index value 

    static int search(int[] num, int target, boolean find_start_Index) {
        int start = 0;
        int end = num.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > num[mid]) {
                start = mid + 1;
            } else if (target < num[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (find_start_Index == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] num = {1,2,2,2,4,5,6,6};
        int target = 2 ;
        int[] result = searchRange(num, target);
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }
}

// public class first_last_position {
//     public static void main(String[] args) {
//          int[] nums = {5, 7, 7, 7, 8, 8, 10, 12, 11};
//         int target = 8;
//         int[] result = searchRange(nums, target);
//         System.out.println("First Occurrence: " + result[0]);
//         System.out.println("Last Occurrence: " + result[1]);
//     }

//     public static int[] searchRange(int[] nums, int target) {

//         int[] ans = {-1, -1};
//         // check for first occurrence if target first
//         ans[0] = search(nums, target, true);
//          int start = search(nums , target , true);   // for first occurence 
//         int end = search (nums , target , false);  // for last occurence 

//         ans[0] = start ;  // here the index of first occurence of the target is get store 
//         ans[1] = end ;    // here the index of last occurence of the target is get store


//         return ans;
//     }

//     // this function just returns the index value of target
//     static int search(int[] nums, int target, boolean findStartIndex) {
//         int ans = -1;
//         int start = 0;
//         int end = nums.length - 1;
//         while(start <= end) {
//             // find the middle element
// //            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//             int mid = start + (end - start) / 2;

//             if (target < nums[mid]) {
//                 end = mid - 1;
//             } else if (target > nums[mid]) {
//                 start = mid + 1;
//             } else {
//                 // potential ans found
//                 ans = mid;
//                 if (findStartIndex) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             }
//         }
//         return ans;
//     }
// }
