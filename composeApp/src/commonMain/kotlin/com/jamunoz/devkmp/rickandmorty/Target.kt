package com.jamunoz.devkmp.rickandmorty

expect fun getCurrentTarget():Target

enum class Target {
    Android, Desktop
}

fun isDesktop() = getCurrentTarget() == Target.Desktop
fun isAndroid() = getCurrentTarget() == Target.Android