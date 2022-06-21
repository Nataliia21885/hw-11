package Ex3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] list = {"1, 2, 0", "4, 5"};

        String res =  Arrays.stream(list)
                .flatMap(s -> Arrays.stream(s.split("\\W+")))
                .mapToInt(Integer::parseInt)
                .sorted()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", "));

        System.out.println(res);

    }
}
