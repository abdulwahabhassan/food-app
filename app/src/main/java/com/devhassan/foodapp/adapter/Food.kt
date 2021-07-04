package com.devhassan.foodapp.adapter

import com.devhassan.foodapp.R

class Food(
    val name: String,
    val description: String,
    val price: String,
    val image: Int
) {
    companion object {
        fun getListOfFoods(): ArrayList<Food> {
            return arrayListOf(
                Food("French Fries with Sauce",
                    "French fries, or simply fries, chips, finger chips, " +
                            "hot chips or French-fried potatoes, are deep-fried potatoes, " +
                            "which have been cut into batons.",
                    "4,050",
                    R.mipmap.ic_french_fries),
                Food("Fried Rice",
                    "Fried rice is a dish of cooked rice that has been stir-fried in a wok " +
                            "or a frying pan and is usually mixed with other ingredients such as eggs, " +
                            "vegetables, seafood, or meat.",
                    "2,190",
                    R.mipmap.ic_fried_rice),
                Food("Hamburger",
                    "A sandwich consisting of one or more cooked patties of ground meat, " +
                            "usually beef, placed inside a sliced bread roll or bun.",
                    "1,500",
                    R.mipmap.ic_hamburger),
                Food("Jollof Rice",
                    "Jollof, or jollof rice, is a rice dish popular in West Africa. " +
                            "The dish is typically made with long-grain rice, tomatoes, onions, spices, " +
                            "vegetables and meat in a single pot",
                    "6,299",
                    R.mipmap.ic_jollof_rice),
                Food("Noodles",
                    "Noodles are a type of food made from unleavened dough which is rolled flat " +
                            "and cut, stretched or extruded, into long strips or strings.",
                    "900",
                    R.mipmap.ic_noodles),
                Food("Pasta",
                    "A type of food typically made from an unleavened dough of wheat flour " +
                            "mixed with water or eggs, and formed into sheets or other shapes, then cooked " +
                            "by boiling or baking.",
                    "3,000",
                    R.mipmap.ic_pasta),
                Food("Pizza",
                    "Pizza is a type of food that was created in Italy (The Naples area). " +
                            "It is made with different toppings. Some of the most common toppings are " +
                            "cheese, sausages, pepperoni, vegetables, tomatoes, spices and herbs and basil.",
                    "2,300",
                    R.mipmap.ic_pizza),
                Food("Roasted Chicken",
                    "Roast chicken is chicken prepared as food by roasting whether in a " +
                            "home kitchen, over a fire, or with a rotisserie.",
                    "8,499",
                    R.mipmap.ic_roasted_chicken)
            )
        }
    }
}