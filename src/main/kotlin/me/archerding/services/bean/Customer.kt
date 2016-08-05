package me.archerding.services.bean

import javax.persistence.*

/**
 * Created by archerding on 16-8-5.
 */
@Entity
data class Customer(
        var fisrtName: String = "",
        var lastName: String = "",
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0
)