package L5_OOPconcept;

public class L12_1_Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public L12_1_Worker() {
    }
    public L12_1_Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return (currentYear - birthYear);
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
       this.endDate = endDate; //? this is similar to setter, but for the business logic terminate method can be used and can be overridden by subclasses if needed.
    }

    @Override
    public String toString() {
        return "L12Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
