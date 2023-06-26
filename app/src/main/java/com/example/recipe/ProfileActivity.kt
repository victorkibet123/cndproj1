package com.example.recipe

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.example.recipe.data.Recipe
import com.example.recipe.ui.theme.RecipeTheme

class ProfileActivity : AppCompatActivity() {
    private val recipe: Recipe by lazy {
        intent?.getSerializableExtra(RECIPE_ID) as Recipe
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipeTheme {
                ProfileScreen(recipe =recipe)

            }
        }


    }

    companion object {
        private const val RECIPE_ID = "recipe_id"
        fun newIntent(context: Context, recipe: Recipe) =
            Intent(context, ProfileActivity::class.java).apply {
                putExtra(RECIPE_ID, recipe)
            }

    }
}