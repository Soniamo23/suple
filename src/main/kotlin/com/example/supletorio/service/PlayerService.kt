package com.example.supletorio.service

import com.example.supletorio.entity.Player
import com.example.supletorio.repository.PlayerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PlayerService {
    @Autowired
    private lateinit var playerRepository: PlayerRepository

    fun list(): List<Player> {
        return playerRepository.findAll()
    }

    fun getById(id: Long): Player {
        return playerRepository.findById(id).orElseThrow { RuntimeException("Player not found!") }
    }

    fun save(player: Player): Player {
        return playerRepository.save(player)
    }

    fun update(id: Long, player: Player): Player {
        val existingPlayer = playerRepository.findById(id).orElseThrow { RuntimeException("Pñayer not found") }
        existingPlayer.full_Name = player.full_Name
        existingPlayer.age = player.age
        existingPlayer.position = player.position

        return playerRepository.save(existingPlayer)
    }

    fun delete(id: Long) {
        if (playerRepository.existsById(id)) {
            playerRepository.deleteById(id)
        } else {
            throw RuntimeException("Player not found")
        }
    }
}

