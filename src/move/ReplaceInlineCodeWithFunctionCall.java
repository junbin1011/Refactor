package move;

import java.util.ArrayList;
import java.util.List;

public class ReplaceInlineCodeWithFunctionCall {
    public void sample() {
        boolean appliesToMass = false;
        List<String> states = new ArrayList<>();
        for (String s : states) {
            if (s.equals("MA")) {
                appliesToMass = true;
            }
        }
    }
    public void refactor(){
        List<String> states = new ArrayList<>();
        boolean appliesToMass=states.contains("MA");
    }
}
