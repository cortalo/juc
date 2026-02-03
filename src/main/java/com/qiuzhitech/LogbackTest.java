package com.qiuzhitech;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j(topic = "c.LogbackTest")
public class LogbackTest {

    public static void main(String[] args) {
//        System.out.println("=== Testing Logger 'c' (DEBUG level) ===");
        log.trace("TRACE message from logger 'c'");
        log.debug("DEBUG message from logger 'c'");
        log.info("INFO message from logger 'c'");
        log.warn("WARN message from logger 'c'");
        log.error("ERROR message from logger 'c'");

    }
}