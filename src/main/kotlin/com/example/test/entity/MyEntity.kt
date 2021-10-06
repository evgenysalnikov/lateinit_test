package com.example.test.entity

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class MyEntity {
    @Id
    @Column(name = "id", length = 16, unique = true, nullable = false)
    private val id: UUID? = UUID.randomUUID()

    @Column
    var title:String? = null

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    lateinit var createdAt: LocalDateTime

    @UpdateTimestamp
    @Column(name = "updated_at")
    lateinit var updatedAt: LocalDateTime

    override fun toString(): String {
        return "MyEntity(id=$id, createdAt=$createdAt, updatedAt=$updatedAt)"
    }


}