package Ai_research_engine.Ranking_model.ClassesForObj.DTO;

import Ai_research_engine.Ranking_model.ClassesForObj.UrlsRecieved;

public class RankingRequest {
    String Q;
    UrlsRecieved urlsRecieved;

    public RankingRequest() {
    }

    public RankingRequest(String q, UrlsRecieved urlsRecieved) {
        Q = q;
        this.urlsRecieved = urlsRecieved;
    }

    public String getQ() {
        return Q;
    }

    public void setQ(String q) {
        Q = q;
    }

    public UrlsRecieved getUrlsRecieved() {
        return urlsRecieved;
    }

    public void setUrlsRecieved(UrlsRecieved urlsRecieved) {
        this.urlsRecieved = urlsRecieved;
    }
}
