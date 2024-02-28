package funcInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {

        BiPredicate<String, String> biPredicate = (word, letter) -> word.length()>2 && letter.length()==5;
        System.out.println(biPredicate.test("vera", "susan"));

    }
}
