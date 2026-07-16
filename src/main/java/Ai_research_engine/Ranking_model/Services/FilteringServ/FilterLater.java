package Ai_research_engine.Ranking_model.Services.FilteringServ;

import Ai_research_engine.Ranking_model.ClassesForObj.DTO.RankingRequest;
import Ai_research_engine.Ranking_model.ClassesForObj.UrlToRank;
import Ai_research_engine.Ranking_model.ClassesForObj.UrlsRecieved;
import Ai_research_engine.Ranking_model.Services.SendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;




@Service
public class FilterLater {

    @Autowired
    FilteringService filteringService;

    @Autowired
    SendingService sendingService;

    public String filterAndSend(List<UrlToRank> rankedUrls , String q){

        //we will call the filtering service

        UrlsRecieved filteredUrl =filteringService.filter(rankedUrls);
        //->>>>>filter has not been commpleted


        /*

        we will call the sending service
        we will use RankingRequest to send the data.
        since i am not using spring security , there is no need to  attach authentication header to the json file
        i will use resttemplate object to attach
            url="localhost//wherepythonruns"
            the data I am sending , obj of rankingRequest
            and will accept I will make a new dto to send and recieve string querry

         */
        String response=sendingService.send(new RankingRequest(q,filteredUrl));

        return "response From rag module";
    }
}
