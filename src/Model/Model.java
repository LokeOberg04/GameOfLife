package Model;
import View.*;

import java.util.Arrays;

public class Model {
    int width;
    int height;
    public Model(int width, int height) {
    this.width = width;
    this.height = height;
    }

    public void update(Point[] points) {
        for (int i = 0; i<points.length; i++) {
            getGrannar(points);
        }
    }

    public int getGrannar(Point[] points) {
        int grannar = -1;

        for (int x = 0; x<points.length; x++) {
        for (int i = 0; i<points.length; i++) {
            if (points[x].getX() - points[i].getX() <= 1 && points[x].getX() - points[i].getX() >= -1 && points[x].getY() - points[i].getY() <= 1 && points[x].getY() - points[i].getY() >= -1) {
                grannar++;
            }
        }
            System.out.println(x+1 + " has " + grannar + " grannar");
        if(grannar < 2 || grannar > 3) {
            System.out.println(points[x] + " should be dead");
            // remove that bih
        }
        grannar = -1;
        }
        return grannar;
    }

    public int getGranne(int width, int height, Point[] points) {
        int grannar = 0;
        int x;
        int y;

        for (int i = 0; i<points.length; i++) {
            for (int p = 1; p < height; p++) {
                y = p;
                x = 1;
                for (int o = 2; o < width; o++) {
                    if (x - points[i].getX() <= 1 && x - points[i].getX() >= -1 && y - points[i].getY() <= 1 && y - points[i].getY() >= -1) {
                        grannar++;
                    }
                    x = o;
                }
            }
            System.out.println(i+1 + " has " + grannar + " grannar");
            grannar = 0;
        }

        return grannar;
    }

    public Point[] getPoints() {
        Point[] points = {new Point(7,7), new Point(7,8), new Point(8,8), new Point(10,8), new Point(11,8)};

        return points;
    }
    public Shape[] getShapes() {
        Point[] points = {new Point(7,7), new Point(7,8), new Point(8,8), new Point(10,8), new Point(11,8)};

        return (Shape[])points;
    }
}
