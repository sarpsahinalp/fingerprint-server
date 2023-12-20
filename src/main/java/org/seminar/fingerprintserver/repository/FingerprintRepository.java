package org.seminar.fingerprintserver.repository;

import org.bson.types.ObjectId;
import org.seminar.fingerprintserver.model.Fingerprint;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FingerprintRepository extends MongoRepository<Fingerprint, ObjectId> {
}
