public class StringEx {
    public static void main(String[] args) {
        String text = "Hejsan hoppsan!";

        System.out.println(text.replace("a", "?"));

        text = "         hej alla glada     ";
        text = text.trim();
        System.out.println(text);


        String str = "";
        for (int i = 0; i < 1000; ++i) {
            str += i + "\n";
        }
        System.out.println(str);
    }
}
