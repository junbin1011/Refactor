package api;

public class RemoveFlagArgument {
    String height;
    String width;

    void setDimension(String name, String value) {
        if (name.equals("height")) {
            this.height = value;
            return;
        }
        if (name.equals("width")) {
            this.width = value;
            return;
        }
    }

    void setHeight(String value) {
        this.height = value;
    }

    void setWidth(String value) {
        this.width = value;
    }
}
