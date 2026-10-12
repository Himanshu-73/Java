Executor Framework :-
1. Multithreading- We are creating multiple threads and assigning them multiple task.
Thread allocation-
thread t1 = new thread();
t1.thread();
threads --> CPU  --> Performance

1 thread size => min=512 KB  max=1 MB
    100 threads = 1000* 1MB= 1GB
    Operating System scheduling  100 thread 4 cores

    So, most of the time it will spend on Context switching
Context Switching: It is a process where the CPU pauses the execution of one thread and switches to another thread, saving the current thread execution state and restoring the next thread state.

Thread -> Give me task
  -> How to execute the task?
  -> Area of runnable task
It's task is to implement asynchronously.  The Executor framework provides a way to manage the thread pool and manage the threads. It is a framework that provides a way to manage and control the execution of multiple threads in a concurrent environment. The Executor framework provides a higher-level replacement for the traditional way of managing threads using the Thread class.
Thread pool is a collection of threads that are created and managed by the Executor framework. The thread pool allows for the reuse of threads, which can improve performance and reduce the overhead of creating new threads.

Worker thread: A worker thread is a thread that is responsible for executing tasks in the thread pool. The worker thread retrieves tasks from the task queue and executes them.
 
 Core -> many pools; many threads in one core

 Runnable interface: The Runnable interface is a functional interface that represents a task that can be executed by a thread. It has a single method, run(), which contains the code to be executed by the thread.

 Runnable task: A Runnable task is an instance of a class that implements the Runnable interface. It represents a unit of work that can be executed by a thread.
 Runnable Interface →Runnable Task → Executor framework → Worker Thread → run() executes the task


Runnable task = () -> {
    System.out.println("Task running");
};

ExecutorService executor = Executors.newFixedThreadPool(2);

executor.execute(task);

Here:

Runnable → represents the task
ExecutorService → manages/executors tasks
Worker thread → actually runs the task
execute(task) → submits the task for execution
run() → contains the actual work

Runnable task is a type of consumer functional interface.

ExecutorService is an interface that provides methods for managing and controlling the execution of tasks. It has several types of implementations, including: namely, ThreadPoolExecutor, ScheduledThreadPoolExecutor, and ForkJoinPool.

Executor framework hierarchy:
Executor (interface)
    |
    |-- ExecutorService (interface but has multiple methods)
    |       |
    |       |-- ThreadPoolExecutor (class)
    |       |-- ScheduledThreadPoolExecutor (class)
    |       |-- ForkJoinPool (class)   [Fork -> divide the task, Join -> combine the result forkjoinpool is a thread pool that uses the fork/join framework to execute tasks in parallel.]
    |
    |-- Executors (class) - provides factory methods for creating different types of executor services.

Interface Executor{
    void execute(Runnable task);
} // Your work is assigned to task and it will be executed by worker thread.
 ExecutorService-> Execute   --> Runnable object --> Consumer type behavior
                -> submit Executor   --> Callable object --> function type behavior

Both runnable and callable are functional interfaces that represent tasks that can be executed by a thread. The main difference between the two is that Runnable does not return a value, while Callable returns a value.

Callable interface: The Callable interface is a functional interface that represents a task that can be executed by a thread and returns a result. It has a single method, call(), which contains the code to be executed by the thread and returns a value.
Runnable Interface: 
    void run(); // does not return any value

It is the work of thread pool and it has to be waited in queue for execution

Java -> Future interface: The Future interface represents the result of an asynchronous computation. It provides methods to check if the computation is complete, retrieve the result, and cancel the computation if needed.
Here java has created a datatype called future which is a generic type and it can hold any type of data.
Future<Integer> future = executor.submit(() -> {
    // Perform some computation
    return 42;
});
future: Class that returns asynchronously -> Task Submitted -> background work ->Future object -> get() method to retrieve the result

future-> invokeall();
        -> invokeany();

JAVA API Timing :
Old time and date : java.util.Date

They were mutable and not thread-safe, leading to potential issues in concurrent applications. The java.util.Date class had several design flaws, such as zero-based months and a lack of support for time zones.

New time and date : java.time.LocalDateTime

Provides comprehensive support for date and time manipulation, including time zones, and is immutable and thread-safe.
1. LocalDate: Represents a date without a time zone, such as 2024-06-15.
2. LocalTime: Represents a time without a date, such as 14:30:00.
3. LocalDateTime: Represents a date and time without a time zone, such as 2024-06-15T14:30:00.
4. ZonedDateTime: Represents a date and time with a time zone, such as 2024-06-15T14:30:00Z[UTC].
5. Instant: Represents a specific moment in time, such as 2024-06-15T14:30:00Z.
6. Period: Represents a period of time in terms of years, months, and days.
7. Duration: Represents a duration of time in terms of hours, minutes, and seconds.
8. DateTimeFormatter: Provides formatting and parsing for date and time objects.