package com.jamunoz.devkmp.rickandmorty.domain

import com.jamunoz.devkmp.rickandmorty.domain.model.CharacterModel


class GetRandomCharacter(private val repository: Repository) {

    suspend operator fun invoke(): CharacterModel {

        val random: Int = (1..826).random()
        return repository.getSingleCharacter(random.toString())
    }

}
