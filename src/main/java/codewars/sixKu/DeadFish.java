package codewars.sixKu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Create a parser to interpret and execute the Deadfish language.

Deadfish operates on a single value in memory, which is initially set to 0.

It uses four single-character commands:

i: Increment the value
d: Decrement the value
s: Square the value
o: Output the value to a result array
All other instructions are no-ops and have no effect.

Examples
Program "iiisdoso" should return numbers [8, 64].
Program "iiisdosodddddiso" should return numbers [8, 64, 3600].


 */
public class DeadFish {
    public static int[] parse(String data) {
        int result = 0;
        List<Integer> output = new ArrayList<>();
        for(char c: data.toCharArray()) {
            switch (c) {
                case 'i' -> result++;
                case 'd' -> result--;
                case 's' -> result = result * result;
                case 'o' -> output.add(result);
            }
        }
        int[] outputArr = new int[output.size()];
        for(int i = 0;i < output.size(); i++) {
            outputArr[i] = output.get(i);
        }
        return outputArr;
    }

    static void main() {
        //Stream.of(parse("iiisdosodddddiso")).forEach(System.out::print);
        //System.out.println(parse("iiisdosodddddiso"));
        /*int[] result = parse("iiisdoso");
        for(int i: result) {
            System.out.print(i + " ");
        }*/
        System.out.println(Arrays.toString(parse("iiisdoso")));
    }
}

