package Ai_research_engine.Ranking_model.MongodbTest;

import Ai_research_engine.Ranking_model.ClassesForObj.DTO.RankingRequest;
import Ai_research_engine.Ranking_model.ClassesForObj.QuerryToFind;
import Ai_research_engine.Ranking_model.ClassesForObj.UrlsRecieved;
import Ai_research_engine.Ranking_model.Services.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    RankingService rankingService;

    //test
    @Autowired
    DbCallingService dbCallingService;
    //test

    @PostMapping("/test")
    public String gotToRank(UrlsRecieved urlsRecieved, QuerryToFind querry){

        //test
        RankingRequest rankingRequest=dbCallingService.dbCall(querry.getQuery());
        //test


        String out=rankingService.rankBy(urlsRecieved, querry.getQuery());

        return "Sucess";
    }

}
