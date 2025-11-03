package com.msp.common;

public enum ResponseCodes {
        SUCCESS("000","Success"),
        FAILURE("001","Failure"),
        INVAILD_UIN("002","Invalid PSN"),
        UIN_NOT_AVAILABLE("003","PSN Not available in Database"),
        INVAILD_VID("004","Invalid PCN"),
        VID_NOT_AVAILABLE("005","PCN Not available in Database"),
        UNABLE_TOPROCESS("006","Unable to Process");

        private String errorCode;
        private String errorMessages;

        public String getErrorCode() {
            return this.errorCode;
        }

        public String getErrorMessages() {
            return this.errorMessages;
        }

        ResponseCodes(String errorCode, String errorMessages) {
            this.errorCode = errorCode;
            this.errorMessages = errorMessages;
        }
    }


