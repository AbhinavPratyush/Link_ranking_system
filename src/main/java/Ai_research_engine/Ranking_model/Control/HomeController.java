package Ai_research_engine.Ranking_model.Control;

import Ai_research_engine.Ranking_model.ClassesForObj.DTO.RankingRequest;
import Ai_research_engine.Ranking_model.ClassesForObj.UrlsRecieved;
import Ai_research_engine.Ranking_model.Services.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    RankingService rankingService;

    @PostMapping("/someUrl")
    public String gg(@RequestBody RankingRequest rankingRequest){
if(rankingRequest==null){
    //we will make a db call
}
// in this case i am obliged to make a db call because i cant spend credit points on intial coding
// so we will have to use mongo services , and we will use url specified, containers from the previous project
// i will not write explicitly a docker compose file , just use my docker desktop to run the code

        String x= rankingService.rankBy(rankingRequest.getUrlsRecieved(),rankingRequest.getQ());

        return x;
    }


}
