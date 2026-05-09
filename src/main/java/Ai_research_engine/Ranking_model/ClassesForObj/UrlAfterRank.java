package Ai_research_engine.Ranking_model.ClassesForObj;

public class UrlAfterRank {
    String link;
    String title;
    String snippet;
    int position;
    double score;

    public UrlAfterRank(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }



    public UrlAfterRank(int position) {
        this.position = position;
    }

    public UrlAfterRank() {
    }

    public UrlAfterRank(String link, String title, String snippet, int position) {
        this.link = link;
        this.title = title;
        this.snippet = snippet;
        this.position = position;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
