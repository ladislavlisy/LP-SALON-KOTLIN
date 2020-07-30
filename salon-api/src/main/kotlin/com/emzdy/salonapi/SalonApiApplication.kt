package com.emzdy.salonapi

import com.emzdy.salonapi.controller.HomeController
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ConfigurationPropertiesScan
class SalonApiApplication

fun main(args: Array<String>) {
	runApplication<SalonApiApplication>(*args)
}
