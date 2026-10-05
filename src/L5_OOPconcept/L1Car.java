package L5_OOPconcept;

public class L1Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "white" ;
    private int doors = 4;
    private boolean convertible = false;

    // Getters and setters provide controlled access to the private fields.

    // A getter returns the current value of a private field.
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        //! naming convention for boolean getter methods is to use "is" prefix instead of "get"
        return convertible;
    }

    //*    A setter is a method on a class that sets the value of a private field. They all have type void because they do not return a value.
    //*    Setters often include validation logic to ensure that only valid data is assigned to the field.

    // 'this' refers to the current Car object.
    // Here, 'make' is the method parameter, while 'this.make' is the object's field.
    // Therefore, 'this.make = make' stores the parameter value in the object's field.

    public void setMake(String make) {

        if (make == null) make = "Unknown";
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake) {
            case "holden", "ford", "honda", "porsche", "tesla" -> this.make = make; //? Without this.make, the line make = make; would just assign the parameter's value to itself, leaving the instance variable unchanged.
            default -> this.make = "Unsupported";
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describe() {
        /*
         * If fields are not given values, Java assigns default values:
         *
         *                 Car object
         *        +---------------------------+
         *        | make       -> null        |  String reference
         *        | model      -> null        |  String reference
         *        | color      -> null        |  String reference
         *        | doors      -> 0           |  int primitive
         *        | convertible-> false       |  boolean primitive
         *        +---------------------------+
         *
         * Reference type: String                Primitive type: int
         * ----------------                       -------------------
         * The color variable does not store      The doors variable stores
         * the String value directly. It stores    the number directly.
         * a reference to a String object.
         *
         * Car object in memory                    Heap memory
         * +------------------+                   +-------------+
         * | color (reference)| ----------------> | "White"      |
         * +------------------+                   +-------------+
         *
         * +------------------+
         * | doors = 4        |  The value 4 is stored directly here.
         * +------------------+
         *
         * If color does not point to a String object, its value is null:
         *
         * +------------------+                   +-------------+
         * | color = null      | ----------------> | no object   |
         * +------------------+                   +-------------+
         *
         * A reference variable can contain null. A primitive variable
         * cannot contain null; it always contains a value such as 0 or false.
         * Therefore, if these fields are not initialized, the output is:
         *
         *     0-Door null null null false
         */
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : "false"));
    }
}
