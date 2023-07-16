package cn.axlis.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CollectHealthDataReq {
    private String type;
    private double amount;
    private String unit;
    private LocalDateTime collectTime;
}
