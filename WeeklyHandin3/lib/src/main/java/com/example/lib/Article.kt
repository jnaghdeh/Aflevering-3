package com.example.lib

public class Article (val author: String, val title: String) {

    override fun toString(): String {
        return "The author of the article, $title, is $author"
    }
}