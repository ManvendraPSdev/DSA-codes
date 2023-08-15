
// Given a string s consisting of words and spaces, return the length of the last word in the string.
// A word is a maximal substring consisting of non-space characters only

public class string_length_of_last_word {

    static int lengthOfLastWord(String s) {
        int lenght_of_last_word = 0;
        for(int i=s.length()-1 ; i >= 0 ; i--){
            if(s.charAt(i) != ' '){
                lenght_of_last_word++;
            }
            else{
                if(lenght_of_last_word>0){
                    return lenght_of_last_word;
                }
            }
        }
//             The `else` statement in the code is responsible for handling the case when a space character is encountered in the string while iterating from right to left. 

// Here's how the `else` statement works:

// 1. If the current character at index `i` is a space:
//    - It checks if `length_of_last_word` is greater than 0, which means we have encountered characters before this space.
//    - If `length_of_last_word` is greater than 0, it means we have already counted the characters of the last word.
//    - In that case, it immediately returns the value of `length_of_last_word` because we have found the last word's length.
//    - If `length_of_last_word` is 0, it means we haven't encountered any characters yet after the last word, so we continue the loop.

// The purpose of this `else` statement is to handle cases where there might be trailing spaces after the last word in the string. It ensures that the length of the last word is returned correctly, even if there are additional spaces after it.

// Without this `else` statement, the code might incorrectly return 0 as the length of the last word if there are trailing spaces.
        return lenght_of_last_word;
    }
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(lengthOfLastWord(str));
    }
}
