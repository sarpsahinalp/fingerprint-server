package org.seminar.fingerprintserver.repository;

import org.bson.types.ObjectId;
import org.seminar.fingerprintserver.model.RegressionData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegressionDataRepository extends MongoRepository<RegressionData, ObjectId> {
}
