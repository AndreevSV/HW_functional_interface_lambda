package task2_consumer;

import java.util.function.Consumer;

public class TestConsumer {

    public static void testConsumerWithAnonymousClass(Person person) {
        Consumer<Person> consumer = new Consumer<>() {
            @Override
            public void accept(Person person) {
                System.out.println(person.getName());
            }
        };

        consumer.accept(person);
    }


    public static void testConsumerWithLambda(Person person) {

        Consumer<Person> consumer = name -> System.out.println(person.getName());
        consumer.accept(person);
    }

}
