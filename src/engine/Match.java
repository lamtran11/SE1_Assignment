package engine;

public class Match {
    private Word w;
    public Match (Doc d,Word w, int freq, int firstIndex) {

    }

    public int getFreq() {
        return 1;
    }
    public int getFirstIndex() {
        return 1;
    }
    public Word getWord() {
        return w;
    }
    public int compareTo(Match o) {
        return 1;
    }
}
