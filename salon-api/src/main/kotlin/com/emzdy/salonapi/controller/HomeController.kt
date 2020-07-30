package com.emzdy.salonapi.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import com.emzdy.salonapi.config.SalonDetails

@RestController
class HomeController(private val homeDetails: SalonDetails) {

    @RequestMapping(value = ["/"], method = [RequestMethod.GET])
    fun getHome() = "<h1>Hello from: " + homeDetails.name + "</h1>"
}
