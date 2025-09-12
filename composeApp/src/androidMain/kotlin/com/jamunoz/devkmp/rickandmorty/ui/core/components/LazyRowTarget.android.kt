package com.jamunoz.devkmp.rickandmorty.ui.core.components

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import app.cash.paging.compose.LazyPagingItems

@Composable
actual fun <T : Any> LazyRowTarget(
    pagingItems: androidx.paging.compose.LazyPagingItems<T>, itemView: @Composable (T) -> Unit
) {
    LazyRow {
        items(pagingItems.itemCount){ pos ->
            pagingItems[pos]?.let { item ->
                itemView(item)
            }
        }
    }
}