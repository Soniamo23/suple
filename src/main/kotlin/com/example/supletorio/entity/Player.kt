package com.example.supletorio.entity

import jakarta.persistence.*

@Entity
@Table(name = "player")
class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(name = "full_name", nullable = false)
    var full_Name: String? = null

    var age: Int? = null

    var position: String? = null

    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    var team: Team? = null

}