/*
package codewars.sixKu.seven_ku;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

*/
/*
Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.

If you want to know more: http://en.wikipedia.org/wiki/DNA

In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your function receives one side of the DNA (string, except for Haskell); you need to return the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)

Example: (input --> output)

"ATTGC" --> "TAACG"
"GTAT" --> "CATA"
 *//*

public class DnaStrand {
    public static String makeComplement(String dna) {
        Map<Character, Character> complimentarySymbols = new HashMap<>();
        complimentarySymbols.put('A', 'T');
        complimentarySymbols.put('T', 'A');
        complimentarySymbols.put('C', 'G');
        complimentarySymbols.put('G', 'C');
        StringBuilder complimentaryDna = new StringBuilder();
        for(Character c : dna.toCharArray()) {
            Character cc = complimentarySymbols.get(c);
            if(cc != null) {
                complimentaryDna.append(cc);
            } else {
                complimentaryDna.append(c);
            }
            ///if(complimentarySymbols.get(c) )
        }

        return complimentaryDna.toString();
    }

    static void main() {
        //StringBuilder builder = new StringBuilder("ehT kciuq nworb xof spmuj revo eht yzal .god\"");

        assertEquals("double  spaces", DnaStrand.reverseWords("elbuod  secaps"), "Input: The quick brown fox jumps over the lazy dog.");
        //ehT kciuq nworb xof spmuj revo eht yzal .god
    }

    static String reverseWords(String original) {
        String[] words = original.split(" ", -9);
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < words.length; i++) {
            result.append((new StringBuilder(words[i])).reverse());
            if( i < words.length - 1) {
                result.append(' ');
            }
        }
        return result.toString();
    }
}*/
