package kunal_bootcamp_git_hub_question;
import java.util.*;
public class pick_correct_number {
    static int Binary_Search(int T) {
        int start = 1;
        int end = T;
        while (start <= end) {

            int mid = start + (end - start) / 2;
            System.out.println(mid);
            if (T > mid) {
                start = mid + 1;
            } else if (T < mid) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }
    static int PR(int You_choose){
        int Ichoose = Binary_Search(You_choose);
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if (Ichoose> T){
            return -1;
        }
        else if(Ichoose<T){
        return 1;
        }
        else{
            return 0;
        }
        
    }
    

    public static void main(String[] args) {
        int You_choose = 6;
        System.out.println(PR(You_choose));
    }
}
