public class WallAreaExercise {
    private double width;
    private double height;

    public WallAreaExercise() {

    }

    public WallAreaExercise(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
    }

    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }

    public double getArea() {
        return getHeight() * getWidth();
    }
}
