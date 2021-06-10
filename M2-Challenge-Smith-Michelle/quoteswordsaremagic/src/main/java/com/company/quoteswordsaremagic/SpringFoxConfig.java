package com.company.quoteswordsaremagic;
// .apis ...basePackage("com.company.quotesWordsAreMagic")) should match

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

//go to your local host
//http://localhost:8080/v3/api-docs
//View page source
//copy info and paste in https://editor.swagger.io/ and save yaml file and save in the root folder of the java project

@Configuration
public class SpringFoxConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.company.quotesWordsAreMagic"))
                .paths(PathSelectors.any())
                .build();
    }
}