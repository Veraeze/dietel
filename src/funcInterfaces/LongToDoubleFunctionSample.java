package funcInterfaces;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleFunctionSample {
    public static void main(String[] args) {

        LongToDoubleFunction example = value -> value + 2;
        System.out.println(example.applyAsDouble(906765434));
    }
}
