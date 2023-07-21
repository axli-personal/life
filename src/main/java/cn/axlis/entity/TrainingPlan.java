package cn.axlis.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class TrainingPlan {
    @Id
    private String id;

    private List<TrainingItem> plan;
}
