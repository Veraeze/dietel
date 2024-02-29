package streams;

import java.util.List;

public class CollectionStreamSample {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        numbers.stream()
               .filter((number) -> number%2==0)
               .map((number) -> number * number)
               .forEach(System.out::println);
    }
}
