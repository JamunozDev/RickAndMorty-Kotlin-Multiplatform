package com.jamunoz.devkmp.rickandmorty.di


import com.jamunoz.devkmp.rickandmorty.ui.detail.CharacterDetailViewModel
import com.jamunoz.devkmp.rickandmorty.ui.home.tabs.characters.CharactersViewModel
import com.jamunoz.devkmp.rickandmorty.ui.home.tabs.episodes.EpisodesViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val uiModule = module {
    viewModelOf(::EpisodesViewModel)
    viewModelOf(::CharactersViewModel)
    viewModelOf(::CharacterDetailViewModel)
}
