package cn.axlis.controller;

import cn.axlis.entity.*;
import cn.axlis.model.AddTrainingNoteReq;
import cn.axlis.model.AddTrainingPlanReq;
import cn.axlis.model.CollectHealthDataReq;
import cn.axlis.model.ListSportsReq;
import cn.axlis.store.HealthDataStore;
import cn.axlis.store.SportStore;
import cn.axlis.store.TrainingNoteStore;
import cn.axlis.store.TrainingPlanStore;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
public class Training {
    private final HealthDataStore healthDataStore;

    private final SportStore sportStore;

    private final TrainingNoteStore trainingNoteStore;

    private final TrainingPlanStore trainingPlanStore;

    @PostMapping("/health-data/{type}")
    public void collectHealthData(@PathVariable String type, @RequestBody CollectHealthDataReq req) {
        var entity = new HealthData();

        entity.setType(type);
        entity.setAmount(req.getAmount());
        entity.setUnit(req.getUnit());
        entity.setCollectTime(req.getCollectTime());

        healthDataStore.insert(entity);
    }

    @PostMapping("/sport/list")
    public List<Sport> listSports(@RequestBody ListSportsReq req) {
        return sportStore.findAll();
    }

    @PostMapping("/training/note")
    public void addTrainingNote(@RequestBody AddTrainingNoteReq req) {
        var entity = new TrainingNote();

        entity.setSport(req.getSport());
        entity.setGroupCount(req.getGroupCount());
        entity.setUnit(req.getUnit());
        entity.setAmount(req.getAmount());
        entity.setComment(req.getComment());

        trainingNoteStore.insert(entity);
    }

    @PostMapping("/training/note/list")
    public List<TrainingNote> listTrainingNotes() {
        return trainingNoteStore.findAll();
    }

    @PostMapping("/training/plan")
    public void addTrainingPlan(@RequestBody AddTrainingPlanReq req) {
        var entity = new TrainingPlan();

        List<TrainingItem> trainingItems = new ArrayList<>();

        for (var item : req.getPlan()) {
            var trainingItem = new TrainingItem();

            trainingItem.setAmount(item.getAmount());
            trainingItem.setUnit(item.getUnit());
            trainingItem.setSport(item.getSport());
            trainingItem.setGroupCount(item.getGroupCount());
            trainingItem.setStatus("TODO");

            trainingItems.add(trainingItem);
        }

        entity.setPlan(trainingItems);

        trainingPlanStore.insert(entity);
    }
}
