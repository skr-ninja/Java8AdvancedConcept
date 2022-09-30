package runnable;

public class RunnableExample {

    public static void main(String[] args) {


        // Method First
        // Runnable Traditional Example
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++)
                    sum += i;
                System.out.println("==" + sum);

            }
        };
        new Thread(runnable).start();

        // Method Second
        // using lamda
        Runnable runnable1 = () -> {
            int sum = 0;
            for (int i = 0; i < 10; i++)
                sum += i;
            System.out.println("Runnable Lamda :" + sum);
        };
        new Thread(runnable1).start();


        // Method Third
        // Implement using thread with Lamda
        new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 10; i++)
                sum += i;
            System.out.println("Implement using thread with Lamda :" + sum);
        }).start();

    }
}
