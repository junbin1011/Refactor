package extend;

public class PullUpMethod {
}


class Employee extends Party {
    private int monthlyCost;

    int annualCost() {
        return this.monthlyCost * 12;
    }
}

class Department extends Party {
    private int monthlyCost;

    int totalAnnualCost() {
        return this.monthlyCost * 12;
    }

}

class Party {

}

class EmployeeRefactor extends PartyRefactor {

}

class DepartmentRefactor extends PartyRefactor {


}

class PartyRefactor {

    private int monthlyCost;

    int annualCost() {
        return this.monthlyCost * 12;
    }
}