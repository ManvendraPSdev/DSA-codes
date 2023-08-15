import java.util.*;
public class Array_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter number of col");
        int col = sc.nextInt();
        System.out.println("Enter the Elements");
        int arr[][] = new int [row][col];
        for(row = 0 ; row<arr.length ; row++){
            for(col = 0 ; col<arr[row].length ; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        System.out.println( );
        // for(row = 0 ; row<arr.length ; row++){
        //     for(col = 0 ; col<arr[row].length ; col++){
        //         System.out.print(arr[row][col]+" ");
        //     }
        //     System.out.println();
        //  }

// OR YOU CAN TRY ANYONE OF THEM

        for(row = 0 ; row<arr.length ; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        

    }
    
}
