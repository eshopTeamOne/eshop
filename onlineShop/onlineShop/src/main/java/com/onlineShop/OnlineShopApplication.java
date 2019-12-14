package com.onlineShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2 @SpringBootApplication public class OnlineShopApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(OnlineShopApplication.class, args);
	}

}
