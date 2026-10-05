package L5_OOPconcept;

public class L12_3_SalariedEmployee extends L12_2_Employee {

    double annualSalary;
    boolean isRetired;

    public L12_3_SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay(){
        double payCheck = annualSalary / 26; //? You receive 26 paychecks, each covering 2 weeks of your salary, which totals 52 weeks of pay for the year.
        return isRetired ? payCheck * 0.5 : payCheck;
    }

    public void retire() {
        terminate("12/12/2025");
        isRetired = true;
    }
}
