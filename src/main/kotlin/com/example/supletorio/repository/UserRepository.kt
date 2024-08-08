package com.example.supletorio.repository

import com.example.supletorio.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository:JpaRepository <UserEntity, Long?> {
    fun findByUsername(username: String): UserEntity?

}