package org.seminar.fingerprintserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/fingerprints")
@CrossOrigin(origins = "https://sarpsahinalp.github.io")
public class FingerprintController {

    private final FingerprintService fingerprintService;

    @Autowired
    public FingerprintController(FingerprintService fingerprintService) {
        this.fingerprintService = fingerprintService;
    }

    @GetMapping
    public List<Fingerprint> getAllFingerprints() {
        return fingerprintService.getAllFingerprints();
    }

    @PostMapping
    public ResponseEntity<Fingerprint> createFingerprint(@RequestBody Fingerprint fingerprint) {
        Fingerprint createdFingerprint = fingerprintService.saveFingerprint(fingerprint);
        return ResponseEntity.ok(createdFingerprint);
    }
}