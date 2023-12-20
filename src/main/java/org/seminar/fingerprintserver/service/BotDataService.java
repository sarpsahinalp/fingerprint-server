package org.seminar.fingerprintserver.service;

import org.bson.types.ObjectId;
import org.seminar.fingerprintserver.model.BotData;
import org.seminar.fingerprintserver.repository.BotDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BotDataService {

    private final BotDataRepository botDataRepository;

    @Autowired
    public BotDataService(BotDataRepository botDataRepository) {
        this.botDataRepository = botDataRepository;
    }

    public List<BotData> getAllBotData() {
        return botDataRepository.findAll();
    }

    public BotData saveBotData(BotData botData) {
        return botDataRepository.save(botData);
    }
}
