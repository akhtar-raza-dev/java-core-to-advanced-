package L5_OOPconcept;
/*

1) Method Overloading (Compile-Time Polymorphism)
      Method overloading allows you to have multiple methods with the same name within the same class, as long as their parameter lists are different. The difference can be
      in the number of parameters, the type of parameters, or both. This is resolved at compile-time, meaning the compiler knows exactly which method to call based on the arguments you provide.
Purpose: To increase the readability of the program by reusing the same name for similar actions.

Key Rules:
1) Same method name.
2) Different parameter lists (number, type, or order of parameters).
3) Return type, access modifiers, and exceptions can be different.

NOTE: We can overload both static methods and instance methods.

2) Method Overriding (Run-Time Polymorphism)
      Method overriding occurs when a subclass (child class) has a method with the same method signature (same name, parameters, and return type) as a method in its superclass (parent class).
      This allows a subclass to provide its own specific implementation of an inherited method. This is resolved at runtime, which is why it's called runtime polymorphism or dynamic method dispatch.

Purpose: To provide a specific implementation of a method that is already provided by its superclass.

Key Rules:
1) The method must have the same name as in the parent class.
2) The method must have the same parameters as in the parent class.
3) There must be an "IS-A" relationship (inheritance) between the classes.
4) The access modifier cannot be more restrictive (e.g., if the parent method is protected, the child method can be protected or public, but not private).
5) The return type must be the same or a covariant return type.(explained below)

There are also some important points about method overriding to keep in mind:
1) Only inherited methods can be overridden, in other words, methods can be overridden only in child classes.
2) Constructors and private methods cannot be overridden.
3) Methods that are final cannot be overridden.
4) A subclass can use super.methodName() to call the superclass version of an overridden method.

NOTE: When we override a method, it's recommended to put @Override immediately above the method definition. The @Override statement is not required,
      but it's a way to get the compiler to flag an error if you don't properly override this method. We'll get an error if we don't follow the overriding rules correctly.
      We can't override static methods, only instance methods can be overridden.

 */
public class L14OverloadingAndOverriding {
    public static void main(String[] args) {

        //! Method-overloading example
        DogOverload anotherDog = new DogOverload();
        // Calling the bark() method with no arguments
        System.out.print("Calling bark():");
        anotherDog.bark();

        // Calling the overloaded bark(int) method with an argument
        System.out.print("Calling bark(3):");
        anotherDog.bark(3);

        //! Method-overriding example
        Doggy genericDog = new Doggy();
        System.out.print("Generic Dog says: ");
        genericDog.bark(); // Output: woof

        GermanShepherd myShepherd = new GermanShepherd();
        System.out.print("German Shepherd says: ");
        myShepherd.bark(); // Output: woof woof woof



        //! Covariant return types example
        // --- Scenario 1: Using the parent class ---
        BurgerShack genericShack = new BurgerShack();
        Burger myBurger = genericShack.createBurger(); // The return type is Burger.
        System.out.println("Got a: " + myBurger.getName());

        // --- Scenario 2: Using the child class with the covariant return type ---
        CheeseBurgerShack specializedShack = new CheeseBurgerShack();

        // Thanks to the covariant return type, the compiler knows this method returns a CheeseBurger.
        // We can directly assign it to a CheeseBurger variable without any casting.
        CheeseBurger myCheeseBurger = specializedShack.createBurger();

        System.out.println("Got a: " + myCheeseBurger.getName());

        /*
         * WITHOUT covariant return types, the overridden method would have to return a Burger,
         * and we would need to manually cast it like this, which is less safe and convenient:
         * * Burger burgerFromSpecialShack = specializedShack.createBurger(); // Returns a Burger
         * CheeseBurger myCb = (CheeseBurger) burgerFromSpecialShack; // Manual cast needed!
         */
    }
}

//* Method Overloading Example
class DogOverload {
    public void bark() {
        System.out.println("woof");
    }

    // Second, overloaded version of bark()
    public void bark(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("woof");
        }
    }
}

//* Method Overriding Example
class Doggy {
    public void bark() {
        System.out.println("woof");
    }
}
class GermanShepherd extends Doggy {
    @Override
    public void bark() {
        System.out.println("woof woof woof");
    }
}

//* Covariant Return Types Example

// STEP 1: Define the base class (the general return type).
// A Burger is our general product.
class Burger {
    public String getName() {
        return "Generic Burger";
    }
}

// STEP 2: Define a subclass (the specific, covariant return type).
// A CheeseBurger IS-A Burger, but more specific.
class CheeseBurger extends Burger {
    @Override
    public String getName() {
        return "Delicious CheeseBurger";
    }
}

// STEP 3: Define the parent factory class.
// This class has a method that promises to produce a general Burger.
class BurgerShack {
    /**
     * This is the original method.
     * Its "promise" or "contract" is to return a Burger object.
     */

//todo    Syntax Breakdown
//    The general structure below: AccessModifier ReturnType MethodName(Parameters) { ... Body ... }
//    1) public: This is the access modifier. It dictates who can call this method. public means the method can be called from any other class in the program.
//    2) parentClass/subClass: This is the return type. It's the type of data the method promises to send back after it finishes running. The parentClass/subClass notation illustrates a specific rule:
//        i) When defining a method for the first time, you just choose a return type (e.g., public Burger createBurger() {}).
//        ii) When a child class overrides this method, it can either use the same return type (Burger) or a more specific subclass (CheeseBurger). This ability to return a subclass is called a covariant return type.
//    3) methodName(): This is the name of the method (e.g., createBurger). The parentheses () hold any input parameters the method needs to do its job. If they are empty, the method takes no input.
//    4) {}: These curly braces define the method body. All the code that the method executes is written inside these braces. The return statement inside the body must provide an object that matches the declared return type.
    public Burger createBurger() {
        System.out.println("Burger Shack is making a generic burger.");
        return new Burger();
    }
}

// STEP 4: Define the child factory class that overrides the method.
// This specialized shack extends the original and provides its own version of createBurger().
class CheeseBurgerShack extends BurgerShack {
    /**
     * This is the OVERRIDDEN method.
     * We are changing the return type from Burger to CheeseBurger.
     * This is allowed because CheeseBurger is a subclass of Burger.
     * This is the COVARIANT RETURN TYPE. It makes the method more specific.
     */
    @Override
    public CheeseBurger createBurger() {
        System.out.println("CheeseBurger Shack is making a specialized CheeseBurger.");
        return new CheeseBurger();
    }
}
