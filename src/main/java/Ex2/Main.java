package Ex2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Nataliia", "Svitlana", "Roman", "Volodimir");
        List sortedResult =
                list.stream()
                        .map(r -> r.toUpperCase())
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());
        System.out.println(sortedResult);
    }
}
