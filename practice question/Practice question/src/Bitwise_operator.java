// Explaination in notes 

// Finding the number is even or odd by using bitwise operator

class Bitwise_operator{

    static boolean isOdd(int num){
        return (num & 1)==1 ;   // Means if number & == 1 it give true(it is odd) else false(it is even) 
    }
    public static void main(String[] args) {
        int num = 68;
        System.out.println(isOdd(num));
    }
}