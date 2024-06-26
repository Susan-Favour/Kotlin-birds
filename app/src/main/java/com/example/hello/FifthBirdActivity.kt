package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFifthBirdBinding
import com.squareup.picasso.Picasso

class FifthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFifthBirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFifthBirdBinding.inflate(layoutInflater)

        setContentView(binding.root)


        binding.btnPrevLast.setOnClickListener{
            finish()
        }

        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1516233758813-a38d024919c5?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzB8fGJpcmRzfGVufDB8fDB8fHww")
            .centerCrop()
            .resize(500,500)
            .into(binding.imageView13)



    }
}