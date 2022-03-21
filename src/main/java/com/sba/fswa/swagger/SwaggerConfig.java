package com.sba.fswa.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.function.Predicate;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * API General Info setup
     * @return ApiInfo object with title, desc, TOS, contact, and license
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("User REST API")
                .description("User CRUD API for managing user details and credentials")
                .termsOfServiceUrl("https://tos.esarnb.com")
                .licenseUrl("contact@esarnb.com").version("1.0").build();
    }

    /**
     * Use predicate to gather and filter results
     * @return return a list of endpoints that are crud requests
     */
    private Predicate<String> postPaths() {
        // Predicates can be used to return boolean value
        // But we use it through regex to get all instances of post requests
        return regex("/api.*");
    }

    /**
     * Create a swagger docket instance using Bean and set endpoints
     * @return Return Swagger Docket
     */
    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                // name our swagger docket instance
                .groupName("public-api")
                // retrieve the apiSelectorBuilder to control exposed endpoints
                .apiInfo(apiInfo()).select()
                // load potential paths into the swagger docket
                .paths(postPaths()).build();
    }
}
