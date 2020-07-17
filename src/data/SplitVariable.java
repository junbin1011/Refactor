package data;

public class SplitVariable {
    public void sample() {
        int height = 0;
        int width = 0;
        int temp = 2 * (height + width);
        System.out.print(temp);
        temp = height * width;
        System.out.print(temp);
    }

    public void refactor() {
        int height = 0;
        int width = 0;
        int perimeter = 2 * (height + width);
        System.out.print(perimeter);
        int area = height * width;
        System.out.print(area);
    }
}
