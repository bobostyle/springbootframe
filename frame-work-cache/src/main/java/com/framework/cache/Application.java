package com.framework.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by cbb on 2017/12/27.
 */

@SpringBootApplication
@ComponentScan("com.framework")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}