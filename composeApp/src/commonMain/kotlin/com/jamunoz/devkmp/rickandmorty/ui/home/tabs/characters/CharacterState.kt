package com.jamunoz.devkmp.rickandmorty.ui.home.tabs.characters

import app.cash.paging.PagingData
import com.jamunoz.devkmp.rickandmorty.domain.model.CharacterModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

data class CharacterState(
    val characterOfTheDay: CharacterModel?=null,
    val characters: Flow<PagingData<CharacterModel>> = emptyFlow()
)