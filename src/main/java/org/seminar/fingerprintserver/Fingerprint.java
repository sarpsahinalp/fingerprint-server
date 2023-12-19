package org.seminar.fingerprintserver;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "fingerprints")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fingerprint {

    @Id
    private ObjectId id;

    private List<String> fonts;

    private List<String> plugins;

    private Boolean cookiesEnabled;

    private String platform;

    private String userAgent;

    private String continent;

    private Integer screenResolution;

    private String bot;

}
