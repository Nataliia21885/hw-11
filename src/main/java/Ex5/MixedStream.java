package Ex5;

import java.util.Iterator;
import java.util.stream.Stream;

public class MixedStream {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        Stream.Builder<T> builder = Stream.builder();

        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            builder.add((T) firstIterator.next());
            builder.add((T) secondIterator.next());
        }
        return builder.build();
    }
}
