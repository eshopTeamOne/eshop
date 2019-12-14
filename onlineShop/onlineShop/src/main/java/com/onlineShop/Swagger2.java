package com.onlineShop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.List;

/**
 *Swagger2配置类
 * add by zach
 */
@Configuration
public class Swagger2 {
        @Bean
        public Docket createRestApi() {
            //***add by zm 2019/1/11
            ParameterBuilder ticketPar = new ParameterBuilder();
            List<Parameter> pars = new ArrayList<Parameter>();
            ticketPar.name("wsObject").description("认证租户")
                    .modelRef(new ModelRef("string")).parameterType("header")
                    .required(false).build(); //header中的ticket参数非必填
            pars.add(ticketPar.build());
            //*****
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .select()
                    //当前包路径
                    .apis(RequestHandlerSelectors.basePackage("com.tydic.repositoryImage.controller"))
                    .paths(PathSelectors.any())
                    .build()
                    .globalOperationParameters(pars);
        }

        private ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                    //页面标题
                    .title("电商 api")
                    //描述
                    .description("用代码行数来评估程序的开发进度，就好比是拿重量来评估一个飞机的建造进度。            —— 比尔盖茨")
                    .termsOfServiceUrl("")
                    //版本号
                    .version("1.0")
                    .build();
        }

}