package me.archerding.services.web

import me.archerding.services.dao.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by archerding on 16-8-5.
 */

@RestController
@RequestMapping("/customer")
class CustomerController @Autowired constructor(val repository: CustomerRepository) {
    @RequestMapping
    fun findAll() = repository.findAll()

    @RequestMapping("/{name}")
    fun findByLastName(@PathVariable name: String) = repository.findByLastName(name)
}