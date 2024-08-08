package com.example.supletorio.repository

import com.example.supletorio.entity.Player
import org.springframework.data.jpa.repository.JpaRepository

interface PlayerRepository: JpaRepository<Player, Long?> {
}