package move;

public class MoveField {
}

class Customer {
    CustomerContract plan;

    public CustomerContract getPlan() {
        return plan;
    }

    public int getDiscountRate() {
        return CustomerContract.discountRate;
    }
}

class CustomerContract {
    static int discountRate;
}
