package cn.axlis.store;

import cn.axlis.entity.TrainingPlan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingPlanStore extends MongoRepository<TrainingPlan, String> {
}
