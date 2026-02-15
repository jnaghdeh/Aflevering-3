package com.example.lib

import java.time.LocalDateTime

class RedditPost (
   private var author: String,
    private var title: String
){

    private val postDate: LocalDateTime = LocalDateTime.now()
    private var upvotes: Int = 1
    private var downvotes: Int = 0

    fun getAuthor(): String = author
    fun getTitle(): String = title
    fun getPostDate(): LocalDateTime = postDate
    fun getUpvotes(): Int = upvotes
    fun getDownvotes(): Int = downvotes

    fun upvote() {
        upvotes++
    }

    fun downvote() {
        downvotes--
    }

    fun getUpvoteAndDownvoteBalance(): Int {
        return upvotes - downvotes
    }

    override fun toString(): String {
        return "The reddit post, $title by $author, has been posted the $postDate." +
                "The post has right now $upvotes upvotes and $downvotes downvotes. The total balance is ${getUpvoteAndDownvoteBalance()}"
    }
}