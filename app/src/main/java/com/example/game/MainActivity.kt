package com.example.game

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.game.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        binding.cardView.button1.setOnClickListener{

            val intent = Intent(this, Home::class.java)
            intent.putExtra("Flag","True");
            startActivity(intent)
        }
        binding.cardView.button2.setOnClickListener{

            val intent = Intent(this, Home::class.java)
            intent.putExtra("Flag","False");
            startActivity(intent)
        }

        //binding.cardView.textViewTitle.text=" can i ask you a question"
    }
}