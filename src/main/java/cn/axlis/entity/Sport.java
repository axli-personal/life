package cn.axlis.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Sport {
    @Id
    private String id;

    private String Name;

    private String DefaultUnit;
}
