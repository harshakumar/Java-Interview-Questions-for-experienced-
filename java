1. What are the main features of Java 8?
Java 8 introduced several major features:

Lambda Expressions: Provide a clear and concise way to represent a single method interface using an expression.
Streams API: A new abstract layer to process sequences of elements, providing a functional approach to manipulating collections.
Default Methods: Allow methods in interfaces to have a default implementation.
Optional: A new class to avoid NullPointerException and model the absence of value.
New Date and Time API: A comprehensive and improved date and time handling system.
Nashorn JavaScript Engine: A new engine to run JavaScript code on the JVM.
Method References: Enable you to refer to methods or constructors without invoking them.

2. Can you explain the difference between JDK, JRE, and JVM?
JDK (Java Development Kit): A full-featured software development kit for Java that includes JRE, an interpreter/loader (Java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc), and other tools needed for Java development.
JRE (Java Runtime Environment): A package that provides the libraries, Java Virtual Machine (JVM), and other components to run applications written in Java. It does not include development tools like compilers or debuggers.
JVM (Java Virtual Machine): An abstract machine that provides a runtime environment in which Java bytecode can be executed. It is platform-dependent and performs tasks like loading code, verifying code, and executing code.

3. How does the final keyword work in Java? When would you use it?
Final Variables: When a variable is declared as final, it can be assigned only once.
Final Methods: A method declared as final cannot be overridden by subclasses.
Final Classes: A class declared as final cannot be subclassed.
Usage:

Use final variables for constants.
Use final methods to prevent modification in subclasses.
Use final classes to prevent inheritance.

4. Explain the concept of Java Memory Management.
Java Memory Management involves:

Heap: Where all the objects and their instance variables are stored.
Stack: Stores method frames, local variables, and partial results.
Garbage Collection: The process of automatically reclaiming memory by deleting objects that are no longer reachable in the program.
PermGen/Metaspace: Holds class-level metadata, static content, and runtime constants. Metaspace replaced PermGen in Java 8.

5. How does garbage collection work in Java?
Garbage Collection in Java is an automatic process of reclaiming heap memory occupied by objects that are no longer in use. The garbage collector identifies these objects by analyzing references and uses algorithms like:

Mark and Sweep: Marks the live objects and sweeps away the dead ones.
Generational Garbage Collection: Divides the heap into young and old generations. Objects are first allocated in the young generation and moved to the old generation if they survive long enough.
Concurrent Mark-Sweep (CMS): Runs concurrently with the application to minimize pauses.
G1 Garbage Collector: Splits the heap into regions and performs garbage collection within these regions to manage memory more efficiently.

6. What are the different types of references in Java?
Strong Reference: The default type of reference, where the object remains in memory as long as it is reachable.
Soft Reference: Retained as long as there is enough memory. Suitable for implementing memory-sensitive caches.
Weak Reference: Cleared at the next garbage collection cycle. Useful for creating weakly reachable objects like canonicalizing mappings.
Phantom Reference: Enqueued after the object is finalized and before its memory is reclaimed. Useful for cleanup activities before garbage collection.

7. Can you explain the concept of autoboxing and unboxing?
Autoboxing: The automatic conversion of primitive types to their corresponding wrapper classes (e.g., int to Integer).
java
Copy code
Integer a = 5; // Autoboxing
Unboxing: The automatic conversion of wrapper class objects to their corresponding primitive types (e.g., Integer to int).
java
Copy code
int b = a; // Unboxing

8. How does the String pool work in Java?
The String pool is a special memory region where Java stores literal strings. When a new string literal is created, the JVM checks the pool. If an identical string is found, it returns the reference instead of creating a new object. This improves memory efficiency by reusing instances.

java
Copy code
String s1 = "Hello";
String s2 = "Hello";
System.out.println(s1 == s2); // true, both point to the same object in the pool

9. What are immutable objects, and why are they useful?
Immutable objects are objects whose state cannot be changed after creation. Examples include String, Integer, and other wrapper classes.

Benefits:

Thread Safety: Immutable objects can be shared across multiple threads without synchronization.
Caching and Optimization: They can be cached for performance optimization.
Predictable Behavior: They prevent accidental changes, making code more predictable and easier to understand.

10. How do you create a thread-safe class in Java?
Techniques:

Synchronization: Use synchronized methods or blocks to control access to critical sections.
java
Copy code
public synchronized void increment() {
    count++;
}
Volatile Keyword: Use volatile for variables to ensure visibility of changes across threads.
java
Copy code
private volatile boolean running = true;
Atomic Classes: Use classes from java.util.concurrent.atomic package for atomic operations.
java
Copy code
private AtomicInteger count = new AtomicInteger(0);
public void increment() {
    count.incrementAndGet();
}
Immutable Objects: Design classes that do not allow modification of state after construction.
