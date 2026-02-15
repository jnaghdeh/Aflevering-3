package com.example.lib

class RedditFrontPage {

    private val posts: MutableList<RedditPost> = mutableListOf()

    fun addPost(post: RedditPost) {
        posts.add(post)
    }

    fun deletePostByIndexNumber(index: Int) {
        if (index >=0 && index < posts.size) {posts.removeAt(index)}
        else {println("invalid index: $index")}
    }

    fun printPosts() {
        for ((i, post) in posts.withIndex()) {
            println("[$i] $post")
        }
    }

}