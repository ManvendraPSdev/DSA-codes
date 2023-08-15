class Roman_to_Integer {

    // public int romanToInt(String s) {
    // int ans = 0; // to store the answer
    // int previous_num = 0; // to keep the trak of all the iterated number
    // for (int i = s.length() - 1; i >= 0; i--) {

    // int current_num = 0; // to keep the track of all the current number
    // switch (s.charAt(i)) {
    // case 'I':
    // current_num = 1;
    // break;
    // case 'V':
    // current_num = 5;
    // break;
    // case 'X':
    // current_num = 10;
    // break;
    // case 'L':
    // current_num = 50;
    // break;
    // case 'C':
    // current_num = 100;
    // break;
    // case 'D':
    // current_num = 500;
    // break;
    // case 'M':
    // current_num = 1000;
    // break;
    // }
    // if(previous_num<current_num){
    // ans = ans + current_num ;
    // }
    // else{
    // ans = ans - current_num;
    // }
    // }
    // return ans;
    // }

    public static void main(String[] args) {

    }
}

class Solution {
    public int romanToInt(String s) {
        int ans = 0; // to store the answer
        int previous_num = 0; // to keep the trak of all the iterated number
        for (int i = s.length() - 1; i >= 0; i--) {

            int current_num = 0; // to keep the track of all the current number
            switch (s.charAt(i)) {
                case 'I':
                    current_num = 1;
                    break;
                case 'V':
                    current_num = 5;
                    break;
                case 'X':
                    current_num = 10;
                    break;
                case 'L':
                    current_num = 50;
                    break;
                case 'C':
                    current_num = 100;
                    break;
                case 'D':
                    current_num = 500;
                    break;
                case 'M':
                    current_num = 1000;
                    break;
            }
            if (previous_num < current_num) {
                ans = ans + current_num;
            } else {
                ans = ans - current_num;
            }
        }
        return ans;
    }
}