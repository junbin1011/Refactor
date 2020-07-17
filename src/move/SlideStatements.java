package move;

import java.util.ArrayList;
import java.util.List;

public class SlideStatements {
    public List<String> sample() {
        String result;
        List<String> all = new ArrayList<>();
        int availableResources = 0;
        if (availableResources == 0) {
            result = createResource();
            all.add(result);
        } else {
            result = availableResources();
            all.add(result);
        }
        return all;
    }

    public List<String> refactor() {
        String result;
        List<String> all = new ArrayList<>();
        int availableResources = 0;
        if (availableResources == 0) {
            result = createResource();
        } else {
            result = availableResources();
        }
        all.add(result);
        return all;
    }


    private String availableResources() {
        return "";
    }

    private String createResource() {
        return "";
    }

}
