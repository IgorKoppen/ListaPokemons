package com.github.igorkoppen.listapokemons.data.api.model

data class Pokemon(
    val id: Int,
    val name: String,
    val imageUrl: String
)

data class PokemonResponse(
    val results: List<Pokemon>
)