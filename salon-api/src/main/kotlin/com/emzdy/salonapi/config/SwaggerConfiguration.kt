package com.emzdy.salonapi.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger.web.*
import springfox.documentation.swagger2.annotations.EnableSwagger2
import java.lang.Boolean.FALSE
import java.lang.Boolean.TRUE


@Configuration
class SwaggerConfiguration {
    @Bean
    fun api(): Docket = Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.any())
            .paths(PathSelectors.any())
            .build()

    @Bean
    fun uiConfig(): UiConfiguration = UiConfiguration(TRUE, FALSE,
                1, 1,
                ModelRendering.MODEL, FALSE,
                DocExpansion.LIST, FALSE, null,
                OperationsSorter.ALPHA, FALSE, FALSE,
                TagsSorter.ALPHA, UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS,
                null, null)

    private fun apiInfo(): ApiInfo? = ApiInfoBuilder()
                .title("Springfox salon-api API")
                .description("In this liveProject, you will build an online booking system for a salon and day spa. " +
                             "Historically hairdressing appointments were made through telephones or by directly contacting the administrators. " +
                             "This poses considerable challenges when managing a large number of customers. " +
                             "Digitization of salon services streamlines the process of providing appointments to customers, " +
                             "thereby avoiding logistical and administrative issues and catering to customers in an efficient manner.")
                .termsOfServiceUrl("http://emzdy.io")
                .contact(Contact("emzdy", "", ""))
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com/ladislavlisy/emzdy/blob/master/LICENSE")
                .version("1.0")
                .build()
}

