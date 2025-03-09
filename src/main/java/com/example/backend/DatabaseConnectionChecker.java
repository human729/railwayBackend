package com.example.backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class DatabaseConnectionChecker {

    private static final Logger logger = LoggerFactory.getLogger(DatabaseConnectionChecker.class);

    @Value("${PGHOST}")
    private String pgHost;

    @Value("${PGPORT}")
    private String pgPort;

    @Value("${PGDATABASE}")
    private String pgDatabase;

    @Value("${PGUSER}")
    private String pgUser;

    @Value("${PGPASSWORD}")
    private String pgPassword;


    @EventListener(ApplicationReadyEvent.class)
    public void checkDatabaseConnection() {
        logger.info("---------------------------------------------");
        logger.info("Database Connection Settings:");
        logger.info("PGHOST: {}", pgHost);
        logger.info("PGPORT: {}", pgPort);
        logger.info("PGDATABASE: {}", pgDatabase);
        logger.info("PGUSER: {}", pgUser);
        logger.info("---------------------------------------------");
    }
}