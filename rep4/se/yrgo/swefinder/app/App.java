package se.yrgo.swefinder.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// since we include åäö as a string below we need to specify
// encoding when compiling
//
// javac '-encoding' 'utf-8' .\se\yrgo\swefinder\app\App.java

public class App {
    public static void main(String[] args) throws IOException {
        for (String filename : args) {
            if (isInSwedish(Path.of(filename))) {
                System.out.println(filename);
            }
        }
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
        int count = 0;
        for (String word : words) {
            if (SwedishWords.isSwedishWord(word)) {
                count++;
            }
        }

        return count > 2;
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