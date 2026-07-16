package Ai_research_engine.Ranking_model.ClassesForObj;

import java.util.List;

public class UrlsRecieved {
    List<UrlToRank> ServerResponse;


    public UrlsRecieved() {
    }

    public UrlsRecieved(List<UrlToRank> serverResponse) {
        ServerResponse = serverResponse;
    }

    public List<UrlToRank> getServerResponse() {
        return ServerResponse;
    }

    public void setServerResponse(List<UrlToRank> serverResponse) {
        ServerResponse = serverResponse;
    }
}
