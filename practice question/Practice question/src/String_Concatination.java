

import java.util.ArrayList;

public class String_Concatination {
    public static void main(String[] args) {
        
        System.out.println('a' + 'b');   // When we concatinate the character of the String then
        //  the ASCII values of those character get Added

        System.out.println("a"+"b");   // " " Used for String  ' ' used for Character 

        System.out.println('a' + 3);  // ASCAII value of a is 97 when 3 get added to it then it become 100 Which is d

        System.out.println((char)('a' + 3)); // This will print the character having ASCAII value 100

        System.out.println("a" + 1);
        // Here this same as after the few steps : "a" + "1" because 
        // internally integer get converted into Integer that will call toString ()

        System.out.println("Mannu" + new ArrayList<>());
        // Concatinating the String with Array list (write now the ArrayList is empty )

        // System.out.println(new ArrayList<>() + new Integer (56));
// Here this will give error because ,The operator + is only defined when one of them is primitive data type and other is String 

    }
}
