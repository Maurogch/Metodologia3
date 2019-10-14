//----------- Factory -----------//

Factory concreteFactory = new ConcreteFactory(); // new MageFactory

AbstractClass classToConstruct = concreteFactory.createClass(); // Creating a mage

//----------- Abstract Factory -----------//

IFactory abstractFactory = new AbstractFactory(); // new NeverLandFactory

AbstractClass classToConstruct = abstractFactory.createSubClass(); // Creating a mage: createMage()

//----------- Builder -----------//

Director director = new Director(); // Director always needed
Builder builder1 = new ConcreteBuilder1(); // Instanciate concrete builder

director.build(builder1); // pass instance of builder to director, here are the parts needed builded
Product1 product1 = builder1.getResult() // get constructed class

//----------- Strategy -----------//

Class class = new Class(new Behaviour()); // send by constructor a strategy that implements the strategy interface

class.performBehaviour(); // perform method of the specific behaviour

class.setBehaviour(); // change strategy

//----------- Observer -----------//

Class1 observableClass = new Class1(); // Common class that implements observable interface, the one that is observed for changes
Class2 observerClass = new Class2(); // Service that implements observer, class that wants to know what happens to observable (Class1)

observableClass.attach(observerClass); // add an observer, so that if change happens it is notified
observableClass.notify(); // if a change happens this method is invoked to notify attached observers
// Next in the observer side
observerClass.update(); // this is run when a notify from observable comes

//----------- Decorator -----------//

Class concreteClass = new ConcreteClass();
concreteClass = new ConcreteDecoratorA(concreteClass); // pisas variable y le asignas adentro la anterior
concreteClass = new ConcreteDecoratorB(concreteDecoratorB);

//concreteDecoratorA.setComponent(concreteClass); // Decorator must have an object, see it like as setConcreteClass()
//concreteDecoratorB.setComponent(concreteDecoratorA) // Add previous decorator, and so on if theres new decorators

concreteClass.doOperation(); // Call native method from concreteClass from the outmost decorator

//----------- Template Method -----------//

abstract class AbstractClass {
    public abstract void abstractMethod(); // method that must be implented

    public void templateMethod(){
        abstractMethod(); // Do the abstract method
        // Some other code
    }
}

//----------- Singleton -----------//

Class class = Class.getInstance();

//----------- Adapter -----------//

class Target {
    Service service = new Service();

    public void getSomething(){
        service.getSomething(); // Service will get what you need from an external resource that needed to be adapted
    }
}

//----------- Facade -----------//

Facade facade = new Facade();

facade.MethodA(); // Divide de load in two (or more) methods inside of facade
facade.MethodB();

//----------- Proxy -----------//

Proxy proxy = new Proxy();

proxy.Request();

class Proxy implements Subject { // Implements the same interface as the Class to proxy
    private Subject concreteSubject; // has the subject to proxy as attribute

    @Override
    public void Request(){ // Oberrides the method of the interface
        // Use 'lazy initialization'
        if (concreteSubject == null){ // If it isn't initialized, construct it
            concreteSubject = new ConcreteSubject(); // Logic of load inside constructor
        }
 
        concreteSubject.Request(); // Else make the request
    }
}