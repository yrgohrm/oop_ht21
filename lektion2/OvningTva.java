public class OvningTva {
    public static void main(String[] args) {
        float radius = 1e20f;
        
        // code goes here, use StrictMath.PI
        float diameter = 2 * radius;
        float circumference = (float)(StrictMath.PI * diameter);
        float area = (float)(StrictMath.PI * radius * radius);

        System.out.printf("Omkretsen på cirkeln är %.2f.\n", circumference);
        System.out.printf("Arean på cirkeln är %.2f.\n", area);
    }
}