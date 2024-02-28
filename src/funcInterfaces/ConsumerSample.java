package funcInterfaces;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<String> consumer = (word)->{
            System.out.println(word+ " is always having a great day");
        };
        consumer.accept("vera");

        Consumer<Boolean> consumer1 = (value) -> {
            System.out.println("your value is "+ value);
        };
        consumer1.accept(true);
        consumer1.accept(false);

        Consumer<Integer> consumer2 = (number) -> System.out.println(number);
        Supplier<Integer> supplier = () -> new Random().nextInt(200);
        consumer2.accept(supplier.get());
    }
}
