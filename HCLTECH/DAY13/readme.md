Terminal operation->
 find first()/find last()
soup(x)
toList()
collect()
count()
source->inter->terminal

Horizontal processing is not done in java so we only go for the vertical processing

till then we dont decline the terminal app, till then our stream does not start this tie is called lazy evolution.

short circuit- dont need to visit rest of the list as in conditional loop short circuit happens

what happens when we use terminal statements-
we cant cnsue terminal for the second time

Parallel Stream
Sequential stream will consider the elements as source and create a pipeline of operation.
Split Iterator

List<Integer> obj= new ArrayList<>(List.of(1,2,3,4,5))

operation method stateless-> whwn there is no dependency
Stateless = element-by-element
Stateful = needs to remember/know other elements

Operation	Stateful / Stateless	Why
map()	Stateless	Each element is transformed independently
filter()	Stateless	Each element is checked independently
sorted()	Stateful	Must see/remember the elements to determine their order
distinct()	Stateful	Must remember previously seen elements
limit()	Stateful	Needs to track how many elements have been processed
skip()	Stateful	Needs to track how many elements to skip

what happens when we write obj.parallel stream
1. Split data into chunks
2. assign chunks to thread
3. Process independently
4. Combine result

he Fork/Join Framework is used for parallel processing—especially when a large task can be divided into smaller independent tasks.

Think:

Fork → Split the task
Join → Combine the results
ForkJoinPool is the pool of worker threads that executes these forked tasks.
ForkJoinPool pool = new ForkJoinPool();
Spliterator = Split + Iterator

It is an interface in Java used to traverse and potentially split elements of a collection, mainly for parallel processing.

Think of it as:

Iterator → goes through elements
Spliterator → goes through elements + can split them

iterator-> hashnext()  next()  remove()
-> traverse the element
-> Decompose the source into equally divide part

Important methods
Method	Purpose
tryAdvance()	Processes one element  
forEachRemaining()	Processes remaining elements 

* trySplit()	Splits the Spliterator    -> can't split always
 
estimateSize()	Estimates remaining elements
characteristics()	Gives properties of the Spliterator