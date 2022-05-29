package javaQuestion3;

import java.awt.*;

public class Block1 {

        private Rectangle[] rectangles = new Rectangle[4];

        public Block1(Point point) {
            Rectangle[] rectangles = {new Rectangle(point), new Rectangle(point), new Rectangle(point), new Rectangle(point)};

            rectangles[0].setUpperLeft(point);
            rectangles[1].translate(Rectangle.WIDTH, 0);
            rectangles[2].translate(0, Rectangle.HEIGHT);
            rectangles[3].translate(Rectangle.WIDTH, Rectangle.HEIGHT);

        }

        public Block1(int x, int y) {
            Point point = new Point(x, y);
            Rectangle[] rectangles = {new Rectangle(point), new Rectangle(point), new Rectangle(point), new Rectangle(point)};

            rectangles[0].setUpperLeft(point);
            rectangles[1].translate(Rectangle.WIDTH, 0);
            rectangles[2].translate(0, Rectangle.HEIGHT);
            rectangles[3].translate(Rectangle.WIDTH, Rectangle.HEIGHT);

            setRectangles(rectangles);

            for (int i = 0; i < rectangles.length; i++){
                System.out.println("rectangles1 = " + rectangles[i]);
            }
        }

        public Rectangle[] getRectangles() {
            return rectangles;
        }

        public void setRectangles(Rectangle[] rectangles) {
            this.rectangles = rectangles;
        }

        public void translate(int x, int y) {
            Rectangle[] rectangles = getRectangles();
            for (int i = 0; i < rectangles.length; i++) {
                rectangles[i].translate(x, y);
            }
        }

        public String toString() {
            Rectangle[] rectangles = getRectangles();
            String string = "";
            for (int i = 0; i < rectangles.length; i++) {
                string = string + getRectangles()[i].toString();
            }
            return string;
        }

}
