package se.yrgo.swefinder.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {

    }

    private static boolean isInSwedish(Path filename) throws IOException {

        try (BufferedReader reader = Files.newBufferedReader(filename)) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (lineContainsSwedishLetters(line) || 
                    lineContainsSwedishWords(line)) {
                    return true;
                }
            }
        } 

        return false;
    }

    private static boolean lineContainsSwedishWords(String line) {
        String[] words = line.split("\\W+");
        for (String word : words) {
            if (SwedishWords.isSwedishWord(word)) {
                return true;
            }
        }
        return false;
    }

    private static boolean lineContainsSwedishLetters(String line) {
        for (int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);
            if ("åäöÅÄÖ".indexOf(ch) != -1) {
                return true;
            }
        }
        return false;
    }
}