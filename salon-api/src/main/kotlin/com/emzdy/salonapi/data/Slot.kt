package com.emzdy.salonapi.data

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Slot(@Id @GeneratedValue var id: Long,
                val confirmedAt: Date,
                val lockedAt: Date,
                val slotFor: Date,
                val status: Int,
                val stylistName: String,
                val selectedServiceId: Long) {

}