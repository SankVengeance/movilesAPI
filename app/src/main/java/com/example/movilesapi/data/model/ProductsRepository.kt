package com.example.movilesapi.data.model

import kotlinx.coroutines.flow.Flow

interface ProductsRepository {
    suspend fun  getProdductsList(): Flow<Result<List<Products>>>
}