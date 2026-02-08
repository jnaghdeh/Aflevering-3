package com.example.lib

fun main() {
    val shoe = Shoe("Nike Air", 799f, 5)
    val tshirt = Tshirt("Basic tee", 199f, 10)
    val book = Book("Harry Potter", 249f, 3)

    shoe.identifyProductCategory()
    tshirt.identifyProductCategory()
    book.identifyProductCategory()
}
