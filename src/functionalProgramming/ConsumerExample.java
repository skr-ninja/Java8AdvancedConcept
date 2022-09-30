package functionalProgramming;

import java.util.function.Consumer;

public class ConsumerExample {


    public static void main(String[] args) {

        Consumer<String> consumer= (x)-> System.out.println(x.length());
        consumer.accept("sunil");

        // Consumer with argument

        Consumer<Integer>consumer1= (x)-> {
            System.out.println("Prod aXb :"+ x*x);
            System.out.println("Divide a/b :"+ x/x);
        };
        consumer1.accept(5);

    }
}
