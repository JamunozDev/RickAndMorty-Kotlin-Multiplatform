package com.jamunoz.devkmp.rickandmorty.ui.detail

import com.jamunoz.devkmp.rickandmorty.domain.model.CharacterModel
import com.jamunoz.devkmp.rickandmorty.domain.model.EpisodeModel

data class CharacterDetailState(
    val characterModel: CharacterModel,
    val episodes:List<EpisodeModel>? = null
)