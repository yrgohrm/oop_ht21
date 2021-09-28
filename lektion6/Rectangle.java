public class Rectangle {
    private double height;
    private double width;
    private String color;

    public Rectangle() {
        this.height = 1.0;
        this.width = 1.0;
        this.color = "yellow";
    }

    public Rectangle(double size) {
        this.height = size;
        this.width = size;
        this.color = "red";
    }

    public Rectangle(String color) {
        this.height = 1.0;
        this.width = 1.0;
        this.color = color;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
        this.color = "yellow";
    }

    public Rectangle(double height, double width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public void print() {
        System.out.println(height);
        System.out.println(width);
        System.out.println(color);
    }
}
