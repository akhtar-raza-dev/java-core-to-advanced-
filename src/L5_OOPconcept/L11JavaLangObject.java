package L5_OOPconcept;

//todo     Every class in Java implicitly inherits from the Object class, making it the root of the entire class hierarchy.
//         This is the foundational principle because it means that every object you create, regardless of its type, automatically has a built-in set of common methods and functionalities.
//       - Key Takeaways
//         Universal Superclass: If a class doesn't explicitly extend another class, Java automatically makes it a subclass of java.lang.Object.
//         Inherited Methods: Because of this, every class inherits methods from Object, such as toString(), equals(), and hashCode().
//         Method Overriding: You can override these inherited methods to provide custom functionality. A common example is overriding the toString() method to return a meaningful string representation of an object, instead of the default class name and hash code.

public class L11JavaLangObject  extends Object{    //! or java.lang.Object
    public static void main(String[] args) {

        Student max = new Student("Max", 20);
        System.out.println(max.toString()); //! toString is not explicitly present in the class, so it will be inherited from the Object class and output will be pakageName.className@hashcode -> why hashcode? as for debugging purpose.
        System.out.println(max); //! same as above as the object name is used to print the toString method.

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 15, "Carole");
        System.out.println(jimmy);
    }
}

class Student {
    private String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

//todo if toString is not present in the class, then it will be inherited from the Object class as shown below and output will be pakageName.className@hashcode -> why hashcode? as for debugging purpose.
//    @Override - i made an explicit method below (referring Object class), which is implicitly present in Object class.
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return name + " is " + age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}


class PrimarySchoolStudent extends Student{
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName){
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}
