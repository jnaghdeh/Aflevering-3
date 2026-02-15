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
open class Vehicle(
    val brand: String, ----------- Ændret fra var til val
    var speed: Int
) {
    fun accelerate() {
        speed += 10
        println("$brand speeds up to $speed km/h")
    }

    open fun honk() {
        println("Beep!")
    }
}

class Car(
    brand: String,
    speed: Int,
    var fuelLevel: Int
) : Vehicle(brand, speed) {

    override fun honk() {
        println("$brand goes: HONK HONK!")
    }
}

class Bike(
    brand: String,
    speed: Int,
    var bellSound: String
) : Vehicle(brand, speed) {
}


// ------------ Manager ---------------

class TrafficManager {

    val vehicles: MutableList<Vehicle> = mutableListOf()

    fun register(vehicle: Vehicle) {
        vehicles.add(vehicle)
    }

    fun updateTraffic() {
        for (v in vehicles) {
            v.accelerate()

            if (v is Car) { -------------- Man kunne evt. bruge when i stedet for if. Så man ikke behøver at skrive if hver gang til de fforskellige vehicles
                v.fuelLevel -= 5
                println("${v.brand} fuel left: ${v.fuelLevel}")
            }

            if (v is Bike) {
                println("${v.brand} rings the bell: ${v.bellSound}")
            }

            if (v.speed > 120) {
                println("${v.brand} is going too fast!")
            }
        }
    }
}


// --------------- App -----------------

fun main() {
    val manager = TrafficManager()
    manager.register(Car("Toyota", 50, fuelLevel = 80))
    manager.register(Bike("Giant", 20, bellSound = "Ring ring!"))

    manager.updateTraffic()
}
     */

}