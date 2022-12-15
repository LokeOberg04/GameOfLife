package Model;
import View.*;

public class Model {
    int width;
    int height;
    public Model(int width, int height) {
    this.width = width;
    this.height = height;
    }

    public void update() {

    }

    public int getGranne(Point point) {
        int grannar = 0;

        return grannar;
    }

    public Shape[] getShapes() {
        Point[] points = {new Point(7,7), new Point(7,8), new Point(8,8)};

        return (Shape[])points;
    }
}
