package com.example.h1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.h1.databinding.ActivityInitialBinding

class Initial : AppCompatActivity() {

    private lateinit var binding: ActivityInitialBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = Intent(this,UploadImage::class.java)
        startActivity(intent)
    }
}