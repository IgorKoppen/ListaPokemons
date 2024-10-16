package com.github.igorkoppen.listapokemons.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.github.igorkoppen.listapokemons.data.PokemonRepository

class MainViewModel(repository: PokemonRepository) : ViewModel() {
    val pokemonList = repository.getPokemonList().cachedIn(viewModelScope)
}