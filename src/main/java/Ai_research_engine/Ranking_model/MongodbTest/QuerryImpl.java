package Ai_research_engine.Ranking_model.MongodbTest;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuerryImpl extends MongoRepository<Querryfromdb,String> {
    Querryfromdb findByQuerry(String querry);

}
