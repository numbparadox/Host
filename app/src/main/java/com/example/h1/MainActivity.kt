package com.example.h1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.h1.databinding.ActivityInitialBinding
import com.example.h1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
    }
}