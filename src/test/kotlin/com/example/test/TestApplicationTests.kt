package com.example.test

import com.example.test.entity.MyEntity
import com.example.test.entity.MyEntityRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.repository.findByIdOrNull
import java.util.*

@SpringBootTest
class TestApplicationTests {

    @Test
    fun contextLoads(@Autowired myEntityRepository: MyEntityRepository) {
        val entity = MyEntity()
        entity.title = "One"
        myEntityRepository.save(entity)
//        println(entity)
        val fromRepo = myEntityRepository.findByIdOrNull(UUID.fromString("8d3ed738-0eed-4357-b150-9b30373b803e"))
        if (fromRepo is MyEntity) {
            fromRepo.title = UUID.randomUUID().toString()
            myEntityRepository.save(fromRepo)
            println("Saved")
        }
        //here lateinit error --> //println(entity)
    }

}
