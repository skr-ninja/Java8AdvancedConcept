package runnable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class SumOfNumberUsingCallable {

    public static int[] arrayNumber = IntStream.rangeClosed(0, 5000).toArray();

    public static int total = IntStream.rangeClosed(0, 5000).sum();

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Callable callable1 = () -> {

            int sum = 0;

            for (int i = 0; i < arrayNumber.length / 2; i++)
                sum += i;

            return sum;
        };


        Callable callable2 = () -> {
            int sum = 0;

            for (int i = arrayNumber.length / 2; i < arrayNumber.length; i++) {
                sum += i;
            }
            return sum;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> taskList = Arrays.asList(callable1, callable2);
        List<Future<Integer>> results = executorService.invokeAll(taskList);

        int k = 0;
        int sum = 0;
        for (Future<Integer> result : results) {
            sum += result.get();
            System.out.println("Sum Of :" + ++k + "" + result.get());
        }

        System.out.println("Sum From The Callable is: " + sum);

        System.out.println("Correct Sum from Int stream i :" + total);

        executorService.shutdown();
    }
}
