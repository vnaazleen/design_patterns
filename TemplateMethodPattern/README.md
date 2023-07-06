# Template method Pattern
- Encapsulating Algorithms
- The Template Method Pattern defi nes the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefi ne certain steps of an algorithm without changing the algorithm’s structure.

## Example: (Algorithm to make Coffee & Tea)
### Coffee recipe:
(1) Boil some water
(2) Brew coffee in boiling water
(3) Pour coffee in cup
(4) Add sugar and milk

### Tea recipe:
(1) Boil some water
(2) Steep tea in boiling water
(3) Pour tea in cup
(4) Add lemon


## Approach 1 (v1):
- Create a class for Coffee & Tea

Design Flaws:
- Code duplication (What to do now? Abstract out the commonalities)

## Approach 2 (v2): Template method pattern
- Create a base class with common methods
- Define child specific methods in child class

**The Template Method defines the steps of an algorithm and allows subclasses to provide the implementation for one or more steps.**
