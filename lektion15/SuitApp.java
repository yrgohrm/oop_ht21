public class SuitApp {
    public static void main(String[] args) {
        Suit s1 = Suit.HEARTS;
        Suit s2 = Suit.DIAMONDS;

        if (s1.equals(s2)) {
            System.out.println("haha");
        }

        switch (s1) {
            case HEARTS:
                System.out.println("hehehe");
                break;
            case DIAMONDS:
                System.out.println("hehehe!!!");
                break;
            default:
                System.out.println("default");
        }

        for (Suit s : Suit.values()) {
            System.out.println(s);
            System.out.println(s.ordinal());
        }
    }
}
