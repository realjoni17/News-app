package com.example.newsapp.domain.model

import com.example.newsapp.data.model.SourceDTO

data class Article(
                   val content: String,
                   val description: String,
                   val title: String,
                   val urlToImage: String)
