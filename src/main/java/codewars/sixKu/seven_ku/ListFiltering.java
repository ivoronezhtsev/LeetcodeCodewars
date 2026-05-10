package codewars.sixKu.seven_ku;

import java.util.List;
import java.util.Objects;

/*
Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
Kata.filterList(List.of(1, "a", "b", 0, 15)) => List.of(1,0,15)
Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123)) => List.of(1, 2, 123)*
 */
public class ListFiltering {

    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(o -> o instanceof Integer).toList();
    }

    public static void main(String[] args) {
        List<Object> list1 = filterList(List.of(1, 2, "a", "b"));
        List<Object> list2 = filterList(List.of(1, "a", "b", 0, 15));
        List<Object> list3 = filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123));
        System.out.println("list1");
        for(Object o1: list1) {
            System.out.println(o1);
        }
        System.out.println("list2");
        for(Object o2: list2) {
            System.out.println(o2);
        }
        System.out.println("list3");
        for(Object o3: list3) {
            System.out.println(o3);
        }
    }
}
