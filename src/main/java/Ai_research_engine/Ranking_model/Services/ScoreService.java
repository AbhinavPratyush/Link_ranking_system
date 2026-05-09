package Ai_research_engine.Ranking_model.Services;

import Ai_research_engine.Ranking_model.ClassesForObj.UrlToRank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {

    @Autowired
    CleanTxt cleanTxt;

    public double scoreIt(String t, String s ,String q){

        String[] title=cleanTxt.clean(t);
        String[] snippet= cleanTxt.clean(s);
        String[]  qry= cleanTxt.clean(q);
        double tit=compScore(title,qry);
        double sni=compScore(snippet,qry);
        double tw=(double)1/title.length;
        double sw=(double)1/snippet.length;
        double score= tit*tw+sw*sni;
        return score;
    }

    public double compScore(String[] a, String[] q){

        int c=0;
        for(String i:q){
            for(String j:a){
                if(i.contains(j) || j.contains(i)){
                    c++;
                }
            }
        }

        return (double) c /q.length;
    }

}
