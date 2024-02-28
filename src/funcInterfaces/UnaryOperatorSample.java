package funcInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {
    public static void main(String[] args) {


        UnaryOperator<String> operator = (word) -> new StringBuilder(word).reverse().toString();
        System.out.println(operator.apply("Hello"));
    }
}
