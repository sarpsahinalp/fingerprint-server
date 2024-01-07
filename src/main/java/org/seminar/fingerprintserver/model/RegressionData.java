package org.seminar.fingerprintserver.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "regressionData")
@AllArgsConstructor
@NoArgsConstructor
public class RegressionData {

    @Id
    private ObjectId id;

    private Float precision;

    private Float recall;

    private Float f1Score;

    private Float accuracy;

}
