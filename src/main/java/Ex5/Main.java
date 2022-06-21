package Ex5;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Main {
    public static void main(String[] args) {
        List<String> result;
        MixedStream mixedStream = new MixedStream();

        Stream<Integer> stream1 = Stream.of(1, 3, 5, 7, 9, 11);
        Stream<Integer> stream2 = Stream.of(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);

        result = mixedStream.zip(stream1, stream2)
                .map(String::valueOf)
                .collect(Collectors.toList());
        Collections.shuffle(result);
        System.out.println(result);
    }
}
