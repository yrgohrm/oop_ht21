public class Scope {
    public static void main(String[] args) {
        int myVar = 12;

        System.out.println(myVar);
        
        if (myVar < 100) {
            int myOtherVar = 99;
            System.out.println(myVar);
            System.out.println(myOtherVar);
        }
    }
}
