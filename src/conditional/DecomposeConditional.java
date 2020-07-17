package conditional;

public class DecomposeConditional {


    double quantity = 0;
    Plan plan = new Plan();
    Date aDate = new Date();

    public double sample() {
        double charge;
        if (!aDate.isBefore(plan.summerStart) && !aDate.isAfter(plan.summerEnd))
            charge = quantity * plan.summerRate;
        else
            charge = quantity * plan.regularRate + plan.regularServiceCharge;
        return charge;
    }

    public double refactor() {
        double charge;
        if (summer()) {
            charge = summerCharge();
        } else
            charge = regularCharge();
        return charge;
    }

    private double regularCharge() {
        return quantity * plan.regularRate + plan.regularServiceCharge;
    }

    private double summerCharge() {
        double charge;
        charge = quantity * plan.summerRate;
        return charge;
    }

    private boolean summer() {
        return !aDate.isBefore(plan.summerStart) && !aDate.isAfter(plan.summerEnd);
    }
}

class Plan {
    double summerRate;
    double regularRate;
    double regularServiceCharge;
    double summerEnd;
    double summerStart;
}

class Date {

    public boolean isBefore(double start) {
        return true;
    }


    public boolean isAfter(double end) {
        return true;
    }

}