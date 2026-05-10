package easy_strings;

public class StrStr {

    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for (int lw = 0; lw <= n - m; lw++) {
            int rw = 0;
            while (rw < m && haystack.charAt(lw + rw) == needle.charAt(rw)) {
                rw++;
            }
            if (rw == m) {
                return lw;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("happy_sad", "sad"));
    }
}
