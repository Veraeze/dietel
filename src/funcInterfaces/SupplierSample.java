package funcInterfaces;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierSample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> new Random().nextInt(1, 100);

        System.out.println(supplier.get());


    }
}
