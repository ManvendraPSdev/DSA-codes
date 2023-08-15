public class String_performance {
    public static void main(String[] args) {
        String series = "";
        for(int i=0 ; i<26 ; i++){
            char ch = (char)('a' + i);

            System.out.println(ch);

            series = series + ch;   // series += ch
// Series is the empty String in Which we are adding all the Character which are Storing in ch 
        }
        System.out.println(series);
    }
}
