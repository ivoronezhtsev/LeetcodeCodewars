public class IsPailndrom {

    public static boolean isPalindrome(int x) {
        String string = "" + x;
        for (int l = 0, r = string.length() - 1; l < r; l++, r--) {
            if (string.charAt(l) != string.charAt(r)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

}
