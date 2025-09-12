package com.jamunoz.devkmp.rickandmorty.ui.core.navigation.bottomnavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jamunoz.devkmp.rickandmorty.ui.core.navigation.CharacterDetail
import com.jamunoz.devkmp.rickandmorty.ui.core.navigation.Routes
import com.jamunoz.devkmp.rickandmorty.ui.home.tabs.characters.CharactersScreen
import com.jamunoz.devkmp.rickandmorty.ui.home.tabs.episodes.EpisodesScreen
import kotlinx.serialization.json.Json

@Composable
fun NavigationBottomWrapper(navController: NavHostController, mainNavController: NavHostController){

    NavHost(navController = navController, startDestination = Routes.Episodes.route){

        composable(route = Routes.Episodes.route){
            EpisodesScreen()
        }

        composable(route = Routes.Characters.route){
            CharactersScreen (
                navigateToDetail = { characterModel ->
                    val encode: String = Json.encodeToString(characterModel)
                    mainNavController.navigate(CharacterDetail(encode))
                }
            )
        }
    }

}