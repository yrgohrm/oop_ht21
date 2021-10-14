public class OvningTre {
    public static String robber(String text) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); ++i) {
            char c = text.charAt(i);
            if (isConsonant(c)) {
                builder.append(c).append('o').append(c);
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }

    public static String allLang(String text) {
        StringBuilder builder = new StringBuilder();

        boolean isNewWord = true;
        for (int i = 0; i < text.length(); ++i) {
            char c = text.charAt(i);
            if (isConsonant(c) && isNewWord) {
                builder.append(c).append("all");
                isNewWord = false;
            } else {
                if (c == ' ') {
                    isNewWord = true;
                }
                builder.append(c);
            }
        }
        return builder.toString();
    }

    public static boolean isConsonant(char c) {
        int res = "aouåeiyäöAOUÅIEYÄÖ".indexOf(c);
        return res == -1 && Character.isAlphabetic(c);
    }

    public static void main(String[] args) {
        String text = "Hej allihopa, allt bra?";
        System.out.println(robber(text));
        System.out.println(allLang(text));
    }
}
