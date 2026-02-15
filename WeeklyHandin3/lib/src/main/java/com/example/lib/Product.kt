package com.example.lib

class Product (
    val name: String,
    var quantity: Int
){
    override fun toString(): String {
        return "Product(name='$name', quantity=$quantity)"
    }
}