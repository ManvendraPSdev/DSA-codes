public class Bitwise_operator_nonDublicateNumber {

    static int Non_Dublicate(int arr[]) {
        int ans=0;
        for (int i = 0; i < arr.length ; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2,3,4,4,3,2,5 };
        System.out.println(Non_Dublicate(arr));
    }
}
