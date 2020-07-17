package data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReplaceDerivedVariableWithQuery {
}

class ProductionPlan {
    int production;
    List<Integer> adjustments = new ArrayList<>();

    public int getProduction() {
        return production;
    }

    public void applyAdjustment(int anAdjustment) {
        adjustments.add(anAdjustment);
        this.production += anAdjustment;
    }
}

class ProductionPlanRefactor {
    List<Integer> adjustments = new ArrayList<>();

    public int getProduction() {
        return (int) adjustments.stream().collect(Collectors.summarizingInt(value -> value)).getSum();
    }

    public void applyAdjustment(int anAdjustment) {
        adjustments.add(anAdjustment);
    }
}