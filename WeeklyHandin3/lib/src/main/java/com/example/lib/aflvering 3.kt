package com.example.lib

fun main () {
val articles = listOf(
    Article("Jacob Naghdeh", "Du er på rette spor"),
    Article("Jacob Naghdeh", "Du er på rette spor"),
    Article("Jacob Naghdeh", "Du er på rette spor"),
    Article("Jacob Naghdeh", "Du er på rette spor"),
    Article("Jacob Naghdeh", "Du er på rette spor")
)
    for (Article in articles)
    println(Article)


    val post = RedditPost("Jacob Naghdeh", "Du er på rette spor")
    post.upvote()
    post.upvote()
    post.downvote()
    println(post)


    val frontPage = RedditFrontPage()

    val post1 = RedditPost("Jacob Naghdeh", "Du er på rette spor")
    val post2 = RedditPost("Jacob Naghdeh", "Du er på rette spor")
    val post3 = RedditPost("Jacob Naghdeh", "Du er på rette spor")

    frontPage.addPost(post1)
    frontPage.addPost(post2)
    frontPage.addPost(post3)

    println("Before delete:")
    frontPage.printPosts()

    frontPage.deletePostByIndexNumber(1)

    println("After delete:")
    frontPage.printPosts()


    val words = listOf("Apple", "Computer", "Banana", "Pear", "bag", "Couch", "pillow", "Apple", "Pear", "Couch")

    val wordFrequency: MutableMap<String, Int> = mutableMapOf()

    for (word in words){
        val currentCount = wordFrequency[word]
            ?: 0
        wordFrequency[word] = currentCount + 1
    }

    for ((word, count) in wordFrequency) {
        println("$word: $count")
    }


    val inventory = Inventory()

    val p1 = Product("Apple", 10)
    val p2 = Product("Banana", 20)
    val p3 = Product("Orange", 15)

    inventory.addProduct(p1)
    inventory.addProduct(p2)
    inventory.addProduct(p3)

    println("Current inventory:")
    inventory.displayInventory()

    inventory.removeProduct("Banana")

    println("After removing Banana:")
    inventory.displayInventory()

    /*
    Opgave 6:

     */

}