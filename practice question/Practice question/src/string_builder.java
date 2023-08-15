// String Builder is mutable data type 

public class string_builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(); // Creating the variable name builder of data type StringBuilder
        // In StringBuilder there is no need of creating the new String Objects Again and Again we can add the new character into
        // the old one 

        for(int i=0 ; i<26 ; i++){
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
    }
}
