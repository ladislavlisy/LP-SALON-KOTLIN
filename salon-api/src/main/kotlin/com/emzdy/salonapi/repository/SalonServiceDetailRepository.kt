package com.emzdy.salonapi.repository

import com.emzdy.salonapi.data.SalonServiceDetail
import org.springframework.stereotype.Repository

@Repository
class SalonServiceDetailRepository {
    val serviceDetails: MutableList<SalonServiceDetail> = ArrayList()
    fun findById(id: Long): SalonServiceDetail? {
        return serviceDetails.singleOrNull { it.id == id }
    }
    fun findAll(): List<SalonServiceDetail> {
        return serviceDetails
    }
    fun save(detail: SalonServiceDetail): SalonServiceDetail {
        detail.id = serviceDetails.size.toLong() + 1
        serviceDetails.add(detail)
        return detail
    }
    fun update(detail: SalonServiceDetail): SalonServiceDetail {
        val index = serviceDetails.indexOf(detail)
        serviceDetails[index] = detail
        return detail
    }
    fun removeById(id: Long): Boolean {
        return serviceDetails.removeIf { it.id == id }
    }
}