package cn.axlis.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class HealthData {
    @Id
    private String id;

    private String type;

    private Double amount;

    private String unit;

    private LocalDateTime collectTime;
}
