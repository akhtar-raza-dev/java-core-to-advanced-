package L5_OOPconcept;

public class L12_3_HourlyEmployee extends L12_2_Employee {
    private double hourlyPayRate;

    public L12_3_HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }

    public double getDoublePay(){
        return 2 * collectPay();
    }
}
