# State Pattern

```
The State Pattern allows an object to alter its behaviour when its internal state changes. The object will appear to change its class.
```


## State machines 101 (v1)
State machine to Code 
1. Gather up the states.
2. Create an instance variable to hold the current state, and define values for each of the states.
3. Gather all the actions that can happen in the system.
4. Now we create a class that acts as the state machine. For each action, we create a method that uses conditional statements to determine what behavior is appropriate in each state. 

## New Design (v2) - State Pattern
1. Define a State Interface that contains a method for every action.
2. Implement a State class for every state of the machine. These classes will be responsible for the behaviour of the machine when it is in the corresponding state.
3. Finally, get rid of all conditional code and instead delegate to the state class to do the work.

