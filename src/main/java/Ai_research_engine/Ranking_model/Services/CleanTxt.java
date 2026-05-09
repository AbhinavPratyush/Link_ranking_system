package Ai_research_engine.Ranking_model.Services;

import org.springframework.stereotype.Service;

@Service
public class CleanTxt {

    public String[] clean(String t){

        t=t.toLowerCase();
        t=t.replaceAll("\\p{Punct}","");
        String[] stopping_word={"the","is","of","in"};
        String regx=String.join("|",stopping_word);
        t=t.replaceAll("\\b("+regx+")\\b","");
        String[] title=t.split(" ");
        return title;

    }
}
