package Model;
import View.*;

public class Model {
    int width;
    int height;
    public Model(int width, int height) {
    this.width = width;
    this.height = height;
    }

    public void update(Point[] points) {
        for (int i = 0; i<points.length; i++) {
            System.out.println(getGranne(width, height, points));
        }
    }

    public int getGranne(int width, int height, Point[] points) {
        int grannar = 0;
        int x;
        int y;

        for (int i = 1; i<height; i++) {
            y=i;
            x=1;
            for (int o = 1; o<width; o++) {
                if (x - points[i].getX() <= 1 && x - points[i].getX() >= -1 && y - points[i].getY() <= 1 && y - points[i].getY() >= -1) {
                    grannar++;
                }
            }
        }

        return grannar;
    }

    public Point[] getPoints() {
        Point[] points = {new Point(7,7), new Point(7,8), new Point(8,8)};

        return points;
    }
    public Shape[] getShapes() {
        Point[] points = {new Point(7,7), new Point(7,8), new Point(8,8)};

        return (Shape[])points;
    }
}
