/**
 * This class represents a simple rectangle... bla bla bla...
 * 
 */
public class Rectangle {
    private double height;
    private double width;
    private String color;

    public static Rectangle createNew(String color) {
        Rectangle rect = new Rectangle();
        rect.setHeight(1);
        rect.setWidth(1);
        rect.setColor(color);
        return rect;
    }

    /**
     * This method prints the rectangle's data to
     * the screen in a user-friendly format.
     */
    public void print() {
        System.out.println("Rectangle:");
        System.out.printf("\theight: %.2f%n", height);
        System.out.printf("\twidth:  %.2f%n", width);
        System.out.printf("\tcolor:  %s%n", color);
    }

    /**
     * Set the height.
     * 
     * @param height the new height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void doubleSize() {
        height = 2 * height;
        width = 2 * width;
    }

    /**
     * Calculate the area for the rectangle.
     * 
     * @return the area, always as positivt number
     */
    public double area() {
        if (width < 0 || height < 0) {
            System.out.println("något är negativt");
            return Math.abs(width * height);
        }
        
        System.out.println("allt är positivt");
        return width * height;
    }
}
