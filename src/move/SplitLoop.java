package move;

import java.util.ArrayList;
import java.util.List;

public class SplitLoop {
    public void sample() {
        List<People> peopleList = new ArrayList<>();
        int averageAge = 0;
        int totalSalary = 0;
        for (People people : peopleList) {
            averageAge += people.age;
            totalSalary += people.salary;
        }
        averageAge = averageAge / peopleList.size();
    }

    public void refactor() {
        List<People> peopleList = new ArrayList<>();
        int averageAge = 0;
        int totalSalary = 0;
        for (People people : peopleList) {
            averageAge += people.age;
        }
        for (People people : peopleList) {
            totalSalary += people.salary;
        }
        averageAge = averageAge / peopleList.size();
    }

}

class People {
    public int age;
    public int salary;
}
