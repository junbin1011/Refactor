package conditional;

public class ReplaceConditionalWithPolymorphism {
}

class Airplane {

    private String type;

    int getCurisingAltitude() {
        switch (this.type) {
            case "777":
                return this.getMaxAltitude() - this.getPassengerCount();
            case "Air Force One":
                return this.getMaxAltitude();
            case "Cessna":
                return this.getMaxAltitude() - this.getFuelExpenditure();
        }
        return 0;
    }

    protected int getFuelExpenditure() {
        return 0;
    }

    protected int getPassengerCount() {
        return 0;
    }

    protected int getMaxAltitude() {
        return 0;
    }
}

class Refactor {
    private Airplane mAirplane;

    public Refactor(Airplane airplane) {
        this.mAirplane = airplane;
    }

    int getCurisingAltitude() {
        return mAirplane.getCurisingAltitude();
    }
}

class Boeing777 extends Airplane {
    // ...
    int getCruisingAltitude() {
        return this.getMaxAltitude() - this.getPassengerCount();
    }
}

class AirForceOne extends Airplane {
    // ...
    int getCruisingAltitude() {
        return this.getMaxAltitude();
    }
}

class Cessna extends Airplane {
    // ...
    int getCruisingAltitude() {
        return this.getMaxAltitude() - this.getFuelExpenditure();
    }
}

