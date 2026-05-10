package codewars.sixKu.seven_ku;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

/*
highAndLow("1 2 3 4 5") // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"

 */
public class HighAndLow {

    public static String highAndLow(String numbers) {
        IntSummaryStatistics statistics = Stream.of(numbers.split(" ")).mapToInt(s -> {
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                throw new RuntimeException("Во входной строке обнаружено не числовое значение: '" + s + "'");
            }

        }).summaryStatistics();
        Stream<Integer> stream = Stream.of(1, 2);

        //@Override
        stream.sorted(Integer::compare);
        return statistics.getMax() + " " + statistics.getMin();
    }

    static void main() {
        System.out.println(highAndLow(""));
    }
}
