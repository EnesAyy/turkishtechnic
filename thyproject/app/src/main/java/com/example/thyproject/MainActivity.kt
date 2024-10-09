package com.example.thyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.thyproject.ProductAdapter
import com.example.thyproject.ProductRepository
import com.example.thyproject.ProductViewModel
import com.example.thyproject.ProductViewModelFactory // Import factory
import com.example.thyproject.R

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: ProductViewModel
    private lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = ProductRepository()

        val factory = ProductViewModelFactory(repository)

        viewModel = ViewModelProvider(this, factory).get(ProductViewModel::class.java)

        adapter = ProductAdapter()
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        viewModel.products.observe(this) { productList ->
            adapter.submitList(productList)
        }

        viewModel.fetchProducts()
    }
}
