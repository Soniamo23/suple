package com.example.supletorio.controller

import com.example.supletorio.entity.Player
import com.example.supletorio.service.PlayerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/player")
class PlayerController {
    @Autowired
    lateinit var playerService: PlayerService

    @GetMapping
    fun list(): List<Player> {
        return  playerService.list()

    }
    @GetMapping("/{id}")
    fun getById(@PathVariable id : Long): Player {
        return playerService.getById(id)
    }
    @PostMapping
    fun save(@RequestBody player: Player):Player {
        return playerService.save(player)
    }
    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody player: Player):Player {
        return playerService.update(id, player)
    }
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id:Long):String {
        playerService.delete(id)
        return "Player $id deleted"
    }
}