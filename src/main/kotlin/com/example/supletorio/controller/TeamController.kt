package com.example.supletorio.controller

import com.example.supletorio.entity.Team
import com.example.supletorio.service.TeamService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/team")
class TeamController {
    @Autowired
    lateinit var teamService: TeamService

    @GetMapping
    fun list(): List<Team> {
        return  teamService.list()

    }
    @GetMapping("/{id}")
    fun getById(@PathVariable id : Long): Team {
        return teamService.getById(id)
    }
    @PostMapping
    fun save(@RequestBody team: Team):Team{
        return teamService.save(team)
    }
    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody team: Team):Team {
        return teamService.update(id, team)
    }
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id:Long):String {
        teamService.delete(id)
        return "Team $id deleted"
    }
}