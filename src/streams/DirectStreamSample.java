package streams;

import java.util.stream.Stream;

public class DirectStreamSample {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .map((num) -> num * 2)
                .forEach(System.out::println);
    }
}
