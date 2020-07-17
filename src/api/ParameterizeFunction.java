package api;

import java.math.BigDecimal;

public class ParameterizeFunction {
    void tenPercentRaise(Person aPerson) {
        aPerson.salary = aPerson.salary.scaleByPowerOfTen(10);
    }

    void fivePercentRaise(Person aPerson) {
        aPerson.salary = aPerson.salary.scaleByPowerOfTen(5);
    }

    private class Person {
        BigDecimal salary;
    }

    void raise(Person aPerson, int factor) {
        aPerson.salary = aPerson.salary.scaleByPowerOfTen(factor);
    }
}
