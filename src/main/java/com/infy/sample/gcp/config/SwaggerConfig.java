package com.infy.sample.gcp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spring.web.plugins.Docket;

import static springfox.documentation.builders.PathSelectors.any;
import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;
import static springfox.documentation.spi.DocumentationType.SWAGGER_2;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket apiDev() {
        return new Docket(SWAGGER_2)
                .groupName("dev")
                .select()
                .apis(basePackage("com.infy.sample.gcp.controller.crud"))
                .paths(any())
                .build();
    }

    @Bean
    public Docket apiProd() {
        return new Docket(SWAGGER_2)
                .groupName("prod")
                .select()
                .apis(basePackage("com.infy.sample.gcp.controller.prod"))
                .paths(any())
                .build();
    }

}
