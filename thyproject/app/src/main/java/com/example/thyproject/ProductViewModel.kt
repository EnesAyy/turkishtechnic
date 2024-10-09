package com.example.thyproject

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ProductViewModel(private val repository: ProductRepository) : ViewModel() {
    val products: MutableLiveData<List<Product>> = MutableLiveData()

    fun fetchProducts() {
        viewModelScope.launch {
            products.value = repository.getProducts()
        }
    }
}
