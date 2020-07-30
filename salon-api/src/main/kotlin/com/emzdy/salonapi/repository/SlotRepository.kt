package com.emzdy.salonapi.repository

import com.emzdy.salonapi.data.Slot
import org.springframework.stereotype.Repository

@Repository
class SlotRepository {
    val slots: MutableList<Slot> = ArrayList()
    fun findById(id: Long): Slot? {
        return slots.singleOrNull { it.id == id }
    }
    fun findAll(): List<Slot> {
        return slots
    }
    fun save(slot: Slot): Slot {
        slot.id = slots.size.toLong() + 1
        slots.add(slot)
        return slot
    }
    fun update(slot: Slot): Slot {
        val index = slots.indexOf(slot)
        slots[index] = slot
        return slot
    }
    fun removeById(id: Long): Boolean {
        return slots.removeIf { it.id == id }
    }
}