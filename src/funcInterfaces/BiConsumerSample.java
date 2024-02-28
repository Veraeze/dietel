package funcInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (name, state) -> {
            System.out.println("my name is " + name + " and i am from " + state + " state.");
        };
        biConsumer.accept("vera", "imo");
    }
}
