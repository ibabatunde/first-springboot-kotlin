package com.example.SpringBootKotlinDemo

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Hotel(val name: String, val classification: Int, val nbRoom: Int) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int = 0
    var nbFreeRooms: Int = this.nbRoom

    fun checkIn(nbGuest: Int){
        if (nbFreeRooms > nbGuest){
            this.nbFreeRooms -= nbGuest
        }
    }

    fun checkOut(nbGuest: Int){
        this.nbFreeRooms += nbGuest
    }

}