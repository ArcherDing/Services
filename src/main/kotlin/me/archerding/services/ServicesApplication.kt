package me.archerding.services

import me.archerding.services.bean.Customer
import me.archerding.services.dao.CustomerRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class ServicesApplication {
    @Bean
    open fun init(repository: CustomerRepository): CommandLineRunner {
        return CommandLineRunner {
            repository.save(Customer("Jack", "Bauer"))
            repository.save(Customer("Chloe", "O'Brian"))
            repository.save(Customer("Kim", "Bauer"))
            repository.save(Customer("David", "Palmer"))
            repository.save(Customer("Michelle", "Dessler"))
        }
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(ServicesApplication::class.java, *args)
}
