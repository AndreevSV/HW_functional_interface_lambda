package task1_predicate;

import java.util.function.Predicate;

public class TestPredicate {

    public static void predicateTestAnonymousClass(Integer[] integers) {

        Predicate<Integer> testPredicate = new Predicate<>() {
            @Override
            public boolean test(Integer t) {
                if (t > 0) {
                    return true;
                } else return false;
            }
        };

        for (Integer t : integers) {
            System.out.print(testPredicate.test(t) + " ");
        }
        System.out.println();
    }

    public static void predicateTestLambda(Integer[] integers) {
        Predicate<Integer> testPredicate1 = t -> t > 0;
        for (Integer t : integers) {
            System.out.print(testPredicate1.test(t) + " ");
        }
        System.out.println();
    }
}
