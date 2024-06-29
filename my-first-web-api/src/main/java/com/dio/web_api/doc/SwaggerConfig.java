package com.dio.web_api.doc;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private Contact contato() {
        return new Contact(
                "Andrei R da Silva",
                "https://www.localhost:8080",
                "silva.andrei@outlook.com.br");
    }

    private ApiInfoBuilder infoBuilderApi() {

        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

        apiInfoBuilder.title("Rest API e Swagger");
        apiInfoBuilder.description("Testando Springboot REST API e documentando com Swagger");
        apiInfoBuilder.version("1.0");
        apiInfoBuilder.termsOfServiceUrl("Termos de uso: Open Source");
        apiInfoBuilder.license("Licença - EU");
        apiInfoBuilder.licenseUrl("https://www.localhost:8080");
        apiInfoBuilder.contact(this.contato());

        return apiInfoBuilder;
    }

    @Bean
    public Docket detalheApi(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        docket
            .select()
            .apis(RequestHandlerSelectors.basePackage("dio.web_api.controller"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(this.infoBuilderApi().build())
            .consumes(new HashSet<String>(Arrays.asList("aplication/json")))
            .produces(new HashSet<String>(Arrays.asList("aplication/json")));

            return docket;
    }
}
