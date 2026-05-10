package Ai_research_engine.Ranking_model.MongodbTest;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Url")
public class Url {
String link;
String snippet;
String title;

    public Url() {
    }

    public Url(String link, String snippet, String title) {
        this.link = link;
        this.snippet = snippet;
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
