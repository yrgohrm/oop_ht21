package se.yrgo.swefinder.app;

public class SwedishWords {
    public static final String[] WORDS = {
        "i",
        "och",
        "det",
        "som",
        "en"
    };

    public static boolean isSwedishWord(String word) {
        if (word == null) {
            return false;
        }

        word = word.trim().toLowerCase();

        for (String swedWord : WORDS) {
            if (word.equals(swedWord)) {
                return true;
            }
        }

        return false;
    }
}
