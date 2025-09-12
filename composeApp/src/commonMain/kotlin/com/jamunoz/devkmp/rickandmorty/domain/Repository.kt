package com.jamunoz.devkmp.rickandmorty.domain

import app.cash.paging.PagingData
import com.jamunoz.devkmp.rickandmorty.domain.model.CharacterModel
import com.jamunoz.devkmp.rickandmorty.domain.model.EpisodeModel
import kotlinx.coroutines.flow.Flow

interface Repository {
    suspend fun getSingleCharacter(id:String): CharacterModel
    fun getAllCharacters(): Flow<PagingData<CharacterModel>>
    fun getAllEpisodes(): Flow<PagingData<EpisodeModel>>
    suspend fun getEpisodesForCharacter(episodes: List<String>):List<EpisodeModel>
}