
// Linear reccurence relation with the help of the Mathematical form 
// Finding the nth Fibonacci number  With the help of the form 

public class Linear_ReccurenceRelation_IMPORTANTQUESTION {

    static int fiboFormula(int n) {
        return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - (Math.pow(((1 - Math.sqrt(5)) / 2), n))) / Math.sqrt(5));

        // This formula is totally proven in your register

    }

    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            System.out.println(fiboFormula(i));

        }
    }
}
