package com.example.supletorio.repository

import com.example.supletorio.entity.Team
import org.springframework.data.jpa.repository.JpaRepository

interface TeamRepository: JpaRepository<Team, Long?> {
}