package com.example.newsapp.domain.di

import com.example.newsapp.data.network.ApiService
import com.example.newsapp.data.repository.GetNewsArticleRepoImpl
import com.example.newsapp.domain.repository.GetNewsArticleRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DomainModule {

    @Provides
    fun provideGetNewsRepo(apiService: ApiService) :GetNewsArticleRepo {
        return GetNewsArticleRepoImpl(apiService = apiService)
    }
}