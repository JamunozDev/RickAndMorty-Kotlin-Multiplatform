package com.jamunoz.devkmp.rickandmorty.data.remote.response

import com.jamunoz.devkmp.rickandmorty.data.remote.response.EpisodeResponse
import kotlinx.serialization.Serializable

@Serializable
data class EpisodesWrapperResponse(
    val info: InfoResponse,
    val results:List<EpisodeResponse>
)