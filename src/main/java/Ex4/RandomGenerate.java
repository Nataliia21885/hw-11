package Ex4;

import java.math.BigInteger;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class RandomGenerate {

    public Stream<Long> streamFunc(long a, long c, long m, long seed) {

        BigInteger bigA = BigInteger.valueOf(a);
        BigInteger bigC = BigInteger.valueOf(c);
        BigInteger bigM = BigInteger.valueOf(m);
        BigInteger bigSeed = BigInteger.valueOf(seed);

        if (m >= 2 && a >= 0 && a < m && c >= 0 && c < m && seed >= 0 && seed < m) {
            UnaryOperator<BigInteger> generator = x -> bigA.multiply(x).add(bigC).mod(bigM);
            return Stream.iterate(bigSeed, generator).map(BigInteger::longValue);
        } else {
            throw new RuntimeException("Incorrect parameters");
        }
    }
}



