package com.onlineShop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages = "com.onlineShop")
@MapperScan("com.onlineShop.dao")
@EnableDiscoveryClient
public class HomeServerApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(HomeServerApplication.class, args);
	}

}
