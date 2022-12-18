

public class PointExercise {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {

    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int xA, int yA) {
        return Math.sqrt(((xA - getX()) * (xA - getX())) + ((yA - getY()) * (yA - getY())));
    }

    public double distance(Point p) {
        return distance(p.getX(), p.getY());
    }
}
