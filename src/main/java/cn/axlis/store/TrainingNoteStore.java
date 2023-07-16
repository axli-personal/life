package cn.axlis.store;

import cn.axlis.entity.TrainingNote;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingNoteStore extends MongoRepository<TrainingNote, String> {
}
