package com.example.newsapp.data.network

import com.example.newsapp.data.model.NewsDTO
import dagger.Provides
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

//https://newsapi.org/v2/everything?q=tesla&from=2022-09-22&sortBy=publishedAt&apiKey=f11bedb84c254537bef81192f7d0b0bc
interface ApiService {
    @GET("top-headlines")
    suspend fun getNewsArticles(
    @Query("country") country:String="us",
    @Query("apiKey") apiKey:String="f11bedb84c254537bef81192f7d0b0bc"
    ): Response<NewsDTO>
}