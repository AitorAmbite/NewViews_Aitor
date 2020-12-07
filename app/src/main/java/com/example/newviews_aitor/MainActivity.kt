package com.example.newviews_aitor

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.newviews_aitor.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val boton2 = findViewById<Button>(R.id.button_segunda_manera)
        val usuario = findViewById<EditText>(R.id.editTextUsuario)

        button_primera_manera.setOnClickListener {
            Toast.makeText(this@MainActivity,editTextUsuario.text.toString(),Toast.LENGTH_LONG).show()
        }

        boton2.setOnClickListener {
            Toast.makeText(this@MainActivity,usuario.text.toString(),Toast.LENGTH_LONG).show()
        }
        binding.buttonTerceraManera.setOnClickListener {
            Toast.makeText(this@MainActivity,binding.editTextUsuario.text.toString(),Toast.LENGTH_LONG).show()
        }
    }
}