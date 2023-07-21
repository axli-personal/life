package cn.axlis.store;

import cn.axlis.entity.Sport;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportStore extends MongoRepository<Sport, String> {

}
