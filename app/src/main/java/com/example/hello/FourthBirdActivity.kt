package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.FourthBirdBinding
import com.squareup.picasso.Picasso

class FourthBirdActivity : AppCompatActivity() {
    lateinit var binding: FourthBirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnPrev3.setOnClickListener{
            finish()
        }

        binding.btnNext4.setOnClickListener{
            val intent = Intent ( this, FifthBirdActivity::class.java )
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1445820200644-69f87d946277?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzJ8fGJpcmRzfGVufDB8fDB8fHww")
            .centerCrop()
            .resize(500,500)
            .into(binding.imageView5)
    }
}