package org.seminar.fingerprintserver.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "botData")
@AllArgsConstructor
@NoArgsConstructor
public class BotData {

    @Id
    private ObjectId id;

    private Boolean bot;

    private Boolean android;

    private String appVersion;

    private String browserEngineKind;

    private String browserKind;

    private List<String> distinctiveProps;

    private List<String> documentElementKeys;

    private Boolean documentFocus;

    private Long evalLength;

    private String functionBind;

    private List<List<String>> languages;

    private Boolean mimeTypesConsistent;

    private Boolean notificationPermissions;

    private Boolean pluginsArray;

    private Long pluginsLength;

    private Long productSub;

    private Long process;

    private Long rtt;

    private String userAgent;

    private Boolean webDriver;

    private String webGlVendor;

    private String webGlRenderer;

    private String windowExternal;

    // inner - outer - height - width
    private Long innerHeight;

    private Long innerWidth;

    private Long outerHeight;

    private Long outerWidth;

}
