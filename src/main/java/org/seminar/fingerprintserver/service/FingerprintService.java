package org.seminar.fingerprintserver.service;

import org.seminar.fingerprintserver.model.Fingerprint;
import org.seminar.fingerprintserver.repository.FingerprintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FingerprintService {

    private final FingerprintRepository fingerprintRepository;

    @Autowired
    public FingerprintService(FingerprintRepository fingerPrintRepository) {
        this.fingerprintRepository = fingerPrintRepository;
    }

    public List<Fingerprint> getAllFingerprints() {
        return fingerprintRepository.findAll();
    }

    public Fingerprint saveFingerprint(Fingerprint fingerprintEntity) {
        return fingerprintRepository.save(fingerprintEntity);
    }
}
