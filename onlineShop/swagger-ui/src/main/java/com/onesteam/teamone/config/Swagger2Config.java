package com.onesteam.teamone.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2Config {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.onesteam.teamone.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    @SuppressWarnings("deprecation")
    private ApiInfo apiInfo () {
        return new ApiInfoBuilder()
                .title("teamone测试swagger")
                .description("测试用api")
                .contact("测试")
                .version("1.0")
                .build();
    }

}
