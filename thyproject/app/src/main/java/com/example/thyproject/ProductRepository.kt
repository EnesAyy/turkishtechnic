package com.example.thyproject

import com.example.thyproject.network.RetrofitInstance

class ProductRepository {
    suspend fun getProducts(): List<Product> {
        return RetrofitInstance.api.getProducts()
    }
}
