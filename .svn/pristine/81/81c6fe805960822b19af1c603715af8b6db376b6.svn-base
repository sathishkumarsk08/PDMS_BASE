package com.msp.Audit;

public enum AuditEvents {
    USER_LOGIN("PDMS-USR-001","USER", "Login Request"),
    UPDATE_USER_PWD("PDMS-USR-002","USER", "Password change Request"),
    USER_LOGOUT("PDMS-USR-003","USER", "Logout Request"),
    USER_EVENT("PDMS-USR-004","USER", "User Request"),
    POLICY_EVENT("PDMS-PLC-101","SYSTEM", "Policy Request"),
    POLICY_GRP_EVENT("PDMS-PLCG-102","SYSTEM", "Policy Group Request"),
    PARTNER_REPORT("PDMS-PRT-103","SYSTEM", "Report Request"),
    PARTNER_EVENT("PDMS-PRT-104","SYSTEM", "Partner Request"),
    DEVICE_EVENT("PDMS-DVC-105","SYSTEM", "Device Request"),
    PDMS_REPORT("PDMS-DVC-106","SYSTEM", "Report Request"),
    PDMS_ADMIN_EVENT("PDMS-DVC-107","SYSTEM", "Admin Request"),


    ;

    /** The event id. */
    private final String eventId;

    /** The event type. */
    private final String eventType;

    /** The event name. */
    private final String eventName;

    /**
     * Instantiates a new audit events.
     *
     * @param eventId the event id
     * @param eventType the event type
     * @param eventName the event name
     */
    private AuditEvents(String eventId, String eventType, String eventName) {
        this.eventId = eventId;
        this.eventType = eventType;
        this.eventName=eventName;
    }

    /**
     * Gets the event id.
     *
     * @return the event id
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * Gets the event type.
     *
     * @return the event type
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Gets the event name.
     *
     * @return the event name
     */
    public String getEventName() {
        return this.eventName;
    }
}
