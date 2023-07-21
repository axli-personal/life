package cn.axlis.model;

import lombok.Data;

import java.util.List;

@Data
public class AddTrainingPlanReq {
    List<TrainingItem> plan;
}
