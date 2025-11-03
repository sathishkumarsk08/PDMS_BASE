package com.msp.common;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.UUID;

public final class Transaction {
    public static String generateTransaction() {
        final String[] uid = splitting(UUID.randomUUID().toString());
        final String[] time = splitting(LocalDate.now().toString());
        if (uid.length == 5 && time.length == 3) {
            return uid[uid.length - 1] + concatTheArray(time);
        } else {
            return generateSecureRandom(20);
        }
    }

    private static String generateSecureRandom(int digits) {
        final String value = "0123456789qazwsxedcrfvtgbyhn0123456789ujmiklopAQZWSXEDCR0123456789FVTGBYHNUJIMKOLP";
        StringBuilder result = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < digits; i++) {
            int a = secureRandom.nextInt(value.length());
            result.append(value.charAt(a));
        }
        return result.toString();
    }

    private static String[] splitting(String value) {
        return value.split("-");
    }

    private static String concatTheArray(String[] time) {
        StringBuilder value = new StringBuilder();
        for (String s : time) {
            value.append(s);
        }
        return value.toString();
    }
}
