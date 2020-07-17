package extend;

import java.util.List;

public class ExtractSuperclass {
}


class EmployeeExtract {

    String name;
    String id;
    int monthlyCost;

    public EmployeeExtract(String name, String id, int monthlyCost) {
        this.name = name;
        this.id = id;
        this.monthlyCost = monthlyCost;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getMonthlyCost() {
        return monthlyCost;
    }

    public int annualCost() {
        return this.monthlyCost * 12;
    }
}

class DepartmentExtract {
    String name;
    List<String> staff;

    public DepartmentExtract(String name, List<String> staff) {
        this.name = name;
        this.staff = staff;
    }

    public String getName() {
        return name;
    }

    public List<String> getStaff() {
        return staff;
    }

    int totalMonthlyCost() {
        return (int) this.staff.stream().count();
    }

    int headCount() {
        return this.staff.size();
    }

    int totalAnnualCost() {
        return this.totalMonthlyCost() * 12;
    }
}


class EmployeeExtractRefactor extends PartyExtract {

    String id;

    public EmployeeExtractRefactor(String name, String id, int monthlyCost) {
        super(name, monthlyCost);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getMonthlyCost() {
        return monthlyCost;
    }

}

class DepartmentExtractRefactor extends PartyExtract {
    List<String> staff;

    public DepartmentExtractRefactor(String name, List<String> staff) {
        super(name);
        this.staff = staff;
        setMonthlyCost(monthlyCost());
    }

    public String getName() {
        return name;
    }

    public List<String> getStaff() {
        return staff;
    }

    int monthlyCost() {
        return (int) this.staff.stream().count();
    }

    int headCount() {
        return this.staff.size();
    }

}

class PartyExtract {
    int monthlyCost;
    String name;

    public PartyExtract(String name) {
        this.name = name;
    }

    public PartyExtract(String name, int monthlyCost) {
        this.name = name;
        this.monthlyCost = monthlyCost;
    }

    protected void setMonthlyCost(int monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public int annualCost() {
        return this.monthlyCost * 12;
    }
}
