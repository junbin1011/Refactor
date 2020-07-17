package api;

public class ReplaceCommandWithFunction {

    void call() {
        new ChargeCalculator(1, 2, 3).charge();
    }

    void refactor() {
        charge();
    }

    private void charge() {
        new ChargeCalculatorRefactor().charge(1, 2, 3);
    }
}

class ChargeCalculator {

    int customer;
    int usage;
    int provider;

    public ChargeCalculator(int customer, int usage, int provider) {
        this.customer = customer;
        this.usage = usage;
        this.provider = provider;
    }

    int baseCharge() {
        return this.customer * this.usage;
    }

    int charge() {
        return this.baseCharge() + this.provider;
    }
}

class ChargeCalculatorRefactor {

    int charge(int customer, int usage, int provider) {
        return customer * usage + provider;
    }
}