package extend;

import java.util.List;

public class ReplaceSuperclassWithDelegate {
}


class CatalogItem {
    String id;
    String title;
    List<String> tags;

    public CatalogItem(String id, String title, List<String> tags) {
        this.id = id;
        this.title = title;
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getTags() {
        return tags;
    }
}

class Scroll {

    String lastCleaned;
    CatalogItem catalogItem;

    public Scroll(String id, String title, List<String> tags, String dateLastCleaned) {
        catalogItem = new CatalogItem(id, title, tags);
        this.lastCleaned = dateLastCleaned;
    }

    boolean needsCleaning(String targetDate) {
        int threshold = this.hasTag("revered") ? 700 : 1500;
        return this.daysSinceLastCleaning(targetDate) > threshold;
    }

    private int daysSinceLastCleaning(String targetDate) {
        return 10000;
    }

    private boolean hasTag(String revered) {
        return catalogItem.tags.contains(revered);
    }


}