package com.example.lib

class Inventory {
    private val products: MutableList<Product> = mutableListOf()

    fun addProduct(product: Product) {
        products.add(product)
    }

    fun removeProduct(name: String) {
        val product = products.find { it.name == name }
        if (product != null) {
            products.remove(product)
        } else  {
            println("Product $name blev ikke fundet")
        }
    }

    fun displayInventory() {
        if (products.isEmpty()) {
            println("Inventar er tomt")
        } else  {
            for (product in products) {
                println(product)
            }
        }
    }


}