                    Executor Framework
                           │
                    ExecutorService
                      /          \
                     /            \
              Runnable          Callable<T>
                 │                  │
               run()              call()
                 │                  │
              no result          result
                                    │
                                  Future<T>
and separately
Consumer   → T → void
Function   → T → R
Supplier   →     → T
Predicate  → T → boolean

future is a generic type that can hold any type of data. It represents the result of an asynchronous computation.
shutdown() method is used to stop accepting new tasks and gracefully terminate the executor service after completing all submitted tasks. (Terminate after pending work and will not take new tasks)
shutdownnow() method is used to immediately stop all executing tasks and terminate the executor service. (Terminate immediately and will not take new tasks)

Executor Service -> Execute (Runnable object) no return type
                    -> Submit (Callable object) return type
                    -> Future<T> represents the result of an asynchronous computation.
                    -> invokeAll() submits a collection of tasks for execution and returns a list of Future objects.
                    -> invokeAny() submits a collection of tasks for execution and returns the result of the first successfully completed task.

Thread Pool Engine: Configurable Engine
                    Worker threads
                    Task queue to hold extra tasks

Configuration of     executorService executor = Executors.newFixedThreadPool(2);
int corePoolSize = 2;
int maximumPoolSize = 4;
long keepAliveTime = 60;
TimeUnit unit = TimeUnit.SECONDS;
BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>();

workQueue-> It is made before the thread pool is created.
            -> Fixed size queue, if the queue is full then the task will be rejected.
            -> Dynamic size queue, if the queue is full then the task will be added to the queue.

Memory Trick
C → Core Pool Size
M → Maximum Pool Size
T → Keep Alive Time
U → Time Unit
Q → Work Queue

Thread Creating Rules:
1. Workers < Core Pool Size → Create a new worker.
2. Core workers are busy → Put task in the queue if space is available.
3. Queue is full → Create extra workers up to Maximum Pool Size.
4. Maximum workers + full queue → Reject the task.
One important exception: with new LinkedBlockingQueue<>(), the queue is effectively unbounded, so Rule 3 normally won't be reached. That's why maximumPoolSize often doesn't have an effect with newFixedThreadPool()-style unbounded queuing.

Types of Queues:
1. ArrayBlockingQueue: A bounded blocking queue backed by an array. It has a fixed capacity and blocks when the queue is full or empty.
2. LinkedBlockingQueue: An optionally bounded blocking queue backed by linked nodes.

Executor -> new fixed thread pool -> corepoolsize=maximumpoolsize=2
        -> new cached thread pool -> corepoolsize=0, maximumpoolsize=Integer.MAX_VALUE
        -> new single thread pool -> corepoolsize=maximumpoolsize=1


Single thread pool
Scheduler thread pool - Task can be run in future
scheduler.scheedule(())

executor.submit() -> Callable object -> Future<T> object
Future<T> future = executor.submit(() -> {
    f.get() -> blocks until the result is available
    f.cancel() -> attempts to cancel the execution of the task

submit with runnable 
executor.submit(() -> {
    System.out.println("Hello");
    return null;
});
we will run runnable in place of callable
It can also receive a Future object but it will return null because runnable does not return any value.

Methods of Future-> get() -> blocks until the result is available
                    Future<Integer> f1= executour.submit(() -> {
                        
                -> cancel() -> attempts to cancel the execution of the task
                -> isDone() -> returns true if the task is completed
                -> isCancelled() -> returns true if the task was cancelled before completion

                f1.cancel(true) -> attempts to cancel the execution of the task, if the task has already started, it will be interrupted if possible.
choice  1-> The task had not been started yet, it will be cancelled and will not run.Waiting in block Queue
choice 2-> Process -> true -> The task is running, it will be interrupted if possible.
                    -> false -> The task is running, but it cannot be interrupted. It will continue to run until completion.

Thread looks like this start-> filter-> stop-> execute-> done

                    future class-> passive class
                    -> only check the result
                    -> executed object is not aware of future object
Future has a problem of blocking, it will block the thread until the result is available. It does not support non-blocking composition and chaining.

Completable future:-
Future<Integer> f1= executor.submit(() ->

CompletableFuture<T> also represents an asynchronous result, but it supports non-blocking composition and chaining