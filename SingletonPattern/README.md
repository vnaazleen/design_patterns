# Singleton Pattern

The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it

```
Singleton ==> Only one object (which has global acess)
```

* Singleton Pattern is a **convention** for ensuring one and only one object is instantiated for a given class. 
* Singleton Pattern also gives us a global point of access, just like a global variable, but without the downsides.
* What downsides?
  * if you assign an object to a global variable, then that object might be created
when your application begins
  * What if this object is resource intensive and your application never ends
up using it?
  * with the Singleton Pattern, we can create our objects only when they are needed.

## Structure:

![Untitled](https://user-images.githubusercontent.com/54474853/191959153-1dfed0fd-1143-4fd1-836c-2237e43b4423.png)

## Implementation:

![Untitled](https://user-images.githubusercontent.com/54474853/191959442-ac1bdacf-b4b8-4528-9e2b-d8c0ac8968fe.png)

![Untitled 2](https://user-images.githubusercontent.com/54474853/191959455-2989c15b-eea9-4d79-94e7-727ab077fae8.png)

## Example: 🍫🏗 Chocolate Factory
Everyone knows that all modern chocolate factories have computer controlled
chocolate boilers. The job of the boiler is to take in chocolate and milk, bring them
to a boil, and then pass them on to the next phase of making chocolate bars.
Here’s the controller class for Choc-O-Holic, Inc.’s industrial strength Chocolate
Boiler. Check out the code; you’ll notice they’ve tried to be very careful to ensure
that bad things don’t happen, like draining 500 gallons of unboiled mixture, or
filling the boiler when it’s already full, or boiling an empty boiler!

* Initial Chocolate Boiler class: here

![Untitled](https://user-images.githubusercontent.com/54474853/191961958-d4c1caee-1547-4887-86c5-b974808b23c1.png)

* Chocolate Boiler class using Singleton Pattern: here

![Untitled](https://user-images.githubusercontent.com/54474853/191962196-f7a1765b-1abc-4f87-a04e-cb016b34533c.png)


### Problem.... 😬

It looks like the Chocolate Boiler has let us down; despite
the fact we improved the code using Classic Singleton,
somehow the ChocolateBoiler’s fi ll() method was able
to start fi lling the boiler even though a batch of milk and
chocolate was already boiling! That’s 500 gallons of spilled
milk (and chocolate)! What happened!?

### Cause: Multi-threading
Could the addition of threads have caused
this? Isn’t it the case that once we’ve set
the uniqueInstance variable to the sole
instance of ChocolateBoiler, all calls to
getInstance() should return the same
instance? Right?

### Solution: Dealing with Multi-threading 
Our multithreading woes are almost trivially fixed by making
getInstance() a synchronized method:

![Untitled](https://user-images.githubusercontent.com/54474853/191963121-5bbd64e8-3d39-4a56-a050-17eaf8bb4940.png)

**But synchronization
is expensive**
the only
time synchronization is relevant is the first time through this method. In
other words, once we’ve set the uniqueInstance variable to an instance
of Singleton, we have no further need to synchronize this method. After
the first time through, synchronization is totally unneeded overhead!

### Other solutions: Can we improve multithreading?
1. Use `synchronized` keyword in getInstance() method signature, if performance of getInstance() method isn't critical to application.
2. Move to an eagerly created instance rather than a lazily created one.
  ![Untitled](https://user-images.githubusercontent.com/54474853/191963780-51e8124c-b6d5-4202-96f0-56f46deb1dad.png)
  *  Using this approach, we rely on the JVM to create the unique instance of the Singleton when
the class is loaded. The JVM guarantees that the instance will be created before any thread
accesses the static uniqueInstance variable. 
3. Use **“double-checked locking”** to reduce the use of synchronization in getInstance()
  * With double-checked locking, we first check to see if an instance is created, and if not, THEN we
synchronize. This way, we only synchronize the first time through, just what we want.
  * If performance is an issue in your use of the getInstance() method then this method of
implementing the Singleton can drastically reduce the overhead.

![Untitled](https://user-images.githubusercontent.com/54474853/191964216-0b3d17f2-ab73-4478-aaf8-9c431f7d6046.png)

##  BULLET POINTS
* The Singleton Pattern ensures
you have at most one instance
of a class in your application.
* The Singleton Pattern also
provides a global access point
to that instance.
* Java’s implementation of the
Singleton Pattern makes use
of a private constructor, a static
method combined with a static
variable.
* Examine your performance
and resource constraints and
carefully choose an appropriate
Singleton implementation for
multithreaded applications
(and we should consider all
applications multithreaded!).
* Beware of the double-checked
locking implementation; it is not
thread-safe in versions before
Java 2, version 5.
* Be careful if you are using
multiple class loaders; this
could defeat the Singleton
implementation and result in
multiple instances.
* If you are using a JVM earlier
than 1.2, you’ll need to create a
registry of Singletons to defeat
the garbage collector.
