package com.dno2reload.config;

import com.dno2reload.config.condition.DatabaseType;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

@Configuration
@Profile("mongo")
@ComponentScan("com.dno2reload.domain.mongo")
@EnableConfigurationProperties
public class MongoDbConfig {

    @Bean
    @DatabaseType("mongo")
    @ConfigurationProperties(prefix="spring.data.mongodb")
    public MongoRepository bookingRepository() {
        return null;
    }



}
