public class BadApp1 {
    public static void main(String[] args) {
        byte a = 4;
        byte b = 50;
        byte c = 6;

        byte res = (byte) (a*b*c);
        int res2 = a * b *c;

        System.out.println(res);
        System.out.println(res2);
    }
}
