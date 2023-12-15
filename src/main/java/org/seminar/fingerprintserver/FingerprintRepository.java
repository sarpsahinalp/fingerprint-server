package org.seminar.fingerprintserver;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FingerprintRepository extends MongoRepository<Fingerprint, ObjectId> {
}
