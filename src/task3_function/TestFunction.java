package task3_function;

import java.util.function.Function;

public class TestFunction {

    public static Integer testFunctionWithAnonymousClass(Double d) {
        Function<Double, Integer> function = new Function<>() {
            @Override
            public Integer apply(Double d) {
                return (int) Math.abs(d);
            }
        };
        return function.apply(d);
    }

    public static Integer testFunctionWithLambda(Double d) {
        Function<Double,Integer> function = d1 -> (int) Math.abs(d1);
        return function.apply(d);
    }

}