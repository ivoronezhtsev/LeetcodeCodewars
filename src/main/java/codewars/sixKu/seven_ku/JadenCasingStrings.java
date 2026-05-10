/*
package codewars.sixKu.seven_ku;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class JadenCasingStrings {

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        String[] words = phrase.split(" ");

        for (int i = 0; i < words.length; i++) {
            if(!words[i].isEmpty()) { //Если двойной пробел в строке, то здесь может быть "" и будет IndexOutOfBoundException на charAt(0)
                result.append(Character.toUpperCase(words[i].charAt(0)));
                result.append(words[i].substring(1));
            }
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    static void main() {
        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", "Most Trees Are Blue", JadenCasingStrings.toJadenCase("most trees are blue"));
    }
}
*/
