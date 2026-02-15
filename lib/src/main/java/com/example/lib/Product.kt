package com.example.lib

/*
Create a product inventory system where each product has a name and a quantity.
Implement functions to add products, remove products, and display the current inventory.
 */
class Product(
    public val name: String,
    public var quantity: Int
) {
    override fun toString(): String {
        return "Product(name='$name', quantity=$quantity)"
    }
}

