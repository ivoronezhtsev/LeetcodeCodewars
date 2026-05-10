package t1;

public class Test {
    void main(String[] args) {
        int[] nums = {2, 7, 11, 15};

    }
    public static void validateEmail(String email){
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@";
        System.out.println(email.matches(regex));


    }
}
