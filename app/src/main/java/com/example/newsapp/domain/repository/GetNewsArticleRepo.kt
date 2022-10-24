package com.example.newsapp.domain.repository

import com.example.newsapp.domain.model.Article

interface GetNewsArticleRepo {
    suspend fun getNewsArticle():List<Article>
}