package engine;

import java.util.Set;

public class Word {
    public static Set<String> stopWords;
    private String rawText;

    public Word(String rawText) {
        this.rawText = rawText;
    }

    public static Word createWord (String rawText){
        return new Word(rawText);
    }

    public boolean isKeyword() {
        return false;
    }
    public String getPrefix() {
        return null;
    }
    public String getSuffix() {
        return null;
    }

    public String getText() {
        return null;
    }

    public static boolean loadStopWords(String fileName) {
        return true;
    }

    public boolean equals(Object o) {
        return true;
    }

    public String toString() {
        return null;
    }
}
