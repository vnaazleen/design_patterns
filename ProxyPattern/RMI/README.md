# Remote Method Innvocation

## Remote methods

* Remote proxy acts as a local representive(object that you can call local methods on and which calls the remote object) to a remote object (object that lives in the heap of different JVM).

* [Add pic to remote methods]

* [Add pic to How a method call happends]

### Java RMI

* RMI Nomenclature: in RMI, the client helper is a ‘stub’ and the service helper is a ‘skeleton’.
* Steps: making an remote interface
    1.  **Make an remote interface:** defines the methods that client can call remotely. Both stub and actual service implement this.
        a. Extend java.rmi.Remote
        b. Declare that all methods throw a RemoteException
        c. Be sure arguments and return values are primitives or Serializable
    2.  **Make an remote implementation:** has the real implementation of the remote methods defined in the remote interface.
        a. Implement the Remote interface
        b. Extend UnicastRemoteObject (in order to act as remote service object it needs some functionality)
        c. Write a no-arg constructor that declares a RemoteException (parent class: UnicastRemoteObject - throws RemoteException while creation so we should also declare it. because parent class is always called while child class creation)
        d. Register the service with the RMI registry (Register your service using the static rebind() method of the java.rmi.Naming class.)
    3.  **Generate stub and skeleton using rmic:** `rmic <remoteImplementationClass>` command is used to generate stub and skeleton automatically.
        a. Run rmic on the remote implementation class (not the remote interface)
    4.  **Start the RMI reigstry:** using `rmiregistry` command. This is the place where client looks for stubs.
        a. Bring up a terminal and start the rmiregistry.
    5.  **Start the remote service:** Service implementation class instantiates an instance of the service and registers it with the RMI registry, which makes it available to clients.
        a. Bring up another terminal and start your service
