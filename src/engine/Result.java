package engine;

import java.util.List;

public class Result {

    private Doc doc;
    private List<Match> matches;

    public Result (Doc d, List<Match> matches) {
        return ;
    }
    public List<Match> getMatches() {
        return null;
    }
    public Doc getDoc() {
        return doc;
    }
    public int getTotalFrequency() {
        return 1;
    }
    public double getAverageFirstIndex() {
        return 1;
    }

    public String htmlHighlight() {
        return "";
    }

    public int compareTo(Result o) {
        return 1;
    }
}
