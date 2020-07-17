package extend;


public class ReplaceSubclasswithDelegate {


}

class Order {
    private WareHouse warehouse;

    int daysToShip() {
        return this.warehouse.daysToShip;
    }

}

class PriorityOrder extends Order {
    private Priority priorityPlan;

    int daysToShip() {
        return this.priorityPlan.daysToShip;
    }
}

class Priority {
    int daysToShip;
}


class WareHouse {
    public int daysToShip;
}

class OrderRefactor {
    private PriorityOrderRefactorDelegate priorityOrderRefactorDelegate;
    private WareHouse warehouse;

    public void setPriorityOrderRefactorDelegate(PriorityOrderRefactorDelegate priorityOrderRefactorDelegate) {
        this.priorityOrderRefactorDelegate = priorityOrderRefactorDelegate;
    }

    int daysToShip() {
        return priorityOrderRefactorDelegate != null ? priorityOrderRefactorDelegate.daysToShip() : warehouse.daysToShip;
    }


}


class PriorityOrderRefactorDelegate {
    private Priority priorityPlan;


    int daysToShip() {
        return this.priorityPlan.daysToShip;
    }

}
