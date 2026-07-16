package Ai_research_engine.Ranking_model.Services;

import Ai_research_engine.Ranking_model.ClassesForObj.DTO.RankingRequest;
import Ai_research_engine.Ranking_model.ClassesForObj.QuerryToFind;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URL;

@Service
public class SendingService {

    String send(RankingRequest r){
//        URL baseurl=;

        RestTemplate restTemplate=new RestTemplate();
        QuerryToFind q=restTemplate.postForObject("http://localhost:8080/summary",r, QuerryToFind.class);
        try{
        return q.getQuery();}
        catch (NullPointerException n){
            System.out.println(n.getStackTrace());
        }
        return "Didn't got the summary";
    }

}
