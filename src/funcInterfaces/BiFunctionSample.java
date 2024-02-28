package funcInterfaces;

import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {

        BiFunction<String, String, Boolean> biFunction = (word, letter) -> word.length()>2 && letter.length()==5;
        System.out.println(biFunction.apply("vera", "susan"));
        System.out.println(biFunction.apply("vera", "sus"));

    }

}
