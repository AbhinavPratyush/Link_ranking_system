package Ai_research_engine.Ranking_model.ClassesForObj;

public class UrlToRank {
    String link;
    String title;
    String snippet;

    public UrlToRank() {
    }

    public UrlToRank(String link, String title, String snippet) {
        this.link = link;
        this.title = title;
        this.snippet = snippet;
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
}
