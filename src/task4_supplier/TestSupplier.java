package task4_supplier;

import java.util.function.Supplier;

public class TestSupplier {

    public static Integer testSupplierWithAnonimousClass() {
        Supplier<Integer> supplier = new Supplier<>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * (100 - 1) + 1);
            }
        };
        return supplier.get();
    }

    public static Integer testSupplierWithLambda() {
        Supplier<Integer> supplier = () -> (int) (Math.random()*(100-1)+1);
        return supplier.get();
    }

}
