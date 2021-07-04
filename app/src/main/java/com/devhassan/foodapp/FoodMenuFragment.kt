package com.devhassan.foodapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.devhassan.foodapp.adapter.Food
import com.devhassan.foodapp.adapter.FoodMenuRecyclerviewAdapter
import com.devhassan.foodapp.databinding.FragmentFoodMenuBinding

class FoodMenuFragment : Fragment() {

    private var _binding: FragmentFoodMenuBinding? = null
    private val binding get() = _binding!!
    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFoodMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = binding.foodMenuRecyclerView
        val recyclerViewAdapter = FoodMenuRecyclerviewAdapter()
        recyclerViewAdapter.setData(Food.getListOfFoods())
        recyclerView.adapter = recyclerViewAdapter

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}