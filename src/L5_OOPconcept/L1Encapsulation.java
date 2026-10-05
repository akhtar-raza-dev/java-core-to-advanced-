package L5_OOPconcept;

public class L1Encapsulation {
    public static void main(String[] args) {

//?     L1Car car;  // an uninitialized reference variable causes a compile error if we try to use it
//?     L1Car car = null;  // a reference variable that is explicitly set to null causes a runtime NullPointerException if we try to use it
//*     Bottom line is that we must always initialize reference variables with new keyword, name of class and parentheses to create a new object before we can use them
//!     For Primitive Variables: we use a primitive data type keyword (int, double, boolean, etc.). The variable directly holds a simple value

//!     For Reference Variables: we use a class name (like Car, String, or Scanner) as the type.
//!                              The variable holds a reference that identifies an object, conceptually in the heap.
//!                              It is not a normal hexadecimal address that Java code can directly read or manipulate.

        L1Car car = new L1Car();

        /*
         * The JVM creates heap memory when a Java program starts. The heap
         * stores objects and arrays whose lifetime may extend beyond one method.
         *
         * For example:
         *
         *     L1Car car = new L1Car();
         *
         * When Java executes this line:
         *
         *     1. The JVM creates the heap when the program starts.
         *     2. new L1Car() requests space for an L1Car object.
         *     3. The object is created in the heap.
         *     4. car variable receives a reference to that object.
         *
         *     Stack                         Heap
         *     +-------------+              +----------------+
         *     | car --------|-------------> | L1Car object  |
         *     +-------------+              +----------------+
         *
         * The object can continue to exist after the method that created it
         * finishes:
         *
         *     public static L1Car createCar() {
         *         L1Car car = new L1Car();
         *         return car;
         *     }
         *
         * When createCar() finishes, its local variable disappears. However,
         * the L1Car object remains because the returned reference points to it.
         *
         *     Stack                         Heap
         *     +----------------+            +----------------+
         *     | returned ref --|-----------> | L1Car object  |
         *     +----------------+            +----------------+
         *
         * When no references point to an object, it becomes eligible for
         * garbage collection:
         *
         *     L1Car car = new L1Car();
         *     car = null; // setting null to break connection
         *
         *     No reference                    Heap
         *     to the object                   +----------------+
         *                                     | L1Car object  |
         *                                     | unused        |
         *                                     +----------------+
         *
         * The JVM eventually removes the unused object automatically.
         */

//!       since private fields we can't use dot notation to access them (but valid for public, protected, default).
//        car.make = "Porsche";
//        car.model = "Carrera";
//        System.out.println("make = " + car.make);
//        System.out.println("model = " + car.model);
//?     Using setter methods to modify private fields
        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");

//?     Using getter methods to access private fields
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());

        car.describe();
        
        L1Car targa = new L1Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(4);
        targa.setConvertible(false);
        targa.setColor("red");

        targa.describe();

        //?  But this way to assign data to private fields is not recommended.
        //?  Instead, we can use the constructor to assign data to private fields. We see in future videos..
    }
}


/*
 * Interview note: A class is a blueprint for creating objects.
 *
 * It defines:
 * - Fields: the data or state of an object.
 * - Methods: the actions or behavior of an object.
 *
 * Fields and methods are called members of a class. A class can also contain
 * constructors, nested classes, interfaces, enums, and initializer blocks.
 */

/*
 * Instance members vs. static members:
 *
 * Instance field or method:
 * - Belongs to a particular object.
 * - Is accessed through an object, such as car.getMake().
 * - Each object has its own instance fields.
 * - An instance method can directly access instance fields.
 *
 * Static field or method:
 * - Belongs to the class rather than to an individual object.
 * - Is shared by all objects of that class.
 * - Is normally accessed through the class name, such as Math.max().
 * - A static method cannot directly access instance fields because it does not
 *   belong to a particular object.
 */

/*
 * PACKAGES & ACCESS CONTROL
 *
 * 1. Package Declaration:
 *    - Must be the first statement in the file (e.g., package L5_OOPconcept;).
 *    - Groups related classes and prevents naming conflicts.
 *
 * 2. Top-Level Class Visibility (can not be private and protected):
 *    - public: Accessible from any package.
 *    - default (no modifier) or Package-private: accessible only within this package.
 *
 * 3. Member Access:
 *    - Same-package classes can access package-private members.
 *    - 'private' members are visible ONLY inside their declaring class.
 *
 * 4. File Structure Rules:
 *    - A file can have multiple top-level classes, but ONLY ONE 'public' class.
 *    - The public class name must match the file name.
 *    - Nested classes can use any modifier (public, protected, package-private, private).
 */
//! public class Mahindra{ // Error: only one public is allowed per file and which eventually becomes file name
//  }

//* Naming conventions:
/*
    Packages: Names should be in all lowercase. It's standard practice to use a reversed internet domain name as a unique prefix (e.g., com.example.project). Dashes(Hyphen) in domain names should be replaced with underscores, and components starting with a number or a Java keyword should be prefixed with an underscore.
    Classes: Use CamelCase (also known as UpperCamelCase), starting with a capital letter. Class names should generally be nouns (e.g., LinkedList, GearBox).
    Interfaces: Follow the same CamelCase convention as classes. The name should describe what the implementing object can do or what it will become (e.g., Comparable, Serializable).
    Methods: Use mixedCase (also known as lowerCamelCase), starting with a lowercase letter. Method names are often verbs because they represent actions (e.g., getName, addPlayer).
    Constants: Names should be in all uppercase, with words separated by underscores (e.g., MAX_INT). They must be declared using the final keyword.
    Variables: Use mixedCase, starting with a lowercase letter. The names should be meaningful and indicative of their purpose (e.g., league, boxLength).
    Type Parameters (Generics): These are typically a single, capital letter to denote a type, such as T for Type, E for Element, K for Key, and V for Value.
 */

/*
 * Interview note: Access modifiers control who can access a class member
 * (field, method, or constructor).
 *
 * Access from:              Class  Package  Subclass outside package  Anywhere
 * private                      Y       N              N                    N
 * package-private (default)    Y       Y              N                    N
 * protected                    Y       Y              Y                    N
 * public                       Y       Y              Y                    Y
 *
 * private: accessible only inside the declaring class.
 * package-private(default): accessible to classes in the same package. It is used when no access modifier is written.
 * protected: accessible to classes in the same package and in subclasses outside it.
 * public: accessible from any class that can access the declaring class.
 *
 * Example project structure:
 *
 *     src/
 *     +-- company/
 *     |   +-- Base.java
 *     |   +-- SamePackage.java
 *     +-- client/
 *         +-- Child.java
 *         +-- Unrelated.java
 *
 *     // company/Base.java
 *     package company;
 *     public class Base {
 *         private int privateValue;
 *         int packageValue;
 *         protected int protectedValue;
 *         public int publicValue;
 *     }
 *
 *     // client/Child.java
 *     package client;
 *     import company.Base;
 *
 *     public class Child extends Base {
 *         void test() {
// *           // privateValue;       // Not accessible
// *           // packageValue;       // Not accessible
 *             protectedValue = 10;   // Accessible through inheritance
 *             publicValue = 20;      // Accessible
 *         }
 *     }
 *
 * A subclass outside the package can access a protected member through the
 * inherited part of itself. It cannot access that member through an unrelated
 * Base object reference. This is why protected is different from public.
 *
 */
/*
 * Interview distinction:
 *
 * Static vs. instance answers: "Who owns this member?"
 * - A static member belongs to the class and is shared by all its objects.
 * - An instance member belongs to a particular object; each object has its
 *   own instance state.
 *
 * Access modifiers answer: "Who is allowed to access this member?"
 * - private: only the declaring class
 * - package-private: classes in the same package
 * - protected: classes in the same package and subclasses in other packages
 * - public: any accessible class
 */

/* OOP
* 1. Class
“A class is like a blueprint for creating objects. It defines what properties and actions an object will have. For example, if we have a Car class, we can define properties like color and model, and actions like start() and stop(). The class itself is just the design; the actual car is created as an object from it.”

Example:
Car → color, model, start(), stop()
2. Object
“An object is an actual instance of a class. It contains real values for the properties defined by the class and can use its methods. For example, if Car is a class, then a red BMW can be an object of that class. Another car can be a blue Audi, so each object can have its own data.”

Example:
Car → class
red BMW → object
3. Inheritance
“Inheritance allows one class to reuse the properties and methods of another class. For example, we can have a Vehicle class with common methods like start() and stop(), and then a Car class can inherit those methods from Vehicle. This avoids writing the same common functionality again.”

Example:
Vehicle → start(), stop()
↓
Car → inherits them + adds its own features
4. Encapsulation
“Encapsulation means keeping an object's data protected and controlling how that data can be accessed or changed. For example, in a Car class, we can keep the speed private and provide methods like accelerate() and brake() to change it. This prevents other parts of the program from directly setting an invalid speed.”

Example:
speed → protected
accelerate() / brake() → controlled access
5. Abstraction
“Abstraction means hiding the internal complexity and showing only what the user needs to use. For example, when I drive a car, I use the steering, brake and accelerator, but I don't need to know how the engine works internally. Similarly, in programming, I can call a method like start() without knowing all the internal code behind it.”

Example:
You use → start()
You don't need to know → how the engine-starting logic works internally.
6. Polymorphism
“Polymorphism means the same method can behave differently depending on the object. For example, suppose Vehicle has a start() method. A car, bike and truck can all have their own implementation of start(). So when we call start(), the behavior can be different depending on which vehicle object we are using.”

Example:
start() → Car → car-specific behavior
start() → Bike → bike-specific behavior
*
* */
//TODO    INTERVIEW DEFINE
//   [ Class ]
//    A class is a blueprint or template that defines the structure and behavior of objects. It specifies:
//            - Attributes (data/properties) that objects will have
//            - Methods(functions/behaviors) that objects can perform
// .
//    Think of it as a cookie cutter - it defines the shape, but isn't the actual cookie.
//    [ Object ]
//    An object is a concrete instance of a class. It's a real entity in memory that:
//            - Has actual values for the attributes defined in its class
//            - Can invoke the methods defined in its class
//            - Maintains its own state independently from other objects of the same class
// .
//    It's the actual cookie made from the cookie cutter.
//    [ Polymorphism ]
//            Polymorphism means "many forms" - it's the ability of different objects to respond to the same interface in their own specific way. It allows:
//            - The same method call to behave differently depending on the object type
//            - Writing code that works with multiple types without knowing their specific implementation
//            - Runtime determination of which method implementation to use
// .
//    Like asking different animals to "make a sound" - each responds appropriately (dog barks, cat meows, cow moos).
//    [ Inheritance]
//            Inheritance is a mechanism where a new class (child/derived/subclass) acquires properties and behaviors from an existing class (parent/base/superclass). It enables:
//            - Code reuse by extending existing functionality
//            - Hierarchical relationships between classes
//            - Specialization where child classes add or modify parent behavior
//            - "Is-a" relationships (e.g., Car is-a Vehicle)
// .
//    Like a child inheriting traits from parents, but also developing their own unique characteristics.
//    [ Encapsulation ]
//            Encapsulation is the bundling of data and methods together while controlling access to them. It provides:
//            - Data hiding by making internal details private
//            - Controlled access through public interfaces (getters/setters)
//            - Protection of object integrity by preventing unauthorized modification
//            - Implementation hiding - users don't need to know internal workings
// .
//    Like a capsule that contains medicine - you can use it without knowing its internal composition.
//    [ Abstraction ]
//            Abstraction is the process of hiding complex implementation details while showing only essential features. It involves:
//            - Simplifying complexity by focusing on what an object does, not how
//            - Creating models that represent real-world entities in simplified form
//            - Defining contracts through interfaces without specifying implementation
//            - Reducing cognitive load by providing clear, simple interfaces
// .
//    Like driving a car - you use the steering wheel and pedals without needing to understand the engine mechanics.
