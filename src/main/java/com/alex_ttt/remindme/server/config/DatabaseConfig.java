package com.alex_ttt.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

/**
 * Created by user on 11.10.2016.
 */

@Configuration
@EnableJpaRepositories("com.alex_ttt.remindme.server.repository")
@EnableTransactionManagement
@PropertySource("classpath: db.properties")
@ComponentScan("com.alex_ttt.remindme.server")
public class DatabaseConfig {

    @Resource
    private Environment env;
}
