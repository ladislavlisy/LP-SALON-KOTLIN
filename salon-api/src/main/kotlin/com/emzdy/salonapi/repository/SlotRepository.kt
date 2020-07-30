package com.emzdy.salonapi.repository

import com.emzdy.salonapi.data.Slot
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface SlotRepository : CrudRepository<Slot, Long>