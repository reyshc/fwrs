package com.hakin.gamelife;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("com.hakin.gamelife.dao")
@SpringBootApplication
public class FwrmsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(FwrmsApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        setRegisterErrorPageFilter(false);
        return builder.sources(FwrmsApplication.class);
    }

}
