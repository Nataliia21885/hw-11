package Ex1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Nataliia", "Svitlana", "Roman", "Volodimir");
        String res =
                IntStream.range(0, list.size())
                        .filter(i -> i % 2 == 0)
                        .mapToObj(i -> String.format("%d. %s", i + 1, list.get(i)))
                        .collect(Collectors.joining(", "));
        System.out.println(res);
    }
}

