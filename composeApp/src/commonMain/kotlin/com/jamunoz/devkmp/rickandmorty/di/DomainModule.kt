package com.jamunoz.devkmp.rickandmorty.di

import com.jamunoz.devkmp.rickandmorty.domain.GetRandomCharacter
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val domainModule = module {
    factoryOf(::GetRandomCharacter)

}