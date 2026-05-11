package Ai_research_engine.Ranking_model.Services;

import Ai_research_engine.Ranking_model.ClassesForObj.QuerryToFind;
import Ai_research_engine.Ranking_model.ClassesForObj.UrlAfterRank;
import Ai_research_engine.Ranking_model.ClassesForObj.UrlToRank;
import Ai_research_engine.Ranking_model.ClassesForObj.UrlsRecieved;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.Query;
import java.util.List;

@Service
public class RankingService {

    @Autowired
    RankFirst rankFirst;

//    @Autowired
//    FilterLater filterLater;

    public String rankBy(UrlsRecieved urlsRecieved, String querry){



    for(UrlToRank u: urlsRecieved.getServerResponse())
        System.out.println(u.toString());



        List<UrlToRank> rankedUrl=rankFirst.ranking(urlsRecieved, querry);


        System.out.println(urlsRecieved.getServerResponse().size()+"---------"+ rankedUrl.size());
        for(UrlToRank u:rankedUrl){
            System.out.println(u.toString());
        }

        String response="filterLater.filterAndsend(rankedUrl,querry)";


        return response;

    }

}
