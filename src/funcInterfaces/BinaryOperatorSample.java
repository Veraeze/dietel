package funcInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        BinaryOperator<String> operator = (word, letter) -> new StringBuilder(word).reverse().toString().concat(letter);
        System.out.println(operator.apply("vera", "eze"));
    }
}
