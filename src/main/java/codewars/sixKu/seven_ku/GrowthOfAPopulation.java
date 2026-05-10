/*
package codewars.sixKu.seven_ku;

import org.junit.jupiter.api.Assertions;

*/
/*
In a small town the population is p0 = 1000 at the beginning of a year.
The population regularly increases by 2 percent per year and moreover 50 new inhabitants
per year come to live in the town.
How many years does the town need to see its population greater than or equal to p = 1200 inhabitants?
 *//*

public class GrowthOfAPopulation {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int population = p0;
        int yearCount = 0;
        while (population < p) {
            population += (int) (population * percent / 100);
            population += aug;
            yearCount++;
        }
        return yearCount;
    }

    static void main() {
        */
/*
        nb_year(1500, 5, 100, 5000) -> 15
nb_year(1500000, 2.5, 10000, 2000000) -> 10
         *//*

        Assertions.assertEquals(15, nbYear(1500, 5, 100, 5000));
        Assertions.assertEquals(10, nbYear(1_500_000, 2.5, 10000, 2_000_000));
    }
}
*/
