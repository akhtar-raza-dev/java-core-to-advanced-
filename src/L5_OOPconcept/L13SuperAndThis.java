package L5_OOPconcept;
/*
1) this vs. super :These keywords are used to access members (variables and methods) of a class.
                   this: This keyword refers to the current instance of the class.
                         Primary Use: It's mainly used to distinguish between instance variables and parameters when they share the same name, especially within constructors and setter methods.
                   super: This keyword refers to the immediate parent class object.
                          Primary Use: It's used to access members of the parent class. This is particularly useful in method overriding when you need to call the parent class's version of a method from within the child class's overridden method.
Note: Neither this nor super can be used in a static context (like a static method), as they are tied to an object instance.

2) this() vs. super(): These are special calls used only within constructors to invoke other constructors.
                       this(): This calls another overloaded constructor from within the same class.
                               Purpose: It enables constructor chaining. This pattern helps reduce code duplication by centralizing the initialization logic in one main constructor, which the other constructors call.
                       super(): This calls a constructor from the immediate parent class.
                                Purpose: It ensures that the parent part of the object is initialized before the child class initializes its own fields.
 */
//*  A call to this() or super() must be the very first statement in a constructor.
//*  A constructor can have a call to either this() or super(), but never both.

public class L13SuperAndThis {
    public static void main(String[] args) {

        SubClass s = new SubClass();
        s.printMethod();

        Rectangle rect = new Rectangle(10, 20);
        System.out.println(rect);
    }
}

//todo   super and this
class SuperClass {
    public void printMethod() {
        System.out.println("Printed in SuperClass");
    }
}

class SubClass extends SuperClass {
    @Override
    public void printMethod() {
//      printMethod();  When a method in a child class overrides a method from its parent, calling it by name from within itself will result in infinite recursion. This means the method repeatedly calls itself, consuming stack memory until a StackOverflowError occurs.
        super.printMethod(); //? so we use super
        System.out.println("Printed in SubClass");
    }
}

//todo  super() and this()
// Implicit Call: If you do not explicitly add this() or super() to a constructor, the Java compiler automatically inserts a call to the parent's no-argument constructor (super();) as the very first line.
// Here's the logic:
// 1.You call a constructor that starts with this().
// 2.That this() call invokes another constructor within the same class.
// 3.This process continues, creating a "constructor chain" ⛓️.
// 4.The chain must end with a constructor that does not call this().
// 5.It is in this final constructor of the chain that the call to super() is made, either explicitly by you or implicitly by the compiler.
// Essentially, the super() call is guaranteed to happen exactly once, at the end of any this() chain, to ensure the parent class is initialized before the child class.

class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    // 1st constructor
    public Rectangle(int x, int y) {
        this(x, y, 0, 0); // calls 2nd constructor
    }

    // 2nd constructor
    public Rectangle(int x, int y, int width, int height) {
        super(x, y); // calls constructor from parent (Shape)
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                "} " + super.toString();
    }
}
