package L5_OOPconcept;

public class L12_0_ChallengeInheritance {
    public static void main(String[] args) {

        L12_2_Employee tim = new L12_2_Employee("Tim", "11/11/1985", "01/01/2020" );
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        L12_3_SalariedEmployee joe = new L12_3_SalariedEmployee("Joe", "11/11/1990", "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());
        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());

        L12_3_HourlyEmployee mary = new L12_3_HourlyEmployee("Mary", "05/05/1970", "03/03/201", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}
