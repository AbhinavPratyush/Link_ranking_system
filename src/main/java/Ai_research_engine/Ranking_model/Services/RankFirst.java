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


    public List<UrlToRank> ranking(UrlsRecieved urlsRecieved, String querry){
        ArrayList<UrlToRank> rankedUrl=new ArrayList<>();
        ArrayList<Double> scoreList=new ArrayList<>();
        ArrayList<Integer> highScorer=new ArrayList<>();
        for(UrlToRank u:urlsRecieved.getServerResponse()){

            double score=scoreServc.scoreIt(u.getTitle(),u.getSnippet(),querry);
//            int ind=urlsRecieved.getServerResponse().indexOf(u);
            scoreList.add(score);
        }
        highScorer=fitIn(scoreList,10);
        for(int i: highScorer){
            rankedUrl.add(urlsRecieved.getServerResponse().get(i));
        }

        return rankedUrl;
    }





    private ArrayList<Integer> fitIn(ArrayList<Double> sl,int k){

//return a list of index of hisgh scorers

        ArrayList<Integer> r=new ArrayList<>();

        for(int i=0;i< sl.size();i++){
            if(r.size()<k){
                r.add(i);
                continue;
            }
            for(int j:r){
                if(sl.get(j)< sl.get(i)){
                    j=i;
                    break;
                }
            }

        }

        return r;
    }

}
