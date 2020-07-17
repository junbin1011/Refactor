package move;

import java.util.ArrayList;
import java.util.List;

public class MoveStatementsIntoFunction {
    List<String> result = new ArrayList<String>();
    Photo photo = new Photo();

    public void main() {
        result.add("<P>" + photo.title + "</p>");
        photoData(photo);
    }

    public void photoData(Photo photo) {
        result.add("<P>" + photo.location + "</p>");
        result.add("<P>" + photo.data + "</p>");
        return;
    }
}

class MoveStatementsIntoFunctionRefactor {
    List<String> result = new ArrayList<String>();
    Photo photo = new Photo();

    public void main() {
        photoData(photo);
    }

    private void photoData(Photo photo) {
        result.add("<P>" + photo.title + "</p>");
        result.add("<P>" + this.photo.location + "</p>");
        result.add("<P>" + this.photo.data + "</p>");
    }


}


class Photo {
    public String title;
    public String location;
    public String data;
}