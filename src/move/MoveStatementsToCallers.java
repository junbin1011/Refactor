package move;

import java.util.ArrayList;
import java.util.List;

public class MoveStatementsToCallers {
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


class MoveStatementsToCallersRefactor {

    List<String> result = new ArrayList<String>();
    Photo photo = new Photo();

    public void main() {
        result.add("<P>" + photo.title + "</p>");
        photoData(this.photo);
    }


    private void photoData(Photo photo) {
        result.add("<P>" + photo.location + "</p>");
        result.add("<P>" + photo.data + "</p>");
    }

}

