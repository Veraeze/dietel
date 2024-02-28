package funcInterfaces;

import java.util.function.LongConsumer;

public class LongConsumerSample {
    public static void main(String[] args) {
        LongConsumer value = (element) -> System.out.println("the long value entered is "+element);
        value.accept(234556);
    }
}
