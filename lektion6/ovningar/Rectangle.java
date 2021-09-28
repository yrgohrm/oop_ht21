public class Rectangle {
    private double height;
    private double width;

    public Rectangle() {
        this(1, 1);
    }
    
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public String toString() {
        return String.format("En rektangel med höjden %f och bredden %f", 
                             height, width);
    }
}