package com.example.pokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.pokedex.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var b: Bundle? = intent.extras
        var name = b!!.getString("name")
        var des = b!!.getString("description")
        var image = b!!.getInt("image")
        binding.ivIcons.setImageResource(image)
        binding.tvNames.text = name!!
        binding.tvDes.text = des!!


    }
}