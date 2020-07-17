package conditional;

public class ConsolidateConditionalExpression {
    private Employee anEmployee;

    public int sample() {
        if (anEmployee.seniority < 2) return 0;
        if (anEmployee.monthsDisabled > 12) return 0;
        if (anEmployee.isPartTime) return 0;
        return 0;
    }

    public int refactor() {
        if (isNotEligibleForDisability()) return 0;
        return 0;
    }

    private boolean isNotEligibleForDisability() {
        return anEmployee.seniority < 2 || anEmployee.monthsDisabled > 12 || anEmployee.isPartTime;
    }
}

class Employee {

    public int seniority;
    public int monthsDisabled;
    public boolean isPartTime;
}