import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer nam : nums) {
            if (nam % 2 != 0) {
                System.out.print(nam + " ");
            }
        }

        System.out.println();
        System.out.println("Задача 2");
        Set<Integer> set = new TreeSet<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer nam : set) {
            if (nam % 2 == 0) {
                System.out.print(nam + " ");
            }
        }

        System.out.println();
        System.out.println("Задача 3");
        Set<String> words = new TreeSet<>(List.of("один", "два", "два", "волна", "волна", "семь"));
        for (String word : words) {
            if (Collections.frequency(words, word) == 1) {
                System.out.print(word + " ");
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        Map<String, Integer> map = new TreeMap<>((Map) Map.of("один", "два", "два", "волна", "волна", "семь"));
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.replace(word, map.get(word) + 1);
            }
            System.out.println(map);
        }
    }

}
