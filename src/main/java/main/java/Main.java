public class Main {

    public static void main(String[] args) {
        int[] a = new int[26];
        for (int i : a) {
            System.out.printf(i + " ");
        }
        System.out.println(a[27]);
    }
}