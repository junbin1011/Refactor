package move;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ReplaceLoopWithPipeline {
    public void sample() {
        List<String> names = new ArrayList<>();
        for (String s : names) {
            if ("programmer".equals(s)) {
                System.out.println("Programmer");
            }
        }
    }

    public void refactor() {
        List<String> names = new ArrayList<>();
        Stream.of(names).filter("Programmer"::equals).forEach(i -> System.out.println("Programmer"));
    }
}
