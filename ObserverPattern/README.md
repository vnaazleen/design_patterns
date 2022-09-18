# Observer Pattern
The Observer Pattern defines a one-to-many
dependency between objects so that when one
object changes state, all of its dependents are
notified and updated automatically.

```
Publishers + Subscribers = Observer Pattern
```

* Observer pattern is is similar to newspaper or magazine subscriptions
    * A newspaper publisher goes into business and begins
    publishing newspapers.
    * You subscribe to a particular publisher, and every time there’s a new edition it gets delivered to you. As long as you remain a subscriber, you get new newspapers.
    * You unsubscribe when you don’t want papers anymore,
    and they stop being delivered.
* In Observer pattern, we call the publisher
the **SUBJECT** and the subscribers the **OBSERVERS**.

![Untitled](https://user-images.githubusercontent.com/54474853/190903185-9ca3fb63-95b7-4750-af80-571a979b2f53.png)

# Loose Coupling

Loosely coupled designs allow us to build flexible OO systems that can handle change because they minimize the interdependency between objects.

When two objects are loosely coupled, they can interact, but have very little knowledge of each other. 

The Observer Pattern provides an object design where subjects and observers are loosely coupled.

Why?

* **The only thing the subject knows about an observer is that it
implements a certain interface (the Observer interface).** It doesn’t need to
know the concrete class of the observer, what it does, or anything else about it.
We can add new observers at any time. Because the only thing the subject
depends on is a list of objects that implement the Observer interface, we can add new
observers whenever we want. In fact, we can replace any observer at runtime with
another observer and the subject will keep purring along. Likewise, we can remove
observers at any time.
* **We never need to modify the subject to add new types of observers.** Let’s
say we have a new concrete class come along that needs to be an observer. We don’t
need to make any changes to the subject to accommodate the new class type, all
we have to do is implement the Observer interface in the new class and register as
an observer. The subject doesn’t care; it will deliver notifications to any object that
implements the Observer interface.
* **We can reuse subjects or observers independently of each other.** If we
have another use for a subject or an observer, we can easily reuse them because the
two aren’t tightly coupled.
* **Changes to either the subject or an observer will not affect the other.**
Because the two are loosely coupled, we are free to make changes to either, as long as
the objects still meet their obligations to implement the subject or observer interfaces.

## Example: Weather-O-Rama

The three players in the system are the weather station (the physical device that
acquires the actual weather data), the WeatherData object (that tracks the data coming
from the Weather Station and updates the displays), and the display that shows users
the current weather conditions.

![Untitled](https://user-images.githubusercontent.com/54474853/190904528-112d68fe-60cd-4729-9dc1-9f6dead6d546.png)

The WeatherData object knows how to talk to the physical Weather Station, to get
updated data. The WeatherData object then updates its displays for the three different
display elements: Current Conditions (shows temperature, humidity, and pressure),
Weather Statistics, and a simple forecast

Our job, if we choose to accept it, is to create an app that
uses the WeatherData object to update three displays for
current conditions, weather stats, and a forecast.

### Solution -- Class Diagram

![Untitled](https://user-images.githubusercontent.com/54474853/190904615-d91e4099-90e9-4f07-9b41-bf97e42d6fae.png)
