import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 9, 1, 2, 3, 4, 55, 4, 5, 10, 5, 6, 7));

        // Task 1
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }

        }
        System.out.println("-----------------------------");

        // Task 2
        SortedSet<Integer> numsSet = new TreeSet<>(nums);
        for (Integer integer : numsSet) {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }
        System.out.println("-----------------------------");

        // Task 3
        List<String> stringList = new ArrayList<>(List.of("igor", "ignat", "elena", "oleg", "igor", "fedor", "elena"));
        Set<String> stringSet = new HashSet<>();
        List<String> dubs = new ArrayList<>();
        for (String string : stringList) {
            if (string != null) {
                if (!stringSet.add(string)) {
                    dubs.add(string);
                }
            }
        }
        stringSet.removeAll(dubs);
        System.out.println(stringSet);
        System.out.println("-----------------------------");

        // Task 4
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Set<String> stringsSet = new HashSet<>(strings);

        for (String string : stringsSet) {
            System.out.println(Collections.frequency(strings, string));
        }
    }
}