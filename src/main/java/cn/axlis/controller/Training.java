package cn.axlis.controller;

import cn.axlis.entity.HealthData;
import cn.axlis.entity.TrainingNote;
import cn.axlis.model.AddTrainingNoteReq;
import cn.axlis.model.CollectHealthDataReq;
import cn.axlis.store.HealthDataStore;
import cn.axlis.store.TrainingNoteStore;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@AllArgsConstructor
public class Training {
    private final HealthDataStore healthDataStore;

    private final TrainingNoteStore trainingNoteStore;

    @PostMapping("/health-data/{type}")
    public void collectHealthData(@PathVariable String type, @RequestBody CollectHealthDataReq req) {
        var entity = new HealthData();

        entity.setType(type);
        entity.setAmount(req.getAmount());
        entity.setUnit(req.getUnit());
        entity.setCollectTime(req.getCollectTime());

        healthDataStore.insert(entity);
    }

    @PostMapping("/training-record/note")
    public void addTrainingNoteRecord(@RequestBody AddTrainingNoteReq req) {
        var entity = new TrainingNote();

        entity.setSport(req.getSport());
        entity.setGroupCount(req.getGroupCount());
        entity.setUnit(req.getUnit());
        entity.setAmount(req.getAmount());
        entity.setComment(req.getComment());

        trainingNoteStore.insert(entity);
    }
}
