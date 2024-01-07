package org.seminar.fingerprintserver.controller;

import org.bson.types.ObjectId;
import org.seminar.fingerprintserver.model.RegressionData;
import org.seminar.fingerprintserver.service.RegressionDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/regression-data")
@CrossOrigin(origins = "https://sarpsahinalp.github.io")
public class RegressionDataController {

    private final RegressionDataService regressionDataService;

    @Autowired
    public RegressionDataController(RegressionDataService regressionDataService) {
        this.regressionDataService = regressionDataService;
    }

    @GetMapping()
    public List<RegressionData> getAllRegressionData() {
        return regressionDataService.getAllRegressionData();
    }

    @PostMapping()
    public ResponseEntity<RegressionData> createBotData(@RequestBody RegressionData regressionData) {
        RegressionData createdRegressionData = regressionDataService.saveRegressionData(regressionData);
        return ResponseEntity.ok(createdRegressionData);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegressionData> getRegressionDataById(@PathVariable ObjectId id) {
        RegressionData regressionData = regressionDataService.getRegressionDataById(id);
        return ResponseEntity.ok(regressionData);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RegressionData> updateRegressionData(@PathVariable ObjectId id, @RequestBody RegressionData regressionData) {
        RegressionData updatedRegressionData = regressionDataService.updateRegressionData(id, regressionData);
        return ResponseEntity.ok(updatedRegressionData);
    }
}
