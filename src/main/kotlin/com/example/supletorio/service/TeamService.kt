package com.example.supletorio.service


import com.example.supletorio.entity.Team

import com.example.supletorio.repository.TeamRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TeamService {
    @Autowired
    private lateinit var teamRepository: TeamRepository

    fun list(): List<Team> {
        return teamRepository.findAll()
    }

    fun getById(id: Long): Team {
        return teamRepository.findById(id).orElseThrow { RuntimeException("Character not found!") }
    }

    fun save(team: Team): Team {
        return teamRepository.save(team)
    }

    fun update(id: Long, team: Team): Team {
        val existingTeam = teamRepository.findById(id).orElseThrow { RuntimeException("Character not found") }
        existingTeam.name = team.name
        existingTeam.country = team.country


        return teamRepository.save(existingTeam)
    }

    fun delete(id: Long) {
        if (teamRepository.existsById(id)) {
            teamRepository.deleteById(id)
        } else {
            throw RuntimeException("Character not found")
        }
    }
}
