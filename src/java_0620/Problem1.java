package java_0620;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = numbers.stream()
                .filter(integer -> integer % 2 == 1)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}