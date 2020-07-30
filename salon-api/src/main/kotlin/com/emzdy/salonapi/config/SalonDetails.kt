package com.emzdy.salonapi.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "application.salon")
data class SalonDetails (
        var name: String,
        var address: String,
        var city: String,
        var state: String,
        var zipcode: String,
        var phone: String)
{
}
