package com.example.SpringBootKotlinDemo

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DbSeeder(val hotelRepository: HotelRepository) : CommandLineRunner {

    override fun run(vararg args: String?) {
        this.hotelRepository.deleteAll()

        val ekoHotel = Hotel("Eko hotel", 4, 200)
        val radisonHotel = Hotel("Radison blue hotel", 5, 200)
        val olympiqueHotel = Hotel("Olympique hotel", 3, 200)
        val hotelRwanda = Hotel("Hotel rwanda", 7, 200)

        val hotels = mutableListOf<Hotel>()
        hotels.add(ekoHotel)
        hotels.add(radisonHotel)
        hotels.add(olympiqueHotel)
        hotels.add(hotelRwanda)

//        this.hotelRepository.save(hotels)
        this.hotelRepository.saveAll(hotels)
        print("----Successfully saved----")
    }
}