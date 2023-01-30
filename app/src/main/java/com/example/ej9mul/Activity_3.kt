package com.example.ej9mul

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ej9mul.databinding.Activity3Binding

class Activity_3 : AppCompatActivity() {
    lateinit var binding: Activity3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        when(intent.getStringExtra("raza")){
            "elfo" -> binding.im1.setImageResource(R.drawable.elfo)
            "humano" -> binding.im1.setImageResource(R.drawable.humano)
            "enano" -> binding.im1.setImageResource(R.drawable.enano)
            "goblin" -> binding.im1.setImageResource(R.drawable.goblin)
        }
        when(intent.getStringExtra("clase")){
            "guerrero" -> binding.im2.setImageResource(R.drawable.guerrero)
            "mago" -> binding.im2.setImageResource(R.drawable.mago)
            "clerigo" -> binding.im2.setImageResource(R.drawable.clerigo)
            "ladron" -> binding.im2.setImageResource(R.drawable.ladron)
        }

        binding.fuerzavar.text = (1..10).random().toString()
        binding.defensavar.text = (1..5).random().toString()
        binding.tamMochilavar.text = "100"
        binding.vidavar.text = "200"
        binding.monederovar.text = "-"
    }

}
