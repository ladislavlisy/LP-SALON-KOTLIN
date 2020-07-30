package com.emzdy.salonapi.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import com.emzdy.salonapi.config.SalonDetails
import com.emzdy.salonapi.repository.SalonServiceDetailRepository

@RestController
class HomeController(private val rep: SalonServiceDetailRepository, private val homeDetails: SalonDetails) {

    @RequestMapping(value = ["/"], method = [RequestMethod.GET])
    fun getHome(): String {
        val detailsCount : Long = rep.count()
        val detailsName = homeDetails.name
        return "<h1>Hello from: $detailsName</h1>\nSalon Services Count: $detailsCount"
    }
}
