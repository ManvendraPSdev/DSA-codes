// Some of the placeholders are :-

// b	For formatting an argument that is Boolean
// c	For formatting an argument that is a Unicode character
// s	For formatting an argument that is a string
// d	For formatting an argument that is a decimal integer
// f	For formatting an argument that is a number with a decimal point
// %	For printing only % for the argument, ‘%’
// n	To cause the rest of the text on its right, to go on the next line at the output

public class preety_printing {
    public static void main(String[] args) {
        float a = 14.298f; 
        System.out.printf("formated number %.2f \n",a );     // % is the placeholder means with the help of this we can adjust 
        // the number and print this upto what decimal places we want to print and  
        // (.2f) means upto this decimal place we have to print the number in place of .2 it could be anything .



        // 1)  using comma(,) in place of + sign 
        // 2) despite of writing println writing printf because we have to print the number in format 


        System.out.println(Math.PI);   // Math is the class 
        // Now we do not want this whole value of pi let say we need only upto 2 decimal places

        System.out.printf("formated value of pi is %.2f \n", Math.PI);


        // For String  the place holder for String is %s
        System.out.printf("Hello my name is %s and I am %s", "Manvendra" , "a Java Expert");
    }
    
}
