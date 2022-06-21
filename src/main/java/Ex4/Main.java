package Ex4;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        RandomGenerate randomGenerate = new RandomGenerate();

        randomGenerate.streamFunc(25214903917L, 11, (long) Math.pow(2, 48), 0)
                .limit(10)
                .map(String::valueOf)
                .forEach(System.out::println);
    }
}