package Ai_research_engine.Ranking_model.Services;

import Ai_research_engine.Ranking_model.ClassesForObj.QuerryToFind;
import Ai_research_engine.Ranking_model.ClassesForObj.UrlAfterRank;
import Ai_research_engine.Ranking_model.ClassesForObj.UrlToRank;
import Ai_research_engine.Ranking_model.ClassesForObj.UrlsRecieved;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RankFirst {


    @Autowired
    ScoreService scoreServc;


    public List<UrlAfterRank> ranking(UrlsRecieved urlsRecieved, QuerryToFind querry){
        ArrayList<UrlAfterRank> rankedUrl=new ArrayList<>();
        ArrayList<Double> scoreList=new ArrayList<>();
        ArrayList<Integer> highScorer=new ArrayList<>();
        for(UrlToRank u:urlsRecieved.getServerResponse()){

            double score=scoreServc.scoreIt(u.getTitle(),u.getSnippet(),querry.getQuery());
//            int ind=urlsRecieved.getServerResponse().indexOf(u);
            scoreList.add(score);
        }
        highScorer=fitIn(scoreList,10);

        return rankedUrl;
    }

    ArrayList<Integer> fitIn(ArrayList<Double> sl,int k){

//return a list of index of hisgh scorers

        ArrayList<Integer> r=new ArrayList<>();



        return r;
    }

}
