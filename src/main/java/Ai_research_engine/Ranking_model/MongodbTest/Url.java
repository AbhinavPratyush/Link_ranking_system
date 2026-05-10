package Ai_research_engine.Ranking_model.MongodbTest;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Url")
public class Url {
String url;
String snippet;
String title;

    public Url() {
    }

    public Url(String url, String snippet, String title) {
        this.url = url;
        this.snippet = snippet;
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
