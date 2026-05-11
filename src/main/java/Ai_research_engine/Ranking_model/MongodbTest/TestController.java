package Ai_research_engine.Ranking_model.MongodbTest;

import Ai_research_engine.Ranking_model.ClassesForObj.DTO.RankingRequest;
import Ai_research_engine.Ranking_model.ClassesForObj.QuerryToFind;
import Ai_research_engine.Ranking_model.ClassesForObj.UrlsRecieved;
import Ai_research_engine.Ranking_model.Services.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public String gotToRank(@RequestBody QuerryToFind query){

        //test
        RankingRequest rankingRequest=dbCallingService.dbCall(query.getQuery());
        //test


        String out=rankingService.rankBy(rankingRequest.getUrlsRecieved(),query.getQuery());

        return "Sucess";
    }

}
