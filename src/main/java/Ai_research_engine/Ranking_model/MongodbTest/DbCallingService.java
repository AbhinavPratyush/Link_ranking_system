package Ai_research_engine.Ranking_model.MongodbTest;

import Ai_research_engine.Ranking_model.ClassesForObj.DTO.RankingRequest;
import Ai_research_engine.Ranking_model.ClassesForObj.UrlAfterRank;
import Ai_research_engine.Ranking_model.ClassesForObj.UrlToRank;
import Ai_research_engine.Ranking_model.ClassesForObj.UrlsRecieved;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DbCallingService
{

    @Autowired
    QuerryImpl querryImp;

    @Autowired
    UrlImpl urlImp;


    public RankingRequest dbCall(String q){

        List<String> urls=querryImp.findByQuerry(q).getUrlAssociated();
        List<UrlToRank> vc=new ArrayList<>();
        for(String i:urls){
            Url url=urlImp.findByLink(i);
            UrlToRank urlToRank=new UrlToRank(url.getUrl(), url.getTitle(), url.getSnippet());
            vc.add(urlToRank);
        }

        UrlsRecieved u=new UrlsRecieved();
        u.setServerResponse(vc);
        RankingRequest r=new RankingRequest();
        r.setQ(q);
        r.setUrlsRecieved(u);

        return r;
    }
}
