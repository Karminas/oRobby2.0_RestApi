package com.UserApi.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Config {

    @Bean
    public Docket postApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("UAI Laboratorio Robotica y Fisica")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.UserApi.demo"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("oRobby -- User Rest Api Example")
                .description("Working example of how to implement Rest Apis to hook up different services while developing the next iteration of oRobby")
                .termsOfServiceUrl("I dunno bruh")
                .contact(new Contact("Tupac Alejandro Ocampo Orozco", "https://github.com/Karminas", "tupac.ocampo@gmail.com"))
                .license("Java generic licence")
                .licenseUrl("Once again, I dunno bruh")
                .version("1.0")
                .build();
    }
}
