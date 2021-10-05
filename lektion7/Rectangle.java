public class Rectangle {
    private double height;
    private double width;
    
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(double length) {
        this(2*length, length);
    }
    
    public Rectangle() {
        this(100);
    }

    public void setWidth(double width) {
        System.out.println("set the value");
        this.width = width;
    }

    public void setWidth(String width) {
        setWidth(Double.parseDouble(width));
    }

    @Override
    public String toString() {
        return "Rectangle [height=" + height + ", width=" + width + "]";
    }
}
