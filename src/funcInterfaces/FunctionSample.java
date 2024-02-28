package funcInterfaces;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        Function<String, String> function = (word) -> word.substring(4);
        System.out.println(function.apply("luguburious"));
    }
}
