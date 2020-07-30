package com.emzdy.salonapi.data

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class SalonServiceDetail(@Id @GeneratedValue var id: Long,
                              val description: String,
                              val name: String,
                              val price: Long,
                              val timeInMinutes: Int) {

}