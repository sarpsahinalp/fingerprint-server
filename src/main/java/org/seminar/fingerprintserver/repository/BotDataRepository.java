package org.seminar.fingerprintserver.repository;

import org.bson.types.ObjectId;
import org.seminar.fingerprintserver.model.BotData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotDataRepository extends MongoRepository<BotData, ObjectId> {
}
