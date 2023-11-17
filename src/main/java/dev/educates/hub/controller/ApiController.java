package dev.educates.hub.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import dev.educates.hub.model.hub.TrainingPortal;
import dev.educates.hub.model.hub.WorkshopDefinition;
import dev.educates.hub.model.hub.WorkshopLocation;
import dev.educates.hub.service.WorkshopService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private WorkshopService service;

    @RequestMapping("/ids")
    public ResponseEntity<Map<String, List<WorkshopLocation>>> getWorkshopIDs() {
        Map<String, List<WorkshopLocation>> workshops = service.getWorkshopsIDs();
        return new ResponseEntity<Map<String, List<WorkshopLocation>>>(workshops, HttpStatus.OK);
    }

    @RequestMapping("/workshops")
    public ResponseEntity<Set<WorkshopDefinition>> getWorkshops() {
        Set<WorkshopDefinition> workshops = service.getWorkshops();
        return new ResponseEntity<Set<WorkshopDefinition>>(workshops, HttpStatus.OK);
    }

    @RequestMapping("/workshop/{name}")
    public ResponseEntity<WorkshopDefinition> getWorkshop(@PathVariable String name) {
        WorkshopDefinition workshop = service.getWorkshop(name);
        return new ResponseEntity<WorkshopDefinition>(workshop, HttpStatus.OK);
    }

    @RequestMapping("/trainingportals")
    public ResponseEntity<List<TrainingPortal>> getTrainingPortals() {
        List<TrainingPortal> portals = service.getTrainingPortals();
        return new ResponseEntity<List<TrainingPortal>>(portals, HttpStatus.OK);
    }

    @RequestMapping("/trainingportal/{name}")
    public ResponseEntity<TrainingPortal> getTrainingPortal(@PathVariable String name) {
        TrainingPortal portal = service.getTrainingPortal(name);
        return new ResponseEntity<TrainingPortal>(portal, HttpStatus.OK);
    }

}