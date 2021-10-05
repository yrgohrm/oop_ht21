public class App {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setWidth(100);
        System.out.println(rect);
        
        rect.setWidth("300");
        System.out.println(rect);
    }
}