package easy_strings;

/*
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
 */
public class ReverseString {
    public static void reverseString(char[] s) {
        for(int i = 0, j = s.length - 1; i < s.length && j > i; i++, j--) {
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
        }
    }

    public static void main(String[] args) {
        char[] input = new char[] {'h','e','l','l','o'};
        reverseString(input);
        for(char c: input) {
            System.out.print(c + ", ");
        }
    }
}
