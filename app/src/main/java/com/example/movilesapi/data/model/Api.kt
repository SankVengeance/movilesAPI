package com.example.movilesapi.data.model
import retrofit2.http.GET


interface Api {

    @GET("products")
    suspend fun getProductsList(): Product

    companion object{
        const val BASE_URL = "https://dummyjson.com/"
    }

    // @GET("products/{type}")
    //suspend fun getProductsList(
    //       @Path("type") type: String,
    //        @Query("page") page: int,
    //        @Query("api_key") apiKey: String
    //): Products
}
