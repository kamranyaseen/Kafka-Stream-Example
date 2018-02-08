package com.kamranyaseen.kafka.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SleepUtil {

    private static final Logger log = LoggerFactory.getLogger(SleepUtil.class);

    public static void sleepMillis(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            log.error("Interrupted Thread");
            throw new RuntimeException("Interrupted thread");
        }
    }

}
