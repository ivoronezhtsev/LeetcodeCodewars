/*
package codewars.sixKu;

import static org.junit.jupiter.api.Assertions.assertEquals;

*/
/*
"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""
 *//*

public class BreakCamelCasingTodo {

    public static String camelCase(String input) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(Character.isUpperCase(c)) {
                result.append(' ');
            }
            result.append(c);
        }
        return result.toString();
    }

    static void main() {
        assertEquals( "Incorrect", "camel Casing", camelCase("camelCasing"));
        assertEquals( "Incorrect", "camel Casing Test", camelCase("camelCasingTest"));
        assertEquals( "Incorrect", "camelcasingtest", camelCase("camelcasingtest"));

    }
}
*/
