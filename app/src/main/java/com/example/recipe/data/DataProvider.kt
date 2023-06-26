package com.example.recipe.data

import com.example.recipe.R

object DataProvider{
    val recipeList = listOf(
        Recipe(
            id = 1,
            title = "Chapati",
            type= "Snack",
            numberOfPeople = 5,
            difficultyLevel = "beginner",
            ingredients = "3/4KgWheat flour \n" +
                    "2 cups Water\n" +
                    "2 spoon fulls ofSalt \n" +
                    "1/2 liter Cooking oil",
            preparationSteps = "Mix the flour and salt (optional).\n" +
                    "Gradually add water and mix to form a soft dough.\n" +
                    "Knead the dough for 5-7 minutes until smooth and elastic.\n" +
                    "Rest the dough for 15-20 minutes, covered with a damp cloth.\n" +
                    "Divide the dough into small balls and flatten them slightly.\n" +
                    "Roll out each ball into a thin, round circle.\n" +
                    "Heat a griddle or skillet over medium-high heat.\n" +
                    "Cook each chapati for 30 seconds to 1 minute until bubbles form.\n" +
                    "Flip and cook the other side for 30 seconds to 1 minute.\n" +
                    "Apply oil or ghee to each cooked chapati.\n" +
                    "Repeat the rolling, cooking, and oiling process for the remaining dough balls.\n" +
                    "Serve the chapatis hot with your desired accompaniments.",
            recipeImageId = R.drawable.chapati
        ),
        Recipe(
            id = 1,
            title = "Ugali",
            type= "Supper",
            numberOfPeople =5,
            difficultyLevel = "beginner",
            ingredients = "1kg Maize flour \n" +
                    "1 litre of Water",
            preparationSteps = "Water\n" +
                    "\n" +
                    "Measure the ingredients:\n" +

                    "Boil the water:\n" +

                    "Stir vigorously:\n" +

                    "Shape the ugali:\n" +
                    "Serve hot:",
            recipeImageId = R.drawable.ugali
        ),
        Recipe(
            id = 1,
            title = "Rice",
            type= "Lunch",
            numberOfPeople =3,
            difficultyLevel = "beginner",
            ingredients = "1/2 kg Rice\n" +
                    "2 liters of Water",

            preparationSteps = "Measure the rice.\n" +
                    "Rinse the rice.\n" +
                    "Soak the rice (optional).\n" +
                    "Measure the water (use twice the amount of water as the rice).\n" +
                    "Boil the water.\n" +
                    "Add the rice.\n" +
                    "Reduce heat and cover.\n" +
                    "Cook the rice for the recommended time.\n" +
                    "Let it rest for 5-10 minutes.\n" +
                    "Fluff the rice with a fork or rice paddle.\n" +
                    "Serve hot.",
            recipeImageId = R.drawable.rice
        ),
        Recipe(
            id = 1,
            title = "Scrambled egg",
            type= "Breakfast",
            numberOfPeople =2,
            difficultyLevel = "beginner",
            ingredients = "4 large eggs\n" +
                    "1 teaspoon milk or water\n" +
                    "1/4 teaspoon salt\n" +
                    "1/8 teaspoon black pepper\n" +
                    "Butter or oil, for cooking",

            preparationSteps = "Crack the eggs into a bowl. You can use any type of bowl, but a glass or ceramic bowl will work best.\n" +
                    "Add a splash of milk or water. This will help to make the eggs fluffy.\n" +
                    "Whisk the eggs until they are well combined. You can use a fork, whisk, or electric mixer.\n" +
                    "Add salt and pepper to taste.\n" +
                    "Heat a non-stick pan over medium heat. Add a knob of butter or a tablespoon of oil to the pan.\n" +
                    "Pour the egg mixture into the pan. Use a spatula to stir the eggs constantly as they cook.\n" +
                    "Cook the eggs until they are just set, but still soft and creamy. This should take about 2-3 minutes.\n" +
                    "Serve the scrambled eggs immediately. You can enjoy them on their own, or with toast, hash browns, or your favorite breakfast sides.",
            recipeImageId = R.drawable.scrambledegg

        ),

        )
}