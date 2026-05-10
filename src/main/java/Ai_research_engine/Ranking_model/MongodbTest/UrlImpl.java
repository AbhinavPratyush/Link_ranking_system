package Ai_research_engine.Ranking_model.MongodbTest;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlImpl extends MongoRepository<Url,String> {
    Url findByLink(String link);
}
