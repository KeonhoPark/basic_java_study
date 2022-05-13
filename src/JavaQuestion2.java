class Point{
    int x;
    int y;

    public Point(){

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString(){
        return "x : "+getX()+" y : "+getY()+" ";
    }
}

class Circle extends Point{
    double radius;

    public Circle(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.radius = r;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;

    }

    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }

//    @Override
//    public String toString() {
//        return "x : "+getX()+" y : "+getY()+" area : "+getArea()+" circumference : "+getCircumference();
//
//    }
}

public class JavaQuestion2 {

    public static void main(String[] args) {

        Circle c = new Circle(2,3,5);
        System.out.println(c.toString() + " circumference : "+String.format("%.2f", c.getCircumference()) +" area : "+ String.format("%.2f", c.getArea()));
    }
}
