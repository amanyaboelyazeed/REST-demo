package com.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Configuration
//@PropertySource("classpath:application.properties")
public class MongoJPAConfig extends AbstractMongoConfiguration {

    @Override
    public MongoClient mongoClient() {
        return null;
    }

    @Override
    protected String getDatabaseName() {
        return null;
    }
}
