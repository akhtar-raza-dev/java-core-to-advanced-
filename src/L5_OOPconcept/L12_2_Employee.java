package L5_OOPconcept;

public class L12_2_Employee extends L12_1_Worker {
    private long employeeId;
    private String hireDate;
    private static int employeeNo = 1;

    public L12_2_Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = L12_2_Employee.employeeNo++; //? we use the classname as a static variable to avoid confusion
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "L12_2_Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
