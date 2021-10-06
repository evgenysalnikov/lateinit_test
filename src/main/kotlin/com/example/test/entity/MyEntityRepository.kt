package com.example.test.entity;

import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface MyEntityRepository : JpaRepository<MyEntity, UUID> {
}