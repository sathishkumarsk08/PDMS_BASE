package com.msp.Audit;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditRequestDto {
    /** The event id. */
    @NotNull
    private String eventId;

    /** The event name. */
    @NotNull
    private String eventName;

    /** The event type. */
    @NotNull
    private String eventType;

    /** The action time stamp. */
    @NotNull
    private String actionTimeStamp;

    /** The host name. */
    @NotNull
    private String hostName;

    /** The host ip. */
    @NotNull
    private String hostIp;

    /** The application id. */
    @NotNull
    private String applicationId;

    /** The application name. */
    @NotNull
    private String applicationName;

    /** The session user id. */
    @NotNull
    private String sessionUserId;

    /** The session user name. */
    @NotNull
    private String sessionUserName;

    /** The id. */
    @NotNull
    private String id;

    /** The id type. */
    @NotNull
    private String idType;

    /** The created by. */
    @NotNull
    private String createdBy;

    /** The module name. */
    private String moduleName;

    /** The module id. */
    private String moduleId;

    /** The description. */
    private String description;



}
