package cn.axlis.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class TrainingNote {
    @Id
    private String id;

    private String sport;

    private int groupCount;

    private String unit;

    private int amount;

    private String comment;
}
