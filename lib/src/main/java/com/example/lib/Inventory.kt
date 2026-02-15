package com.example.lib

class ProductInventory(private val productsList: MutableList<Product>) {

    fun addProducts(productName: String, quantityAdd: Int) {
        productsList.forEach {
            if (it.name == productName) {
                it.quantity += quantityAdd
            }
        }
    }

    fun removeProducts(productName: String, quantityRemove: Int) {
        productsList.forEach {
            if (it.name == productName) {
                if (it.quantity <= quantityRemove) {
                    println("Cannot Remove $quantityRemove from $productName")
                } else {
                    it.quantity -= quantityRemove
                }

            }
        }
    }
    // vælge hvilket product der skal fjerndes på
    // og hvor meget der skal fjernes af det

    fun displayInventory() {
        productsList.forEach {
            println(it)
        }
    }

}

