package org.seminar.fingerprintserver.controller;

import org.seminar.fingerprintserver.model.BotData;
import org.seminar.fingerprintserver.service.BotDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bot-data")
@CrossOrigin(origins = "https://sarpsahinalp.github.io")
public class BotDataController {

    private final BotDataService botDataService;

    @Autowired
    public BotDataController(BotDataService botDataService) {
        this.botDataService = botDataService;
    }

    @GetMapping()
    public List<BotData> getAllBotData() {
        return botDataService.getAllBotData();
    }

    @PostMapping()
    public ResponseEntity<BotData> createBotData(@RequestBody BotData botData) {
        BotData createdBotData = botDataService.saveBotData(botData);
        return ResponseEntity.ok(createdBotData);
    }
}
