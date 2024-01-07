package org.seminar.fingerprintserver.service;

import org.bson.types.ObjectId;
import org.seminar.fingerprintserver.model.RegressionData;
import org.seminar.fingerprintserver.repository.RegressionDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegressionDataService {

    private final RegressionDataRepository regressionDataRepository;

    @Autowired
    public RegressionDataService(RegressionDataRepository regressionDataRepository) {
        this.regressionDataRepository = regressionDataRepository;
    }

    public List<RegressionData> getAllRegressionData() {
        return regressionDataRepository.findAll();
    }

    public RegressionData saveRegressionData(RegressionData regressionData) {
        return regressionDataRepository.save(regressionData);
    }

    public RegressionData updateRegressionData(ObjectId id, RegressionData regressionData) {
        RegressionData regressionDataToUpdate = regressionDataRepository.findById(id).orElseThrow(() -> new RuntimeException("RegressionData not found with id: " + id));
        regressionDataToUpdate.setAccuracy(regressionData.getAccuracy());
        regressionDataToUpdate.setRecall(regressionData.getRecall());
        regressionDataToUpdate.setPrecision(regressionData.getPrecision());
        regressionDataToUpdate.setF1Score(regressionData.getF1Score());
        return regressionDataRepository.save(regressionDataToUpdate);
    }

    public RegressionData getRegressionDataById(ObjectId id) {
        return regressionDataRepository.findById(id).orElseThrow(() -> new RuntimeException("RegressionData not found with id: " + id));
    }
}
