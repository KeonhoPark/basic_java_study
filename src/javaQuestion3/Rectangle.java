package javaQuestion3;

import java.awt.Point;

public class Rectangle {

    public static final int WIDTH = 50;
    public static final int HEIGHT = 50;

    private Point upperLeft = new Point();
    private Point lowerRight = new Point();

    public Rectangle(Point upperLeft) {
        this.upperLeft.x = upperLeft.x;
        this.upperLeft.y = upperLeft.y;
        Point p = new Point(upperLeft.x + WIDTH, upperLeft.y + HEIGHT);
        setLowerRight(p);
    }

    public Rectangle(Point upperLeft, Point lowerRight) {
        this.upperLeft = upperLeft;
        this.lowerRight = lowerRight;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    public Point getLowerRight() {
        return lowerRight;
    }

    public void setLowerRight(Point lowerRight) {
        this.lowerRight = lowerRight;
    }

    public void translate(int x, int y) {
        getUpperLeft().translate(x, y);
        getLowerRight().translate(x, y);

    }

    public String toString() {
        return "UL : x = " + getUpperLeft().x + " y = " + getUpperLeft().y + ", LR : x = " + getLowerRight().x + " y = " + getLowerRight().y + "\n";
    }
}
