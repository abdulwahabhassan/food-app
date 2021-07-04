package com.devhassan.foodapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.devhassan.foodapp.R
import com.devhassan.foodapp.databinding.ItemFoodBinding

class FoodMenuRecyclerviewAdapter :
    RecyclerView.Adapter<FoodMenuRecyclerviewAdapter.FoodMenuViewHolder>() {

    private var foodList = arrayListOf<Food>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodMenuViewHolder {
        val viewBinding = ItemFoodBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FoodMenuViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: FoodMenuViewHolder, position: Int) {
        val food = foodList[position]
        holder.bind(food)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    class FoodMenuViewHolder(private val itemBinding: ItemFoodBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind (food: Food) = with(itemBinding){
            itemFoodTitleTextView.text = food.name
            itemFoodImageView.setImageResource(food.image)
            itemFoodDescriptionTextView.text = food.description
            itemFoodPriceTextView.text = food.price.toString()

        }

    }

    fun setData(foodList: ArrayList<Food>) {
        this.foodList = foodList
        notifyDataSetChanged()
    }

}