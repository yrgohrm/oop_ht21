public class App {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setWidth(10.2);
        rect.setHeight(0.34);
        rect.setColor("blue");
        rect.print();

        rect.setColor("black");
        rect.print();

        rect.doubleSize();
        rect.print();

        double a = rect.area();
        System.out.println(a);
    }
}
