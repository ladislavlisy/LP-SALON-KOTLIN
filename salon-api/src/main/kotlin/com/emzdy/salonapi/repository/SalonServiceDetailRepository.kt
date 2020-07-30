package com.emzdy.salonapi.repository

import com.emzdy.salonapi.data.SalonServiceDetail
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface SalonServiceDetailRepository : CrudRepository<SalonServiceDetail, Long>
