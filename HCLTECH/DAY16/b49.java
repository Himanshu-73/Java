package DAY16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class b49 {
    public static void main(String[] args) {

        // Create a thread pool with 3 worker threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit 6 tasks
        for (int i = 1; i <= 6; i++) {

            int taskNumber = i;

            executor.submit(() -> {
                System.out.println(
                    "Task " + taskNumber + " is performed by "
                    + Thread.currentThread().getName()
                );

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println(
                    "Task " + taskNumber + " is completed by "
                    + Thread.currentThread().getName()
                );
            });
        }

        // Stop accepting new tasks
        executor.shutdown();
    }
}