import java.util.*;
import java.lang.*;
import java.io.*;

/*package whatever //do not write package name here */
class GFG {
    static int GO(int A, int B, int C, int N) {
        if (N == 1) {
            return A;
        } else if (N == 2) {
            return B;
        } else if (N == 3) {
            return C;
        } else {
            return GO(N - 1 , A, B,C) + GO(A,B,C,N - 2) + GO(A,B,C,N - 3);
        }
    }

    public static void main(String[] args) {
        // code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i <= t; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int N = sc.nextInt();
            System.out.println(GO(A, B, C, N));
        }

    }
}