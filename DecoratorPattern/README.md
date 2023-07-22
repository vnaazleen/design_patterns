# Decorator Pattern

The Decorator Pattern attaches additional
responsibilities to an object dynamically.
Decorators provide a fl exible alternative to
subclassing for extending functionality.

```
Decorator ==> Wrapper
```

* Decorators have the same supertype as the objects they decorate.
* You can use one or more decorators to wrap an object.
* Given that the decorator has the same supertype as the object it decorates, we can pass
around a decorated object in place of the original (wrapped) object.
* **The decorator adds its own behavior either before and/or after delegating to the object it
decorates to do the rest of the job.**
* Objects can be decorated at any time, so we can decorate objects dynamically at runtime
with as many decorators as we like.

## Structure

![Untitled](https://user-images.githubusercontent.com/54474853/191049933-f01ecd0f-e076-462e-aebf-4c03ba574dc0.png)
