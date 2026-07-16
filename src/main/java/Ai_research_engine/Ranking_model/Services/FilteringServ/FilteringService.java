package Ai_research_engine.Ranking_model.Services.FilteringServ;

import Ai_research_engine.Ranking_model.ClassesForObj.UrlToRank;
import Ai_research_engine.Ranking_model.ClassesForObj.UrlsRecieved;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilteringService {
    UrlsRecieved filter(List<UrlToRank> unfilteredUrls){

        List<UrlToRank> afterFilter=new ArrayList<>();
        for(UrlToRank u:unfilteredUrls){
            if(check(u.getLink())){
                afterFilter.add(u);
            }
        }

        return new UrlsRecieved(afterFilter);
    }
    boolean check(String url){
        //i will add logic on which the url has to be filtered

        return true;
    }
}
