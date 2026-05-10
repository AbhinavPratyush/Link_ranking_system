package Ai_research_engine.Ranking_model.MongodbTest;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Querry")
public class Querryfromdb {


    String querry;
    List<String> urlAssociated;

    public List<String> getUrlAssociated() {
        return urlAssociated;
    }

    public void setUrlAssociated(List<String> urlAssociated) {
        this.urlAssociated = urlAssociated;
    }

    public String getQuerry() {
        return querry;
    }

    public void setQuerry(String querry) {
        this.querry = querry;
    }

}
