package com.msp.util;

public enum PartnerManageEnum {

    CREATE_POLICY_GROUP("PMS_PRT_115", AuditConstant.AUDIT_SYSTEM, "CREATE POLICY GROUP",
            "Creating policy group ", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    CREATE_POLICY_GROUP_SUCCESS("PMS_PRT_215", AuditConstant.AUDIT_SYSTEM, "CREATE POLICY GROUP",
            "Created policy group ", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    CREATE_POLICY_GROUP_FAILURE("PMS_PRT_475", AuditConstant.AUDIT_SYSTEM, "CREATE POLICY GROUP",
            "Created policy group ", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_POLICY_GROUP("PMS_PRT_116", AuditConstant.AUDIT_SYSTEM, "GET POLICY GROUP",
            "Getting policy group ", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_ALL_POLICY_GROUPS("PMS_PRT_116", AuditConstant.AUDIT_SYSTEM, "GET ALL POLICY GROUPS",
            "Getting all policy groups ", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_POLICY_GROUP_SUCCESS("PMS_PRT_216", AuditConstant.AUDIT_SYSTEM, "CREATE POLICY GROUP",
            "GET policy group success ", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_POLICY_GROUP_FAILURE("PMS_PRT_416", AuditConstant.AUDIT_SYSTEM, "CREATE POLICY GROUP",
            "getting policy group failure", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    UPDATE_POLICY_GROUP("PMS_PRT_156", AuditConstant.AUDIT_SYSTEM, "UPDATE POLICY GROUP",
            "Updating policy group ", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    UPDATE_POLICY_GROUP_SUCCESS("PMS_PRT_256", AuditConstant.AUDIT_SYSTEM, "CREATE POLICY GROUP",
            "UPDATE policy group success ", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    UPDATE_POLICY_GROUP_FAILURE("PMS_PRT_456", AuditConstant.AUDIT_SYSTEM, "CREATE POLICY GROUP",
            "UPDATE policy group failure", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    CREATE_POLICY("PMS_PRT_137", AuditConstant.AUDIT_SYSTEM, "CREATE POLICY",
            "Creating policy", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    CREATE_POLICY_SUCCESS("PMS_PRT_237", AuditConstant.AUDIT_SYSTEM, "CREATE POLICY",
            "Created policy success", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    CREATE_POLICY_FAILURE("PMS_PRT_437", AuditConstant.AUDIT_SYSTEM, "CREATE POLICY ",
            "Created policy failed", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_POLICY("PMS_PRT_187", AuditConstant.AUDIT_SYSTEM, "GET POLICY ",
            "Getting policy", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_POLICY_APIKEY("PMS_PRT_188", AuditConstant.AUDIT_SYSTEM, "GET POLICY FOR APIKEY ",
            "Getting policy for apikey", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_PARTNER_POLICY("PMS_PRT_189", AuditConstant.AUDIT_SYSTEM, "GET PARTNER MAPPED POLICY ",
            "Getting partner mapped policy", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    SEARCH_POLICY("PMS_PRT_190", AuditConstant.AUDIT_SYSTEM, "SEARCH POLICY ",
            "Searching policy", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_CONFIG_VALUE("PMS_PRT_191", AuditConstant.AUDIT_SYSTEM, "GET CONFIG VALUE ",
            "Getting config value", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    FILTERVALUES_POLICY_GROUP("PMS_PRT_192", AuditConstant.AUDIT_SYSTEM, "FILTERVALUES POLICY GROUP",
            "Filtering policy group", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    FILTERVALUES_POLICY("PMS_PRT_193", AuditConstant.AUDIT_SYSTEM, "FILTERVALUES POLICY GROUP",
            "Filtering policy", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    SEARCH_POLICY_GROUP("PMS_PRT_194", AuditConstant.AUDIT_SYSTEM, "SEARCH POLICY GROUP ",
            "Searching policy group", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_ALL_POLICIES("PMS_PRT_187", AuditConstant.AUDIT_SYSTEM, "GET ALL POLICIES ",
            "Getting all policies", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_POLICY_SUCCESS("PMS_PRT_287", AuditConstant.AUDIT_SYSTEM, "CREATE POLICY ",
            "GET policysuccess ", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_POLICY_FAILURE("PMS_PRT_487", AuditConstant.AUDIT_SYSTEM, "CREATE POLICY ",
            "getting policy failure", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    UPDATE_POLICY("PMS_PRT_183", AuditConstant.AUDIT_SYSTEM, "UPDATE POLICY ",
            "Updating policy", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    UPDATE_POLICY_STATUS("PMS_PRT_184", AuditConstant.AUDIT_SYSTEM, "UPDATE POLICY STATUS",
            "Updating policy status", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    UPDATE_POLICY_SUCCESS("PMS_PRT_283", AuditConstant.AUDIT_SYSTEM, "UPDATE POLICY ",
            "UPDATE policy success ", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    UPDATE_POLICY_FAILURE("PMS_PRT_483", AuditConstant.AUDIT_SYSTEM, "UPDATE POLICY ",
            "UPDATE policy failure", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    PUBLISH_POLICY("PMS_PRT_157", AuditConstant.AUDIT_SYSTEM, "PUBLISH POLICY",
            "Publishing policy", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    API_KEY_MAPPING("PMS_PRT_179", AuditConstant.AUDIT_SYSTEM, "GET API KEY MAPPING",
            "Getting api and key mappings", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    API_KEY_MAPPING_SUCCESS("PMS_PRT_279", AuditConstant.AUDIT_SYSTEM, "GET API KEY MAPPING",
            "Getting api and key mappings successfully", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    API_KEY_MAPPING_FAILURE("PMS_PRT_779", AuditConstant.AUDIT_SYSTEM, "GET API KEY MAPPING",
            "Getting api and key mappings failed", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    ACTIVATE_DEACTIVATE_KYC_PARTNERS("PMS_PRT_189", AuditConstant.AUDIT_SYSTEM, " AUTH KYC Partners",
            "Activating/Deactivating kyc partners", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    ACTIVATE_DEACTIVATE_KYC_PARTNERS_SUCCESS("PMS_PRT_289", AuditConstant.AUDIT_SYSTEM, " AUTH KYC Partners",
            "Activating/Deactivating kyc partners success", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    ACTIVATE_DEACTIVATE_KYC_PARTNERS_FAILURE("PMS_PRT_789", AuditConstant.AUDIT_SYSTEM, " AUTH KYC Partners",
            "Activating/Deactivating kyc partners failure", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    ACTIVATE_DEACTIVATE_API_PARTNERS("PMS_PRT_199", AuditConstant.AUDIT_SYSTEM, "API KYC Partners",
            "Activating/Deactivating api partners", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    ACTIVATE_DEACTIVATE_API_PARTNERS_SUCCESS("PMS_PRT_299", AuditConstant.AUDIT_SYSTEM, "API KYC Partners",
            "Activating/Deactivating api partners", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    ACTIVATE_DEACTIVATE_API_PARTNERS_FAILED("PMS_PRT_799", AuditConstant.AUDIT_SYSTEM, "API KYC Partners",
            "Activating/Deactivating api partners", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_PARTNER_POLICY_MAPPING("PMS_PRT_191", AuditConstant.AUDIT_SYSTEM, "GET Partners Policy Mapping",
            "Getting partners policy mapping", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_PARTNER_POLICY_MAPPING_SUCCESS("PMS_PRT_291", AuditConstant.AUDIT_SYSTEM, "GET Partners Policy Mapping",
            "Getting partners policy mapping success", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_PARTNER_POLICY_MAPPING_FAILURE("PMS_PRT_791", AuditConstant.AUDIT_SYSTEM, "GET Partners Policy Mapping",
            "Getting partners policy mapping failure", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    APPROVE_REJECT_PARTNER_API("PMS_PRT_181", AuditConstant.AUDIT_SYSTEM, "Approve Reject Partner",
            "Approve Reject Partner", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    APPROVE_REJECT_PARTNER_API_SUCCESS("PMS_PRT_281", AuditConstant.AUDIT_SYSTEM, "Approve Reject Partner",
            "Approve Reject Partner successfull", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    APPROVE_REJECT_PARTNER_API_FAILURE("PMS_PRT_781", AuditConstant.AUDIT_SYSTEM, "Approve Reject Partner",
            "Approve Reject Partner failure", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_PARTNER_POLICY_GROUP("PMS_PRT_171", AuditConstant.AUDIT_SYSTEM, "Get Partner",
            "Get partner for policy group", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_PARTNER_POLICY_GROUP_SUCCESS("PMS_PRT_271", AuditConstant.AUDIT_SYSTEM, "Get Partner",
            "Get partner for policy group success", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_PARTNER_POLICY_GROUP_FAILURE("PMS_PRT_771", AuditConstant.AUDIT_SYSTEM, "Get Partner",
            "Get partner for policy group failure", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_PARTNER_FOR_ID("PMS_PRT_161", AuditConstant.AUDIT_SYSTEM, "Get Partner",
            "Get partner for partner id", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_PARTNER_FOR_ID_SUCCESS("PMS_PRT_261", AuditConstant.AUDIT_SYSTEM, "Get Partner",
            "Get partner for partner id success", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_PARTNER_FOR_ID_FAILURE("PMS_PRT_761", AuditConstant.AUDIT_SYSTEM, "Get Partner",
            "Get partner for partner id failure", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_PARTNER("PMS_PRT_151", AuditConstant.AUDIT_SYSTEM, "Get Partner",
            "Get partner ", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_PARTNER_SUCCESS("PMS_PRT_251", AuditConstant.AUDIT_SYSTEM, "Get Partner",
            "Get partner success", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_PARTNER_FAILURE("PMS_PRT_751", AuditConstant.AUDIT_SYSTEM, "Get Partner",
            "Get partner failure", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    CREATE_PARTNER_CERTIFICATE("PMS_PRT_151", AuditConstant.AUDIT_SYSTEM, "Create Partner Certificate",
            "Create Partner Certificate ", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
                        "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    CREATE_PARTNER_CERTIFICATE_SUCCESS("PMS_PRT_251", AuditConstant.AUDIT_SYSTEM, "Create Partner Certificate",
            "Create Partner Certificate success", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
                                "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    CREATE_PARTNER_CERTIFICATE_FAILURE("PMS_PRT_751", AuditConstant.AUDIT_SYSTEM, "Create Partner Certificate",
            "Create Partner Certificate failure", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
                                "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),





    DELETE_POLICY_GROUP("PMS_PRT_752", AuditConstant.AUDIT_SYSTEM, "Delete Policy Group",
            "Delete Policy Group", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    DELETE_POLICY_GROUP_SUCCESS("PMS_PRT_753", AuditConstant.AUDIT_SYSTEM, "Delete Policy Group",
            "Delete Policy Group Success", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    DELETE_POLICY_GROUP_FAILURE("PMS_PRT_754", AuditConstant.AUDIT_SYSTEM, "Delete Policy Group",
            "Delete Policy Group Failure", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),

    REJECT_POLICY("PMS_PRT_755", AuditConstant.AUDIT_SYSTEM, "Reject Policy",
            "Reject policy", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),

    GET_ALL_TSP_PARTNER("PMS_PRT_756", AuditConstant.AUDIT_SYSTEM, "Get All TSP Partner",
            "Get All TSP Partner", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    CREATE_PARTNER("PMS_PRT_757", AuditConstant.AUDIT_SYSTEM, "Create Partner",
            "Create Partner", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    CREATE_PARTNER_SUCCESS("PMS_PRT_758", AuditConstant.AUDIT_SYSTEM, "Create Partner",
            "Create Partner Success", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    CREATE_PARTNER_FAILURE("PMS_PRT_759", AuditConstant.AUDIT_SYSTEM, "Create Partner",
            "Create Partner Failure", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    CREATE_ROOT_OR_INTERMEDIATE_CERTIFICATE("PMS_PRT_760", AuditConstant.AUDIT_SYSTEM, "Create Root or Intermediate Certificate",
            "Create Root or Intermediate Certificate", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    CREATE_ROOT_OR_INTERMEDIATE_CERTIFICATE_SUCCESS("PMS_PRT_762", AuditConstant.AUDIT_SYSTEM, "Create Root or Intermediate Certificate",
            "Create Root or Intermediate Certificate Success", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    CREATE_ROOT_OR_INTERMEDIATE_CERTIFICATE_FAILURE("PMS_PRT_763", AuditConstant.AUDIT_SYSTEM, "Create Root or Intermediate Certificate",
            "Create Root or Intermediate Certificate Failure", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),

    CREATE_SIGNED_CERTIFICATE("PMS_PRT_764", AuditConstant.AUDIT_SYSTEM, "Create Signed Certificate",
            "Create Signed Certificate", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    CREATE_SIGNED_CERTIFICATE_SUCCESS("PMS_PRT_765", AuditConstant.AUDIT_SYSTEM, "Create Signed Certificate",
            "Create Signed Certificate Success", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    CREATE_SIGNED_CERTIFICATE_FAILURE("PMS_PRT_766", AuditConstant.AUDIT_SYSTEM, "Create Signed Certificate",
            "Create Signed Certificate Failure", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    GET_POLICIES_BY_POLICY_GROUP_ID("PMS_PRT_767", AuditConstant.AUDIT_SYSTEM, "Get Policies By Group ID",
            "Get Policies By Group ID", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),

    TSP_LICENSE_KEY("PMS_PRT_768", AuditConstant.AUDIT_SYSTEM, "GENERATE TSP LICENSE KEY",
            "Generate TSP License Key", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    TSP_LICENSE_KEY_SUCCESS("PMS_PRT_769", AuditConstant.AUDIT_SYSTEM, "GENERATE TSP LICENSE KEY",
            "Generate TSP License Key successfully", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),
    TSP_LICENSE_KEY_FAILURE("PMS_PRT_770", AuditConstant.AUDIT_SYSTEM, "GENERATE TSP LICENSE KEY",
            "Generate TSP License Key failed", AuditConstant.PARTNER_MODULE_ID, AuditConstant.PARTNER_MODULE_NAME, "NO_ID",
            "NO_ID_TYPE", AuditConstant.APPLICATION_NAME, AuditConstant.APPLICATION_ID),;




    private final String eventId;

    private final String type;

    private String name;

    private String description;

    private String moduleId;

    private String moduleName;

    private String id;

    private String idType;

    private String applicationId;

    private String applicationName;

    private PartnerManageEnum(String eventId, String type, String name, String description, String moduleId,
                              String moduleName, String id, String idType, String applicationId, String applicationName) {
        this.eventId = eventId;
        this.type = type;
        this.name = name;
        this.description = description;
        this.moduleId = moduleId;
        this.moduleName = moduleName;
        this.id = id;
        this.idType = idType;
        this.applicationId = applicationId;
        this.applicationName = applicationName;

    }

    public String getEventId() {
        return eventId;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getModuleId() {
        return moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getId() {
        return id;
    }

    public String getIdType() {
        return idType;
    }

    public void setDescription(String des) {
        this.description = des;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApplicationName() {
        return applicationName;
    }

    /*
     * Replace %s value in description and id with second parameter passed
     */
    public static PartnerManageEnum getPartnerManageEnumWithValue(PartnerManageEnum e, String s) {
        e.setDescription(String.format(e.getDescription(), s));
        if (e.getId().equalsIgnoreCase("%s"))
            e.setId(s);
        return e;
    }
}
