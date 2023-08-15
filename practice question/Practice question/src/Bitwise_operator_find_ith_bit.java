public class Bitwise_operator_find_ith_bit {

    static int ith_bit(int num , int i){
        return (num&(1<<num-1));
    }
    public static void main(String[] args) {
        int num = 19;
        int i =3;
        System.out.println(ith_bit(num , i));
    }
}
