import task1_predicate.TestPredicate;
import task2_consumer.TestConsumer;
import task2_consumer.Person;
import task3_function.TestFunction;
import task4_supplier.TestSupplier;
import task5_complicated.TestTernaryOperator;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Integer[] integers = new Integer[]{1, 2, 3, -1, -2, -3, 4, 5, 6, 7, 8, 10};
        TestPredicate.predicateTestAnonymousClass(integers);
        TestPredicate.predicateTestLambda(integers);


        Person person = new Person("Andrey");
        TestConsumer.testConsumerWithAnonymousClass(person);
        TestConsumer.testConsumerWithLambda(person);

        Double dbl = 3.99;
        System.out.println(TestFunction.testFunctionWithAnonymousClass(dbl));
        System.out.println(TestFunction.testFunctionWithLambda(dbl));

        System.out.println(TestSupplier.testSupplierWithAnonimousClass());
        System.out.println(TestSupplier.testSupplierWithLambda());


        Predicate<Integer> predicate = t -> t >= 0;
        Function<Integer, String> function1 = t -> "True";
        Function<Integer, String> function2 = t -> "False";

        Function<Integer, String> function3 = TestTernaryOperator.ternaryOperator(predicate,function1, function2);

        System.out.println(function3.apply(-2));
        System.out.println(function3.apply(0));


    }
}
