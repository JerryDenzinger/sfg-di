# sfg-di
From Wikipedia, the free encyclopedia<br>

In software engineering, dependency injection is a technique in which an object receives other objects that it depends on. These other objects are called dependencies. In the typical "using" relationship the receiving object is called a client and the passed (that is, "injected") object is called a service. The code that passes the service to the client can be many kinds of things and is called the injector. Instead of the client specifying which service it will use, the injector tells the client what service to use. The "injection" refers to the passing of a dependency (a service) into the object (a client) that would use it.

The service is made part of the client's state. Passing the service to the client, rather than allowing a client to build or find the service, is the fundamental requirement of the pattern.

The intent behind dependency injection is to achieve separation of concerns of construction and use of objects. This can increase readability and code reuse.

Dependency injection is one form of the broader technique of inversion of control. A client who wants to call some services should not have to know how to construct those services. Instead, the client delegates the responsibility of providing its services to external code (the injector). The client is not allowed to call the injector code; it is the injector that constructs the services. The injector then injects (passes) the services into the client which might already exist or may also be constructed by the injector. The client then uses the services. This means the client does not need to know about the injector, how to construct the services, or even which actual services it is using. The client only needs to know about the intrinsic interfaces of the services because these define how the client may use the services. This separates the responsibility of "use" from the responsibility of "construction".
<h1>Dependency Inyection</h1> 
Dependency injection separates the creation of a client's dependencies from the client's behavior, which allows program designs to be loosely coupled and to follow the dependency inversion and single responsibility principles.It directly contrasts with the service locator pattern, which allows clients to know about the system they use to find dependencies.

An injection, the basic unit of dependency injection, is not a new or a custom mechanism. It works in the same way that "parameter passing" works. Referring to "parameter passing" as an injection carries the added implication that it is being done to isolate the client from details.

An injection is also about what is in control of the passing (never the client) and is independent of how the passing is accomplished, whether by passing a reference or a value.

Dependency injection involves four roles:

the service object(s) to be used
the client object that is depending on the service(s) it uses
the interfaces that define how the client may use the services
the injector, which is responsible for constructing the services and injecting them into the client
As an analogy,

service - an electric, gas, hybrid, or diesel car
client - a driver who uses the car the same way regardless of the engine
interface - automatic, ensures driver does not have to understand details of shifting gears
injector - the parent who bought the car for the driver and decided which kind
Any object that may be used can be considered a service. Any object that uses other objects can be considered a client. The names have nothing to do with what the objects are for and everything to do with the role the objects play in any one injection.

The interfaces are the types the client expects its dependencies to be. An issue is what they make accessible. They may truly be interface types implemented by the services but also may be abstract classes or even the concrete services themselves, though this last would violate DIP and sacrifice the dynamic decoupling that enables testing. It is only required that the client does not know which they are and therefore never treats them as concrete, say by constructing or extending them.

The client should have no concrete knowledge of the specific implementation of its dependencies. It should only know the interface's name and API. As a result, the client will not need to change even if what is behind the interface changes. However, if the interface is refactored from being a class to an interface type (or vice versa) the client will need to be recompiled. This is significant if the client and services are published separately. This unfortunate coupling is one that dependency injection cannot resolve.

The injector introduces the services into the client. Often, it also constructs the client. An injector may connect together a very complex object graph by treating an object like a client and later as a service for another client. The injector may actually be many objects working together but may not be the client. The injector may be referred to by other names such as: assembler, provider, container, factory, builder, spring, construction code, or main.

Dependency injection can be applied as a discipline, one that asks that all objects separate construction and behavior. Relying on a DI framework to perform construction can lead to forbidding the use of the new keyword, or, less strictly, only allowing direct construction of value objects.
