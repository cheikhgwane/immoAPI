package com.project.immo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ConfigurationProperties(prefix = "datasource")
@EnableJpaRepositories("com.project.immo.repository")
@EnableTransactionManagement
public class DatabaseConfiguration {

}
