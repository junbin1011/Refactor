package api;

public class ReplaceQueryWithParameter {
    Thermostat thermostat = new Thermostat();

    private int max;
    private int min;

    int targetTemperature() {
        if (thermostat.selectedTemperature > this.max) return this.max;
        else if (thermostat.selectedTemperature < this.min) return this.min;
        else return thermostat.selectedTemperature;
    }


    void call() {
        if (targetTemperature() > thermostat.currentTemperature) {
            setToHeat();
        } else if (targetTemperature() < thermostat.currentTemperature) {
            setToCool();
        } else {
            setOff();
        }
    }

    void setToHeat() {
    }

    void setToCool() {
    }

    void setOff() {
    }

    void callRefactor() {
        if (targetTemperature(thermostat.selectedTemperature) > thermostat.currentTemperature) {
            setToHeat();
        } else if (targetTemperature(thermostat.selectedTemperature) < thermostat.currentTemperature) {
            setToCool();
        } else {
            setOff();
        }
    }


    private int targetTemperature(int selectedTemperature) {
        if (selectedTemperature > this.max) return this.max;
        else if (selectedTemperature < this.min) return this.min;
        else return selectedTemperature;
    }
}


class Thermostat {

    public int selectedTemperature;
    public int currentTemperature;
}
