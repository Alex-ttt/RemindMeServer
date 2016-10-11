package com.alex_ttt.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by user on 11.10.2016.
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.alex_ttt.remindme.server")
public class WebConfig extends WebMvcConfigurerAdapter {

}
