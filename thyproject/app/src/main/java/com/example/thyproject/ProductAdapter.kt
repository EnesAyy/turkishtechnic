package com.example.thyproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ProductAdapter : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    private var productList: List<Product> = listOf()

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.titleTextView)
        val price: TextView = itemView.findViewById(R.id.priceTextView)
        val description: TextView = itemView.findViewById(R.id.descriptionTextView)
        val image: ImageView = itemView.findViewById(R.id.productImageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]
        holder.title.text = product.title
        holder.price.text = product.price.toString()
        holder.description.text = product.description
        Glide.with(holder.itemView).load(product.image).into(holder.image)
    }

    override fun getItemCount() = productList.size

    fun submitList(list: List<Product>) {
        productList = list
        notifyDataSetChanged()
    }
}

