package api;


public class PreserveWholeObject {
    Room aRoom = new Room();
    Plan aPlan = new Plan();

    public void sample() {
        int low = aRoom.daysTempRange.low;
        int high = aRoom.daysTempRange.high;
        if (aPlan.withinRange(low, high)) {

        }
    }

    public void refactor() {

        if (aPlan.withinRange(aRoom)) {

        }
    }

    class Plan {

        public boolean withinRange(int low, int high) {
            return low > high;
        }

        public boolean withinRange(Room aRoom) {
            return aRoom.daysTempRange.low > aRoom.daysTempRange.high;
        }
    }

    class Room {
        Range daysTempRange;
    }

    class Range {
        int low;
        int high;
    }
}
