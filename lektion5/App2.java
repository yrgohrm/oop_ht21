public class App2 {
    public static void main(String[] args) {
        Rectangle rect2 = Rectangle.createNew("black");
        rect2.print();

        Rectangle rect = new Rectangle();
        rect.setHeight(-12);
        rect.setWidth(10);

        System.out.println("area 1");
        rect.area();
        
        rect.setHeight(12);
        
        System.out.println("area 2");
        rect.area();
    }
}
