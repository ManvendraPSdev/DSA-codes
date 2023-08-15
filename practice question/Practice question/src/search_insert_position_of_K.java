

// Given a sorted array arr[] consisting of N distinct integers and an integer K, the task is to find the index of K,
//  if it’s present in the array arr[]. Otherwise, find the index where K must be inserted to keep the array sorted


import java.util.*;
public class search_insert_position_of_K {

    static int Ans(int arr[] , int K , int n){
        int start =0;
        int end = n;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(K>arr[mid]){
                start = mid+1;
            }
            else if(K<arr[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] =  {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 89};

        System.out.println("Enter the number you want to search");
        int target = sc.nextInt();

        System.out.println("Enter the number of element there in the Array");
        int n= sc.nextInt();
        
        System.out.println(Ans(arr , target, n));
    }
}
