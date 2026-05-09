package Ai_research_engine.Ranking_model.Controller;


import Ai_research_engine.Ranking_model.ClassesForObj.QuerryToFind;
import Ai_research_engine.Ranking_model.ClassesForObj.UrlsRecieved;
import Ai_research_engine.Ranking_model.Services.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHome {

    @Autowired
    RankingService rankingService;

    @PostMapping("/ranking")
    public String gotToRank(UrlsRecieved urlsRecieved, QuerryToFind querry){

        String out=rankingService.rankBy(urlsRecieved, querry);

        return " ";
    }


}
