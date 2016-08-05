package me.archerding.services.dao

import me.archerding.services.bean.Customer
import org.springframework.data.repository.CrudRepository

/**
 * Created by archerding on 16-8-5.
 */
interface CustomerRepository : CrudRepository<Customer, Long> {
    fun findByLastName(name: String): List<Customer>
}